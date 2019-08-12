import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        MilitaryUnit infantryBattalion = new MilitaryUnit();
        infantryBattalion.addSoldier(new Infantryman());
        infantryBattalion.addSoldier(new Infantryman());

        MilitaryUnit trooperBattalion = new MilitaryUnit();
        trooperBattalion.addSoldier(new Trooper());
        trooperBattalion.addSoldier(new Trooper());

        MilitaryUnit regiment = new MilitaryUnit();
        regiment.addSoldier(new Trooper());
        regiment.addSoldier(infantryBattalion);
        regiment.addSoldier(trooperBattalion);

        regiment.attack();
    }
}

interface Soldier {
    void attack();
}
class Infantryman implements Soldier {
    public void attack() {
        System.out.println("Infantryman attacks!");
    }
}
class Trooper implements Soldier {
    public void attack() {
        System.out.println("Trooper attacks!");
    }
}
class MilitaryUnit implements Soldier {
    private List<Soldier> soldiers = new ArrayList<>();
    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }
    public void attack() {
        soldiers.forEach(Soldier::attack);
    }
}