package web_day13;

public class Tiger extends Animal implements Predator{

    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public String barkable() {
        return "어흥";
    }
}
