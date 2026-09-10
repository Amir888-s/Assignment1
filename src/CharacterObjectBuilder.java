public class CharacterObjectBuilder implements CharacterBuilder {


    private String characterClass;
    private String weapon;
    private String armor;
    private int healthPoints;

    @Override
    public CharacterObjectBuilder setCharacterClass(
            String characterClass) {

        this.characterClass = characterClass;
        return this;
    }

    @Override
    public CharacterObjectBuilder setWeapon(String weapon) {

        this.weapon = weapon;
        return this;
    }

    @Override
    public CharacterObjectBuilder setArmor(String armor) {

        this.armor = armor;
        return this;
    }

    @Override
    public CharacterObjectBuilder setHealthPoints(
            int healthPoints) {

        this.healthPoints = healthPoints;
        return this;
    }

    public GameCharacter getResult() {

        validate();

        return new GameCharacter(
                characterClass,
                weapon,
                armor,
                healthPoints
        );
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

