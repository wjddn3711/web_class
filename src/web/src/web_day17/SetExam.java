package web_day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Object[] objArr = {"1","2","2","3","3","4","4","4","5","5","5","5"};
        Set set = new HashSet();
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }
        System.out.println(set);


    }
}
