import java.util.HashMap;
import java.util.Map;

public class CWR_59 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("X", 10);
        map2.put("Y", 20);

        if (map1.size() > map2.size()) {
            System.out.println("Map 1 has more mappings:");
            System.out.println(map1);
        } else if (map1.size() < map2.size()) {
            System.out.println("Map 2 has more mappings:");
            System.out.println(map2);
        } else {
            System.out.println("Both maps have the same number of mappings.");
        }
    }
}
