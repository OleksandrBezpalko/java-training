public class Decorator {
    public static void main(String[] args) {
        Printer printer = new QuotesPrinterDecorator(new NewlinePrinterDecorator(new HelloPrinter()));
        printer.print();
    }
}

interface Printer {
    void print();
}
class HelloPrinter implements Printer {
    public void print() {
        System.out.print("Hello");
    }
}

abstract class PrinterDecorator implements Printer {
    private Printer component;
    public PrinterDecorator(Printer component) {
        this.component = component;
    }
    public void print() {
        component.print();
    }
}
class QuotesPrinterDecorator extends PrinterDecorator {
    public QuotesPrinterDecorator(Printer component) {
        super(component);
    }
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
class NewlinePrinterDecorator extends PrinterDecorator {
    public NewlinePrinterDecorator(Printer component) {
        super(component);
    }
    public void print() {
        super.print();
        System.out.print("\n");
    }
}

