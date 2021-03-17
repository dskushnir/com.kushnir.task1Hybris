package collections.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList words = new ArrayList();
        words.add("hello");
        words.add("where");
        words.add(10);
        words.add(9);
        words.add(12.00);
        words.add("H");
        int item1 = (int) words.get(2);
        int item2 = (int) words.get(3);
        System.out.println("ArrayList before Java 5");
        System.out.println(item1 + item2);
        System.out.println();

        ArrayList<String> wordsString = new ArrayList<String>();
        wordsString.add("hello");
        wordsString.add("where");
        wordsString.add("10");
        String item1S = wordsString.get(2);
        System.out.println("ArrayList after Java 5");
        System.out.println(item1S);
        System.out.println();

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        System.out.println("LinkedList before remove the first element");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        numbers.remove();

        System.out.println("LinkedList after remove the first element");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
