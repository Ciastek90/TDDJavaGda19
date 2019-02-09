/**
 * Klasa główna
 */
public class Main {
    /**
     * @param args Argumnety które są dostarczane z wywołania konsoli
     */
    public static void main(String[] args) {
        Character c = new CharacterBuilder()
                .setCharisma(10)
                .setClass(CharacterClass.Barbarian)
                .setConstitution(10)
                .setDexterity(10)
                .setIntelligence(10)
                .setName("Ciastek")
                .setStrangth(10)
                .setWisdom(10)
                .build();

        System.out.println(c.getName());
        System.out.println(c.getCharacterClass().name());
        System.out.println(c.getHealthPoints());
        System.out.println(c.getStrength().getActualValue());

        Player player = new Player(new Joystick() {
            @Override
            public boolean isArrowUpPressed() {
                return false;
            }

            @Override
            public boolean isArrowDownPressed() {
                return false;
            }

            @Override
            public boolean isArrowLeftPressed() {
                return true;
            }

            @Override
            public boolean isArrowRightPressed() {
                return true;
            }

            @Override
            public boolean isButtonAPressed() {
                return true;
            }

            @Override
            public boolean isButtonBPressed() {
                return false;
            }

            @Override
            public boolean isButtonXPressed() {
                return false;
            }

            @Override
            public boolean isButtonYPressed() {
                return false;
            }
        }, c);

        MultipayerDuel duel = new MultipayerDuel(player,player);
        duel.updateCharacterState();

        System.out.println(c.getName());
        System.out.println(c.getCharacterClass().name());
        System.out.println(c.getHealthPoints());
        System.out.println(c.getStrength().getActualValue());
    }
}
