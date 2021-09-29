package web_day13;

public class HouseDog extends Dog{
    public HouseDog(String name) {
        this.setName(name);
    } // 생성자
    // 1. 클래스 명과 동일 2. 리턴없다


    @Override
    public void sleep() { // 메서드 오버라이딩
        System.out.println(this.name + "Zzzzㅋ");
    }

    public void sleep(int hour){
        System.out.println(this.name + "ZZzz for "+hour +"hours");
    }

    public static void main(String[] args) {
        HouseDog hd1 = new HouseDog("happy");
//        hd1.setName("happy"); // 할아버지
        hd1.sleep(); // 부모 -> 자신
        hd1.sleep(2);


    }
}
