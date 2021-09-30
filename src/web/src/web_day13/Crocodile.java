package web_day13;

public class Crocodile extends Predator{
    @Override
    public String getFood() {
        return "tomato";
    }

    @Override
    public String barkable() {
        return "쩝쩝";
    }

}
