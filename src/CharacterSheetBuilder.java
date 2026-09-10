public class CharacterSheetBuilder implements CharacterBuilder {

    private String characterClass;
    private String weapon;
    private String armor;
    private int healthPoints;

    @Override
    public CharacterSheetBuilder setCharacterClass(
            String characterClass) {

        this.characterClass = characterClass;
        return this;
    }

    @Override
    public CharacterSheetBuilder setWeapon(String weapon) {

        this.weapon = weapon;
        return this;
    }

    @Override
    public CharacterSheetBuilder setArmor(String armor) {

        this.armor = armor;
        return this;
    }

    @Override
    public CharacterSheetBuilder setHealthPoints(
            int healthPoints) {

        this.healthPoints = healthPoints;
        return this;
    }

    public String getResult() {

        validate();

        StringBuilder sheet = new StringBuilder();

        sheet.append("================================\n");
        sheet.append("       GAME CHARACTER SHEET\n");
        sheet.append("================================\n");

        sheet.append("Class: ")
                .append(characterClass)
                .append("\n");

        sheet.append("Weapon: ")
                .append(weapon)
                .append("\n");

        sheet.append("Armor: ")
                .append(armor)
                .append("\n");

        sheet.append("Health Points: ")
                .append(healthPoints)
                .append("\n");

        sheet.append("================================");

        return sheet.toString();
    }

    private void validate() {

        if (characterClass == null
                || characterClass.isBlank()) {

            throw new IllegalStateException(
                    "Character class is required."
            );
        }

        if (weapon == null || weapon.isBlank()) {

            throw new IllegalStateException(
                    "Weapon is required."
            );
        }

        if (armor == null || armor.isBlank()) {

            throw new IllegalStateException(
                    "Armor is required."
            );
        }

        if (healthPoints <= 0) {

            throw new IllegalStateException(
                    "Health points must be greater than zero."
            );
        }
    }


}

