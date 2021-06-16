package creationalPatterns.prototype;


import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        System.out.println(swordsman);

        // we need to cast the object
        Swordsman s2 = (Swordsman) swordsman.clone();
        System.out.println("cloned swordsman "+s2);

        General general = new General();
        general.move(new Point3D(10, 0, 0), 30);
        general.boostMorale();
        System.out.println(general);

        General g2 = (General) general.clone();
        System.out.println("cloned general "+g2);
    }
}
