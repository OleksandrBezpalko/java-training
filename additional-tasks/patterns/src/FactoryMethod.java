public class FactoryMethod {
    public static void main(String[] args) {
        ClockMaker maker;

        maker = new DigitalClockMaker();
        maker.createClock().showTime();

        maker = new AnalogClockMaker();
        maker.createClock().showTime();
    }
}

interface Clock {
    void showTime();
}
interface ClockMaker {
    Clock createClock();
}
class DigitalClock implements Clock {
    public void showTime() {
        System.out.println("Digital clock");
    }
}
class DigitalClockMaker implements ClockMaker {
    public Clock createClock() {
        return new DigitalClock();
    }
}
class AnalogClock implements Clock {
    public void showTime() {
        System.out.println("Analog clock");
    }
}
class AnalogClockMaker implements ClockMaker {
    public Clock createClock() {
        return new AnalogClock();
    }
}