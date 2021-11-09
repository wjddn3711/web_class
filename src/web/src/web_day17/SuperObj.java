package web_day17;

public class SuperObj {
    public void show(){
        print();
    }
    public void print(){
        print();
        System.out.print("Super");
    }

    public static void main(String[] args) {
        SuperObj s = new SuperObj();
        s.show();
    }
}

class SubObj extends SuperObj {
    public void show(){
        super.print();
    }
    public void print() {
        System.out.print("Sub");
    }
}

