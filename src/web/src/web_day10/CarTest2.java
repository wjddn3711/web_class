package web_day10;

public class CarTest2 {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.door);
        System.out.println(car1.gearType);
        System.out.println(car1.color);

        Car c2 = new Car(car1);
        System.out.println(c2.door);
        System.out.println(c2.gearType);
        System.out.println(c2.color);

    }
}
