public class MultipayerDuel {
    private final Player player2;
    private final Player player1;

    public MultipayerDuel(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void updateCharacterState(){
        if(player1.getController().isArrowLeftPressed()
                && player2.getController().isArrowLeftPressed()
                && player2.getController().isButtonAPressed()){
            player1.getCharacter().getDamage((double)player2.getCharacter().getStrength().getActualValue() * 0.1);
        }

        if(player2.getController().isArrowLeftPressed()
                && player1.getController().isArrowLeftPressed()
                && player1.getController().isButtonAPressed()){
            player2.getCharacter().getDamage((double)player1.getCharacter().getStrength().getActualValue() * 0.1);
        }

        if(player1.getController().isArrowRightPressed()
                && player1.getController().isButtonAPressed()
                && player2.getController().isArrowLeftPressed()
                && player2.getController().isButtonAPressed()){
            player1.getCharacter().getDamage((double)player2.getCharacter().getStrength().getActualValue() * 0.5);
        }
    }
}
