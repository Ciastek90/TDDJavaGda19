public class CharacterBuilder implements Builder<Character>{

    private Character result;

    public CharacterBuilder(){
        result = new Character();
    }

    public CharacterBuilder setClass(CharacterClass characterClass){
        this.result.setCharacterClass(characterClass);
        return this;
    }

    public CharacterBuilder setName(String name){
        this.result.setName(name);
        return this;
    }

    public CharacterBuilder setStrangth(int value){
        result.getStats()[0] = createCharacterStat(value, BaseCharacterStatisticType.Strength);
        return this;
    }

    public CharacterBuilder setCharisma(int value){
        result.getStats()[1] = createCharacterStat(value, BaseCharacterStatisticType.Charisma);
        return this;
    }

    public CharacterBuilder setConstitution(int value){
        result.getStats()[2] = createCharacterStat(value, BaseCharacterStatisticType.Constitution);
        return this;
    }

    public CharacterBuilder setDexterity(int value){
        result.getStats()[3] = createCharacterStat(value, BaseCharacterStatisticType.Dexterity);
        return this;
    }

    public CharacterBuilder setIntelligence(int value){
        result.getStats()[4] = createCharacterStat(value, BaseCharacterStatisticType.Intelligence);
        return this;
    }

    public CharacterBuilder setWisdom(int value){
        result.getStats()[5] = createCharacterStat(value, BaseCharacterStatisticType.Wisdom);
        return this;
    }

    private CharacterStatistic createCharacterStat(int value, BaseCharacterStatisticType type){
        CharacterStatistic stat = new CharacterStatistic(type);
        stat.setActualValue(value);
        return stat;
    }

    @Override
    public Character build() {
        return result;
    }
}
