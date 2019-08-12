public class Strategy {
    public static void main(String[] args) {
        Action action = new Greet();
        action.execute();

        action = new SayGoodbye();
        action.execute();
    }
}

interface Action {
    void execute();
}
class Greet implements Action {
    public void execute() {
        System.out.println("Greetings!");
    }
}
class SayGoodbye implements Action {
    public void execute() {
        System.out.println("Goodbye.");
    }
}
