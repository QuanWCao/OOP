package lab12.pseudocode.abstractfactory;

import java.awt.*;

public class WinFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
