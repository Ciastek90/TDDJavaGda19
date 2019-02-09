public class Character {
    private CharacterClass characterClass;
    private String name;
    private CharacterStatistic[] stats;
    private double healthPoints;

    public Character(){
        this.stats = new CharacterStatistic[BaseCharacterStatisticType.values().length];
        this.healthPoints = 100.0;
    }

    public String getName() {
        return name;
    }

    public CharacterStatistic[] getStats() {
        return stats;
    }

    public CharacterStatistic getStrength(){
        return stats[0];
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void getDamage(double damagePoints){
        this.healthPoints -= damagePoints;
    }
}
