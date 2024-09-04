package java_collections.map_interface;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding
        hashMap.put(null, "Element");
        hashMap.put(1, "Hydrogen");
        hashMap.put(2, "Helium");
        hashMap.put(3, "Lithium");

        // Changing Elements
        hashMap.put(null, "Elements");


        System.out.println("Size of HashMap --> " + hashMap.size());

        System.out.println("HashMap Elements: " + hashMap);

      /*  if (hashMap.containsKey(1)){
            String elements = hashMap.get(1);
            System.out.println("Value for Key --<>-- " + elements);
        }*/

        // Remove Element
        hashMap.remove(null);

        System.out.println("HashMap Elements:--> " + hashMap);


        // Traversal

        for(Map.Entry<Integer, String> e: hashMap.entrySet()){
            System.out.println("Key : " + e.getKey() + " --<>-- " + " Value : "+ e.getValue());
        }


        // Synchronized Map

        Map<Integer, String> syncHashMap = Collections.synchronizedMap(hashMap);

        System.out.println("Synchronized HashMap -- > " + syncHashMap);



        // Compute method

        hashMap.computeIfPresent(1, (key, val) -> val.concat(" - H"));

        hashMap.computeIfPresent(2, (key, val) -> val.concat(" - He"));

        hashMap.computeIfPresent(3, (key, val) -> val.concat(" - Li"));

        System.out.println("Computed HashMap -- > " + syncHashMap);


        HashMap<Integer, Float> newHashMap = new HashMap<>();
        newHashMap.put(1, 1.078F);
        newHashMap.put(2, 4.002F);
        newHashMap.put(3, 6.941F);

        for(Map.Entry<Integer, Float> es: newHashMap.entrySet()){
            System.out.println("Key : " + es.getKey() + " --<>-- " + "Atomic Value : " + es.getValue());
        }

        // Merge

        newHashMap.forEach((k, v) ->
                hashMap.merge(k, String.valueOf(v),
                        (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + " -- " + v2 ));


        System.out.println("New HashMap: " + hashMap);


        // Key Set

        System.out.println("Key Set Values: " + hashMap.keySet());

    }




}
