package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        //stack.offerFirst("naruto");
        //stack.offerFirst("sasuke");
        //stack.offerFirst("luffy");

        stack.offerLast("naruto");
        stack.offerLast("sasuke");
        stack.offerLast("luffy");

        //for (String value:deque) {
            //System.out.println(value);
        //}

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("naruto");
        deque.offerLast("sasuke");
        deque.offerLast("luffy");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
