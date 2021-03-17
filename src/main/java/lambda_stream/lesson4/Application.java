package lambda_stream.lesson4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Stream from 1 to 10");
        IntStream.range(1,10)
                .forEach(x-> System.out.println(x));
        System.out.println();
        System.out.println("Stream from 1 to 10 with  skip(5)");

        IntStream.range(1,10)
                .skip(5)
                .forEach(x-> System.out.println(x));
        System.out.println();
        System.out.println("Sum of streams elements");
        int val = IntStream.range(1,5)
                .sum();
        System.out.println(val);
        System.out.println("Stream of value");
        System.out.println();
        Stream.of("Hello","bottle","Africa")
                .sorted()
                .findFirst().ifPresent(x-> System.out.println(x));
        System.out.println();
        System.out.println("Stream values starts with t");

        String[]items = {"car","computer", "toothpaste","box", "pencil", "tent","dor","toy"};
        Stream.of(items).filter(x->x.startsWith("t")).sorted()
                .forEach(x-> System.out.print(x+","));
        System.out.println();
        System.out.println();
        System.out.println("Average of stream");
        Arrays.stream(new int[]{2,4,6,8,10})
                .map(x->x*x)
                .average()
                .ifPresent(n-> System.out.println(n));
        System.out.println();
        System.out.println("Stream values starts with c");
        List<String>listOfItems = Arrays.asList("Computer", "Toothpaste","Box", "Pencil","Car", "Tent","Dor","Toy");
        listOfItems.stream()
                .map(x->x.toLowerCase())
                .filter(x->x.startsWith("c"))
                .sorted()
                .forEach(x-> System.out.println(x));
        System.out.println();
        System.out.println("Stream from file");

        Stream <String>lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.sorted().filter(l->l.length()>6).forEach(x-> System.out.print(x+","));
        lines.close();
        System.out.println();
        System.out.println();
        System.out.println("List from stream");
        List <String>words = Files.lines(Paths.get("files/wordFile.txt"))
                .sorted().filter(x->x.contains("th"))
                .collect(Collectors.toList());
                words.forEach(x-> System.out.print(x+","));
        System.out.println();
        System.out.println();
        System.out.println("Stream count();");
        Stream<String>rows = Files.lines(Paths.get("files/stockDataCvs.txt"));
        int rowCount=(int)rows.map(x->x.split(","))
                .filter(x->x.length>3)
                .count();
        System.out.println(rowCount+" good rows");
        rows.close();
        System.out.println();
        Stream<String>rows2 = Files.lines(Paths.get("files/stockDataCvs.txt"));
        rows2.map(x->x.split(","))
                .filter(x->x.length>3)
                .filter(x->Integer.parseInt(x[1].trim())>15)
                .forEach(x-> System.out.println(x[0].trim()+" "+x[2].trim()+" "+x[3]));
        rows2.close();
    }
}
