package web_day16;

import java.sql.SQLOutput;
import java.util.ArrayList;

class Fruit{
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit{
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy{
    @Override
    public String toString() {
        return "Toy";
    }
}

class Box<T> {
    ArrayList<T>list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class genericsExam {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>(); 에러 발생, 타입 불일치
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 상속 받았기 때문에 들어간다
//        fruitBox.add(new Toy()); 에러, 타입 불일치
        appleBox.add(new Apple());
//        appleBox.add(new Fruit()); Box(Apple)에는 Apple만 담을 수 있다
//        appleBox.add(new Toy());
        toyBox.add(new Toy());
//        toyBox.add(new Apple()); 에러 발생 토이만 담을 수 있다
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("web");
//        arrayList.add("developer");
//        arrayList.add("123");
//
//        String web = arrayList.get(0);
//        String developer = arrayList.get(1);
//        String num =  arrayList.get(2);
////        System.out.println(web);
////        System.out.println(developer);
////        System.out.println(num);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }



    }

}
