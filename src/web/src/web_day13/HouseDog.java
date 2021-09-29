package web_day13;

public class HouseDog extends Dog{
    @Override
    public void sleep() { // 메서드 오버라이딩
        System.out.println(this.name + "Zzzzㅋ");
    }

    public void sleep(int hour){
        System.out.println(this.name + "ZZzz for "+hour +"hours");
    }

    public static void main(String[] args) {
        HouseDog hd1 = new HouseDog();
        hd1.setName("happy"); // 할아버지
        hd1.sleep(); // 부모 -> 자신
        hd1.sleep(2);


    }
}
