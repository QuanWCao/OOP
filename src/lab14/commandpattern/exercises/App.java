package lab14.commandpattern.exercises;

public class App {

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        ShutDownCommand shutDownCommand1 = new ShutDownCommand(computer1);
        RestartCommand restartCommand1 = new RestartCommand(computer1);

        ShutDownCommand shutDownCommand2 = new ShutDownCommand(computer2);
        RestartCommand restartCommand2 = new RestartCommand(computer2);

        Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(restartCommand1);
        mySwitch.storeAndExecute(shutDownCommand1);
        System.out.println();


        mySwitch.storeAndExecute(restartCommand2);
        mySwitch.storeAndExecute(shutDownCommand2);


    }
}
