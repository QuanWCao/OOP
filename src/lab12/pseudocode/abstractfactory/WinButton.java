package lab12.pseudocode.abstractfactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WinButton");
    }
}
