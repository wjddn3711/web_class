package web_day9;

public class Overloading {
    static String concatenate(String delim, String... some) {
        String result = "";
        for (String string : some) {
            result += string + delim;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };
        System.out.println(concatenate("-", strArr));
    }

}
