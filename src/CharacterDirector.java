public class CharacterDirector {


    public void makeWarrior(CharacterBuilder builder) {

        builder
                .setCharacterClass("Warrior")
                .setWeapon("Sword")
                .setArmor("Heavy Armor")
                .setHealthPoints(150);
    }

    public void makeMage(CharacterBuilder builder) {

        builder
                .setCharacterClass("Mage")
                .setWeapon("Magic Staff")
                .setArmor("Magic Robe")
                .setHealthPoints(80);
    }

    public void makeRogue(CharacterBuilder builder) {

        builder
                .setCharacterClass("Rogue")
                .setWeapon("Daggers")
                .setArmor("Light Armor")
                .setHealthPoints(100);
    }


}

