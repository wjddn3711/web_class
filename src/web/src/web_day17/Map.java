package web_day17;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people","사람");
        map.put("baseball", "야구");


        System.out.println(map.get("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.get("baseball"));
        System.out.println(map.size());


    }
}
