package java_collections.list_iterface;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLinkedList {

    public static void main(String[] args) {

        LinkedList<String> AlkalineEarthMetals = new LinkedList<String>();

        AlkalineEarthMetals.add("Beryllium");
        AlkalineEarthMetals.add("Magnesium");
        AlkalineEarthMetals.add("Calcium");
        AlkalineEarthMetals.add("Strontium");
        AlkalineEarthMetals.add("Barium");
        AlkalineEarthMetals.add("Radium");

        System.out.println("Alkaline Earth Metals List --> "+ AlkalineEarthMetals);

//        Iterator<String> x = AlkalineEarthMetals.descendingIterator();

        Iterator<String> x = AlkalineEarthMetals.listIterator();

        while (x.hasNext()){
            System.out.println("Value is :" + x.next());
        }

        AlkalineEarthMetals.forEach(System.out::println);

    }

}

