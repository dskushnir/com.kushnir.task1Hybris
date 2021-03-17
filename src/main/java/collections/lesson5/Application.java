package collections.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Joy", "a filling of great pleasure or happiness.");
        dictionary.put("Confidence", "the state of filling certain about the truth of something.");
        for (String word : dictionary.keySet()) {
            System.out.println("HashMap key:" + word);
        }
        for (String word : dictionary.keySet()) {
            System.out.println("HashMap value:" + dictionary.get(word));
        }
        System.out.println();
        System.out.println("HashMap key:value");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        LinkedHashMap<String, String> dictionary2 = new LinkedHashMap<>();
        dictionary2.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary2.put("Brilliant", "exceptionally clever or talented");
        dictionary2.put("Joy", "a filling of great pleasure or happiness.");
        dictionary2.put("Confidence", "the state of filling certain about the truth of something.");
        for (String word : dictionary2.keySet()) {
            System.out.println("LinkedHashMap key:" + word);
        }
        for (String word : dictionary2.keySet()) {
            System.out.println("LinkedHashMap value:" + dictionary2.get(word));
        }
        System.out.println();

        TreeMap<String, String> dictionary3 = new TreeMap<>();
        dictionary3.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary3.put("Brilliant", "exceptionally clever or talented");
        dictionary3.put("Joy", "a filling of great pleasure or happiness.");
        dictionary3.put("Confidence", "the state of filling certain about the truth of something.");
        dictionary3.put("Brilliant", "xxxxxxxxxxx");
        System.out.println("TreeMap key:value");
        for (Map.Entry<String, String> entry : dictionary3.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}
