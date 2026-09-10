public class Main {

    public static void main(String[] args) {

        CharacterDirector director =
                new CharacterDirector();

        System.out.println(
                "========== GAME CHARACTER BUILDER =========="
        );

        System.out.println();


        // ========================================
        // 1. WARRIOR
        // Representation 1: GameCharacter Object
        // ========================================

        System.out.println("1. WARRIOR");
        System.out.println(
                "----------------------------------------"
        );

        CharacterObjectBuilder warriorObjectBuilder =
                new CharacterObjectBuilder();

        director.makeWarrior(warriorObjectBuilder);

        GameCharacter warrior =
                warriorObjectBuilder.getResult();

        System.out.println("GameCharacter Object:");
        System.out.println(warrior);

        System.out.println();


        // ========================================
        // Representation 2: Character Sheet
        // ========================================

        CharacterSheetBuilder warriorSheetBuilder =
                new CharacterSheetBuilder();

        director.makeWarrior(warriorSheetBuilder);

        String warriorSheet =
                warriorSheetBuilder.getResult();

        System.out.println("Character Sheet:");
        System.out.println(warriorSheet);

        System.out.println();
        System.out.println();


        // ========================================
        // 2. MAGE
        // ========================================

        System.out.println("2. MAGE");
        System.out.println(
                "----------------------------------------"
        );

        CharacterObjectBuilder mageObjectBuilder =
                new CharacterObjectBuilder();

        director.makeMage(mageObjectBuilder);

        GameCharacter mage =
                mageObjectBuilder.getResult();

        System.out.println("GameCharacter Object:");
        System.out.println(mage);

        System.out.println();


        CharacterSheetBuilder mageSheetBuilder =
                new CharacterSheetBuilder();

        director.makeMage(mageSheetBuilder);

        String mageSheet =
                mageSheetBuilder.getResult();

        System.out.println("Character Sheet:");
        System.out.println(mageSheet);

        System.out.println();
        System.out.println();


        // ========================================
        // 3. ROGUE
        // ========================================

        System.out.println("3. ROGUE");
        System.out.println(
                "----------------------------------------"
        );

        CharacterObjectBuilder rogueObjectBuilder =
                new CharacterObjectBuilder();

        director.makeRogue(rogueObjectBuilder);

        GameCharacter rogue =
                rogueObjectBuilder.getResult();

        System.out.println("GameCharacter Object:");
        System.out.println(rogue);

        System.out.println();


        CharacterSheetBuilder rogueSheetBuilder =
                new CharacterSheetBuilder();

        director.makeRogue(rogueSheetBuilder);

        String rogueSheet =
                rogueSheetBuilder.getResult();

        System.out.println("Character Sheet:");
        System.out.println(rogueSheet);

        System.out.println();
        System.out.println();


        // ========================================
        // 4. VALIDATION TEST
        // ========================================

        System.out.println("4. VALIDATION TEST");
        System.out.println(
                "----------------------------------------"
        );

        try {

            CharacterObjectBuilder invalidBuilder =
                    new CharacterObjectBuilder();

            invalidBuilder
                    .setCharacterClass("Warrior")
                    .setWeapon("Sword")
                    .setArmor("Heavy Armor")
                    .setHealthPoints(0);

            invalidBuilder.getResult();

        } catch (IllegalStateException exception) {

            System.out.println(
                    "Error: "
                            + exception.getMessage()
            );
        }

        System.out.println();
        System.out.println(
                "========== PROGRAM FINISHED =========="
        );
    }


}

