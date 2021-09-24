package web_day10;

public class CarTest2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.door);
        System.out.println(c1.gearType);
        System.out.println(c1.color);
        Car c2 = new Car(c1);
        System.out.println(c1.door);
        System.out.println(c1.gearType);
        System.out.println(c1.color);
    }
}
