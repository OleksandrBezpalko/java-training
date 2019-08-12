public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory factory;

        factory = new GamingDeviceFactory();
        factory.createMouse().click();
        factory.createKeyboard().pressEnter();

        factory = new OfficeDeviceFactory();
        factory.createMouse().click();
        factory.createKeyboard().pressEnter();
    }
}

interface Mouse {
    void click();
}
interface Keyboard {
    void pressEnter();
}
interface DeviceFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
class GamingMouse implements Mouse {
    public void click() {
        System.out.println("Gaming mouse");
    }
}
class GamingKeyboard implements Keyboard {
    public void pressEnter() {
        System.out.println("Gaming keyboard");
    }
}
class GamingDeviceFactory implements DeviceFactory {
    public Mouse createMouse() {
        return new GamingMouse();
    }
    public Keyboard createKeyboard() {
        return new GamingKeyboard();
    }
}
class OfficeMouse implements Mouse {
    public void click() {
        System.out.println("Office mouse");
    }
}
class OfficeKeyboard implements Keyboard {
    public void pressEnter() {
        System.out.println("Office keyboard");
    }
}
class OfficeDeviceFactory implements DeviceFactory {
    public Mouse createMouse() {
        return new OfficeMouse();
    }
    public Keyboard createKeyboard() {
        return new OfficeKeyboard();
    }
}

