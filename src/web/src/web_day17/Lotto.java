package web_day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        Set set = new HashSet();
//        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; set.size()<6; i++) {
            int lottoNum = 1+rand.nextInt(45);
            System.out.println("random number:"+lottoNum);
            set.add(lottoNum);
            System.out.println("set in"+set);
        }
    }
}
