package lab12.pseudocode.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WinButton");
    }
}
