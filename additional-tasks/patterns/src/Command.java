public class CommandApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User (new StartCommand(computer, new StartCommand(computer)));

        user.startComputer();
        user.stopComputer();
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

interface Command {
    void execute();
}

class StartCommand implements Command {
    private Computer computer;
    public StartCommand(Computer computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.start();
    }
}

class StopCommand implements Command {
    private Computer computer;
    public StopCommand(Computer computer) {
        this.computer = computer;
    }
    public void execute() {
        computer.stop();
    }
}

class User {
    Command start;
    Command stop;

    public User (Command start, Command stop){
        this.start = start;
        this.stop = stop;
    }

    void startComputer (){
        start.execute();
    }

    void stopComputer(){
        stop.execute();
    }
}