public final class GameCharacter {


    private final String characterClass;
    private final String weapon;
    private final String armor;
    private final int healthPoints;

    // Package-private constructor.
// The object is intended to be created through a builder.
    GameCharacter(
            String characterClass,
            String weapon,
            String armor,
            int healthPoints) {

        this.characterClass = characterClass;
        this.weapon = weapon;
        this.armor = armor;
        this.healthPoints = healthPoints;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String toString() {
        return "GameCharacter["
                + "class=" + characterClass
                + ", weapon=" + weapon
                + ", armor=" + armor
                + ", healthPoints=" + healthPoints
                + "]";
    }

}
