public class Prototype {
    public static void main(String[] args) {
        Human prototype = new Human(20, "John");
        Human copy = prototype.clone();
        prototype.setAge(21);
        System.out.println(prototype.toString());
        System.out.println(copy.toString());
    }
}

class Human implements Cloneable {
    private int age;
    private String name;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public Human clone() {
        try {
            return (Human) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
