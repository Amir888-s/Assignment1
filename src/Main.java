public class Main {

    public static void main(String[] args) {

        CharacterDirector director = new CharacterDirector();

        System.out.println("========== GAME CHARACTER BUILDER ==========\n");

        // Warrior
        CharacterObjectBuilder warriorObj = new CharacterObjectBuilder();
        director.makeWarrior(warriorObj);
        CharacterSheetBuilder warriorSheet = new CharacterSheetBuilder();
        director.makeWarrior(warriorSheet);
        printCharacter("WARRIOR", warriorObj.getResult(), warriorSheet.getResult());

        // Mage
        CharacterObjectBuilder mageObj = new CharacterObjectBuilder();
        director.makeMage(mageObj);
        CharacterSheetBuilder mageSheet = new CharacterSheetBuilder();
        director.makeMage(mageSheet);
        printCharacter("MAGE", mageObj.getResult(), mageSheet.getResult());

        // Rogue
        CharacterObjectBuilder rogueObj = new CharacterObjectBuilder();
        director.makeRogue(rogueObj);
        CharacterSheetBuilder rogueSheet = new CharacterSheetBuilder();
        director.makeRogue(rogueSheet);
        printCharacter("ROGUE", rogueObj.getResult(), rogueSheet.getResult());

        // Validation test
        System.out.println("VALIDATION TEST");
        System.out.println("----------------------------------------");

        try {
            new CharacterObjectBuilder()
                    .setCharacterClass("Warrior")
                    .setWeapon("Sword")
                    .setArmor("Heavy Armor")
                    .setHealthPoints(0)
                    .getResult();

        } catch (IllegalStateException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        System.out.println("\n========== PROGRAM FINISHED ==========");
    }

    // One shared helper instead of copy-pasting these 6 print lines
    // for Warrior, Mage, and Rogue separately.
    private static void printCharacter(String title, GameCharacter character, String sheet) {

        System.out.println(title);
        System.out.println("----------------------------------------");
        System.out.println("GameCharacter Object:");
        System.out.println(character);
        System.out.println();
        System.out.println("Character Sheet:");
        System.out.println(sheet);
        System.out.println();
    }

}
