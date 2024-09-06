package java_collections.set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionsHashSet {

    private static ArrayList list;

    public static void main(String[] args) {

        HashSet<ArrayList> hashSet = new HashSet<>();

        ArrayList<String> element_names = new ArrayList<>();

        ArrayList<String> alkali_metals = new ArrayList<>();

        element_names.add("Hydrogen");
        element_names.add("Helium");
        element_names.add("Lithium");
        element_names.add("Beryllium");

        System.out.println("Elements HashSet <--> " + element_names);

        alkali_metals.add("Hydrogen");
        alkali_metals.add("Lithium");
        alkali_metals.add("Sodium");
        alkali_metals.add("Potassium");

        System.out.println("Alkali Elements HashSet <--> " + alkali_metals);

        hashSet.add(element_names);
        hashSet.add(alkali_metals);

        System.out.println(hashSet.size());



    }

}
