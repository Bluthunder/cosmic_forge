package examples_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod_Vararg {

    // Here static method toList accepts any array of Type T[] and returns a list of type T.
    // This is indicated by <T>

    public class Lists{

        // This is generic method
        public static <T> List<T> toList(T [] arr){
            List<T> list = new ArrayList<T>();
            for( T elt: arr) {
                list.add(elt);
            }
            return list;
        }
        // This is VARARGS feature which uses special convinient ways to replace T[] ----> T...
        @SafeVarargs
        public static <T> List<T> to_List(T... arr){
            List<T> list = new ArrayList<T>();
            for(T elt:arr){
                list.add(elt);
            }
            return list;
        }

        public static <T> void addAll(List<T> list, T... arr){
            for (T elt: arr){
                list.add(elt);
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> ints = Lists.toList(new Integer[] {1, 2, 3, 4});
        List<String> words = Lists.toList(new String[] {"hello", "world"});


        List<Integer> ints_ = Lists.to_List(new Integer[]{5, 4, 3, 2, 1});
        List<String> words_ = Lists.to_List(new String[] {"Hallo", "Welt"});

        List<Integer> _ints = new ArrayList<Integer>();
        Lists.addAll(_ints, 1, 2, 3, 4 );
        Lists.addAll(_ints, new Integer[]{5, 6, 7, 8});
        System.out.println("Integer list -- > " +_ints);
        assert _ints.toString().equals("[1, 2, 3, 4, 5, 6, 7, 8]");
    }
}
