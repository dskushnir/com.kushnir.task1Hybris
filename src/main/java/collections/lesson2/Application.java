package collections.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println();
        for (String value : animals) {
            System.out.println(value);
        }
        System.out.println();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 1200, false);
        vehicles.add(new Vehicle("Honda", "Accord", 1200, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 2500, true));
        System.out.println("ArrayList vehicles before toString was overridden");

        for (Vehicle car1 : vehicles) {
            System.out.println(car1.getMake());
            System.out.println(car1.getModel());
            System.out.println(car1.getPrice());
            System.out.println();
        }
        System.out.println("ArrayList vehicles after toString was overridden");

        for (Vehicle car : vehicles) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println("Print with method printElements();");
        printElements(animals);
        System.out.println();
        printElements(vehicles);
    }

    public static void printElements(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));

        }
    }
}
