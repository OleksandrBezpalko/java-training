public class ChainOfResponsibility {
    public static void main(String[] args) {
        Middleware checker1 = new EvenChecker();
        Middleware checker2 = new NotNegativeSignChecker();
        checker1.setNext(checker2);
        boolean isEvenNotNegative = checker1.check(20);
        System.out.println(isEvenNotNegative);
    }
}

abstract class Middleware {
    private Middleware next;
    public void setNext(Middleware next) {
        this.next = next;
    }
    protected boolean check(int param) {
        return next == null || next.check(param);
    }
}

class EvenChecker extends Middleware {
    @Override
    public boolean check(int param) {
        if (param % 2 == 0) {
            System.out.println(param + " is even");
            return super.check(param);
        }
        return false;
    }
}
class NotNegativeSignChecker extends Middleware {
    @Override
    public boolean check(int param) {
        if (param >= 0) {
            System.out.println(param + " is not negative");
            return super.check(param);
        }
        return false;
    }
}


