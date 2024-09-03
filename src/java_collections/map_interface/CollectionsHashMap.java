package java_collections.map_interface;

import java.util.HashMap;

public class CollectionsHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(null, "Element");
        hashMap.put(1, "Hydrogen");
        hashMap.put(2, "Helium");

        System.out.println("Size of HashMap --> " + hashMap.size());

        System.out.println("HashMap Elements: " + hashMap);

        if (hashMap.containsKey(1)){
            String elements = hashMap.get(1);
            System.out.println("Value for Key --<>-- " + elements);
        }
    }

}
