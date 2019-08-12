public class Facade {
    public static void main(String[] args) {
        FacadeComputer computer = new FacadeComputer(new Power(), new Processor());
        computer.doWork();
    }
}

class FacadeComputer {
    private final Power power;
    private final Processor processor;
    public FacadeComputer(Power power, Processor processor) {
        this.power = power;
        this.processor = processor;
    }
    public void doWork() {
        power.on();
        processor.calculate();
        power.off();
    }
}

class Power {
    void on() {
        System.out.println("Power on");
    }
    void off() {
        System.out.println("Power off");
    }
}
class Processor {
    void calculate() {
        System.out.println("Calculating...");
    }
}