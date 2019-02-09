public class Player {
    private Joystick controller;
    private Character character;

    public Player(Joystick controller, Character character){
        this.controller = controller;
        this.character = character;
    }

    public Joystick getController() {
        return controller;
    }

    public Character getCharacter() {
        return character;
    }
}
