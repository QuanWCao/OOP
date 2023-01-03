package lab12.pseudocode.abstractfactory;

public class Application {


    private Checkbox checkbox;
    private Button button;


    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();

    }
}
