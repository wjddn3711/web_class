package web_day12;

public class Point {
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }//생성자



    String getLocation(){
        return "x = "+x+"\ny= "+y;
    }
}
