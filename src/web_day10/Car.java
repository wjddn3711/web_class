package web_day10;

public class Car {
    String color;
    String gearType;
    int door;
    Car(){
        this("white","auto",4);
    }

    Car(Car c){
        // 객체를 복사하는 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;

    }


    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
