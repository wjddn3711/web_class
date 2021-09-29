package web_day13;

public class Lion extends Animal implements Predator{

    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public String barkable() {
        return "으르렁";
    }
}
