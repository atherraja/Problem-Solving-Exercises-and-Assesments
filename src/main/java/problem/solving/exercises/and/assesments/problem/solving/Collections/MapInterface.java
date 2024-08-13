package problem.solving.exercises.and.assesments.problem.solving.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        // Creating an empty HashMap
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
        hm.entrySet()) {

            // Printing keys
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());

        }
    }
}
