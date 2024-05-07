import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class Labjson {
    public static void main(String[] args) {
        JSONArray data = new JSONArray();

        Integer[] intArray = {30, 31, 34, 28, 49};
        data.add(intArray);

        String[] strArray = {"One", "Two", "Three", "Four"};
        data.add(strArray);

        Object[] objArray = {31, 32, "Hello World", new String[]{"One", "Two", "Three"}};
        data.add(objArray);

        TreeMap<String, String> map1 = new TreeMap<>();
        map1.put("Name", "Name1");
        map1.put("Address", "213 Washington Blvd");
        map1.put("Zip", "90532");
        data.add(map1);

        TreeMap<String, Object> map2 = new TreeMap<>();
        map2.put("Name", "Name1");
        map2.put("Address", "213 Washington Blvd");
        map2.put("Zip", "90532");

        Set<String> friends = new TreeSet<>();
        friends.add("Friend 1");
        friends.add("Friend 2");
        map2.put("Friends", friends);

        data.add(map2);

        System.out.println(data);
    }
}

