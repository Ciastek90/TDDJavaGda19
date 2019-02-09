public class CharacterStatistic {
    private BaseCharacterStatisticType characterStatisticType;

    private int actualValue;

    public CharacterStatistic(BaseCharacterStatisticType type){
        this.characterStatisticType = type;
    }

    public BaseCharacterStatisticType getCharacterStatisticType() {
        return characterStatisticType;
    }

    public void incrrement(){
        this.actualValue += 1;
    }

    public int getActualValue() {
        return actualValue;
    }

    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }
}
