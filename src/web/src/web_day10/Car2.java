package web_day10;

public class Car2 {
    String color;
    String gearType;
    int door;
    Car2(){
        this("white","auto",4);
    }

    Car2(String color){
        this(color,"auto",4);
    }

    Car2(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }

}
