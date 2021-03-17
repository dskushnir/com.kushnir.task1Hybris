package collections.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(17);
        values.add(43);
        values.add(15);
        values.add(67);

        System.out.println("HashSet integerValue");
        for (Integer value : values) {
            System.out.println(value);
        }
        System.out.println();

        HashSet<String> valuesS = new HashSet<String>();
        valuesS.add("Random");
        valuesS.add("Animal");
        valuesS.add("People");
        valuesS.add("Random");
        valuesS.add("Random");
        System.out.println("HashSet stringValue");

        for (String value : valuesS) {
            System.out.println(value);
        }
        System.out.println();

        LinkedHashSet<String> valuesL = new LinkedHashSet<>();
        valuesL.add("Random");
        valuesL.add("Animal");
        valuesL.add("People");
        valuesL.add("Zoo");
        valuesL.add("Car");
        valuesL.add("Car");
        valuesL.add("Car");
        valuesL.add("Random");

        System.out.println("LinkedHashSet stringValue");

        for (String value : valuesL) {
            System.out.println(value);
        }
        System.out.println();

        HashSet<Animal> animals = new HashSet<Animal>();
        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 8);
        Animal animal3 = new Animal("Bird", 3);
        Animal animal4 = new Animal("Dog", 12);
        Animal animal5 = new Animal("Kangaroo", 24);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        System.out.println("Is animal1.equals(animal4):" + animal1.equals(animal4));
        System.out.println("Animal1.hashCode():" + animal1.hashCode());
        System.out.println("Animal4.hashCode():" + animal4.hashCode());
        System.out.println();

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
