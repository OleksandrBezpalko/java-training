public class Command {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ICommand command;

        command = new StartCommand(computer);
        command.execute();

        command = new StopCommand(computer);
        command.execute();
    }
}

class Computer {
    public void start() {
        System.out.println("Start");
    }
    public void stop() {
        System.out.println("Stop");
    }
}

interface ICommand {
    void execute();
}
class StartCommand implements ICommand {
    private Computer computer;
    public StartCommand(Computer computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.start();
    }
}
class StopCommand implements ICommand {
    private Computer computer;
    public StopCommand(Computer computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.stop();
    }
}
