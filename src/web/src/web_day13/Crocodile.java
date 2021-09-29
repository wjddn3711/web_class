package web_day13;

public class Crocodile extends Animal implements Predator{
    @Override
    public String getFood() {
        return "tomato";
    }

    @Override
    public String barkable() {
        return "쩝쩝";
    }

}
