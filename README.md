# Game Character Builder — Builder Design Pattern

A Java implementation of the **Builder** design pattern. The same construction
steps — character class, weapon, armor, health points — are reused to produce
**two different representations** of a game character:

1. A strongly-typed, immutable `GameCharacter` object.
2. A human-readable text **Character Sheet** (RPG-style stat sheet).

## Why Builder?

Instead of one giant constructor with four positional parameters (easy to
mix up and impossible to extend cleanly), a fluent builder assembles the
character step by step, validates it before it's created, and can produce
more than one kind of output from the exact same steps.

## Project Structure

```
├── CharacterBuilder.java          # Builder interface (fluent contract)
├── CharacterObjectBuilder.java    # Concrete builder #1 -> GameCharacter object
├── CharacterSheetBuilder.java     # Concrete builder #2 -> text character sheet
├── GameCharacter.java             # Immutable product
├── CharacterDirector.java         # Ready-made configs: Warrior, Mage, Rogue
└── Main.java                      # Demo client
```

## Class Overview

| Class | Responsibility |
|---|---|
| `CharacterBuilder` | Defines the fluent construction steps every builder must support. |
| `CharacterObjectBuilder` | Builds and validates a `GameCharacter` object. |
| `CharacterSheetBuilder` | Builds and validates a formatted text character sheet (`String`). |
| `GameCharacter` | Immutable product — `final` fields, package-private constructor, no setters. |
| `CharacterDirector` | Knows *what* a Warrior/Mage/Rogue is made of; depends only on `CharacterBuilder`. |
| `Main` | Demonstrates building both representations for all three classes, plus a validation failure. |

## Design Highlights

- **Fluent API** — every builder method returns `this` (or the builder's own
  type), so calls can be chained: `.setCharacterClass(...).setWeapon(...)`.
- **Two representations, one script** — `CharacterDirector` calls the exact
  same four steps regardless of which concrete builder it's handed.
- **Immutable product** — `GameCharacter` cannot be modified after
  construction.
- **Fail fast** — `getResult()` validates all required fields and throws a
  clear `IllegalStateException` if anything is missing or invalid (e.g.
  `healthPoints <= 0`).
- **No magic values in client code** — class-specific strings/numbers
  (`"Warrior"`, `"Sword"`, `150`, ...) live in one place: `CharacterDirector`.

## Example Usage

```java
CharacterDirector director = new CharacterDirector();

// Representation 1: GameCharacter object
CharacterObjectBuilder objectBuilder = new CharacterObjectBuilder();
director.makeWarrior(objectBuilder);
GameCharacter warrior = objectBuilder.getResult();

// Representation 2: text character sheet
CharacterSheetBuilder sheetBuilder = new CharacterSheetBuilder();
director.makeWarrior(sheetBuilder);
String warriorSheet = sheetBuilder.getResult();

System.out.println(warrior);
System.out.println(warriorSheet);
```

## Sample Output

```
================================
       GAME CHARACTER SHEET
================================
Class: Warrior
Weapon: Sword
Armor: Heavy Armor
Health Points: 150
================================
```

## Running the Demo

```bash
javac *.java
java Main
```

`Main` builds a Warrior, Mage, and Rogue in both representations, then
demonstrates the validation logic by attempting to build a character with
`0` health points and catching the resulting `IllegalStateException`.

## Report

See `Assignment_1_Builder_Pattern_Report.pdf` for the full report:
introduction, UML class diagram, and Clean Code principles with code
excerpts.
