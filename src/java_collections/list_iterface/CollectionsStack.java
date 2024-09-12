package java_collections.list_iterface;

import java.util.Stack;

public class CollectionsStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Aluminium");
        stack.push("Galium");
        stack.push("Indium");
        stack.push("Tin");
        stack.push("Thalium");
        stack.push("lead");

        System.out.println(stack.peek());

    }
}
