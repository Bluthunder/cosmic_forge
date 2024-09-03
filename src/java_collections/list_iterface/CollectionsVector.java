/*
*
* public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
* */


package java_collections.list_iterface;

import java.util.*;

public class CollectionsVector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>(5);

        for(int i=1; i<=5; i++){
            v.add(i);
        }

        System.out.println(v);

//        for(int a : v){
//            System.out.println(a);
//        }

        //Update element
        v.set(1,10);

        //Add by Index
        v.add(3,30);

        //remove
        v.remove(1);

        //Iterating Over the Vector
        for(int k = 0; k < v.size(); k++){
            System.out.print(v.get(k) + " ");
        }

        Vector<String> vt = new Vector<String>();

        Collection<String> c = new ArrayList<String>();
        c.add("A");
        c.add("Name");
        c.add("Bus");
        c.add("Super");

        System.out.println("\n");
        System.out.println("New String Vector --> "+ vt);

        vt.addAll(c);

        System.out.println("Vector after collections --> " + vt);

        System.out.println("Capacity of vt --> " + vt.capacity());

        System.out.println("Hash code of vt -> " + vt.hashCode());

        Iterator<String> it = vt.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        ListIterator<String> lit = vt.listIterator();

        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        Collections.sort(vt);

        System.out.println("--******--");

        System.out.println(vt);

    }



}
