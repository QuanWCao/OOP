package lab12.pseudocode.factorymethod;

public abstract class Dialog {

    public void renderWindow() {


        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
