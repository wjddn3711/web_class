package web_day16;

import java.util.ArrayList;

class Fruits implements Eatable{
    @Override
    public String toString() {
        return "Fruits";
    }
}

class Apple2 extends Fruits {
    @Override
    public String toString() {
        return "Apple2";
    }
}

class Banana extends Fruits {
    @Override
    public String toString() {
        return "Banana";
    }
}

class Toy2 {
    @Override
    public String toString() {
        return "Toy2";
    }
}

interface Eatable{}

class FruitBox<T extends Fruits & Eatable> extends Box2<T> {
}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
}

public class Generics {
    public static void main(String[] args) {
        FruitBox<Fruits> fruitsBox = new FruitBox<Fruits>();
        FruitBox<Apple2> apple2FruitBox = new FruitBox<Apple2>();
        FruitBox<Banana> bananaFruitBox = new FruitBox<Banana>();
//        FruitBox<Banana> bananaFruitBox1 = new FruitBox<Apple2>(); 타입 불일치
//        FruitBox<Toy2> toyBox2 = new FruitBox<Toy2>(); 에러, 상속아님
        fruitsBox.add(new Fruits());
        fruitsBox.add(new Apple2());
        fruitsBox.add(new Banana());
        apple2FruitBox.add(new Apple2());
//        apple2FruitBox.add(new Banana());타입 불일치
        bananaFruitBox.add(new Banana());
        System.out.println(fruitsBox);
        System.out.println(apple2FruitBox);
        System.out.println(bananaFruitBox);
    }
}
