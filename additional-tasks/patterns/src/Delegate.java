public class Delegate {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setShape(new Circle());
        painter.draw();

        painter.setShape(new Square());
        painter.draw();
    }
}

interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class Painter {
    private Shape shape;
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public void draw() {
        shape.draw();
    }
}
