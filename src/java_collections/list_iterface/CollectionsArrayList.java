/*


 */


package java_collections.list_iterface;

import java.util.*;

public class CollectionsArrayList {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Ram");
        name.add("Maruti");
        name.add("Shiva");
        name.add("Ganesha");

        for (String s : name) {
            System.out.println(s);
        }

    }
}
