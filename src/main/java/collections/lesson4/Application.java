package collections.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        System.out.println("List1:" + list1);
        System.out.println();

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(10);
        System.out.println("NewList:" + newList);
        System.out.println();

        list1.addAll(newList);
        System.out.println("List1 after addALL(newList);");
        System.out.println(list1);
        System.out.println();

        boolean hasValue = list1.contains(67);
        System.out.println("List1 has value 67:" + hasValue);
        System.out.println();
        boolean hasValue1 = list1.contains(48);
        System.out.println("List1 has value 48:" + hasValue1);
        System.out.println();
        boolean hasEmpty = list1.isEmpty();
        System.out.println("Is list1 empty:" + hasEmpty);
        System.out.println();


        list1.removeAll(newList);
        System.out.println("List1 after removeALL(newList);");
        System.out.println(list1);
        System.out.println();

        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        newList.add(67);
        newList.add(15);
        list1.removeAll(newList);
        System.out.println("List1 after removeALL(newList has been added some values: 67, 15);");
        System.out.println(list1);
        System.out.println();

        list1.add(15);
        list1.add(67);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);

        System.out.println("Lis1:" + list1);
        System.out.println("NewList:" + newList);
        list1.retainAll(newList);
        System.out.println("List1  after  retainAll(newList);:" + list1);
        System.out.println();

        list1.clear();
        boolean hasEmpty1 = list1.isEmpty();
        System.out.println("Is list1 empty after clear():" + hasEmpty1);
        System.out.println();

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);


        List<Integer> myList = new ArrayList<Integer>(hashSet);
        System.out.println("List<Integer> from HashSet:" + myList);

        Collections.sort(myList);
        System.out.println("List<Integer> after sort();:" + myList);
        System.out.println();

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Random");
        hashSet1.add("Tooth brush");
        hashSet1.add("Computer");
        hashSet1.add("Cloths");
        ArrayList<String> myList1 = new ArrayList<>(hashSet1);
        Collections.sort(myList1);
        System.out.println("List <String> from HashSet after sort():" + myList1);
        System.out.println();

        HashSet<Employee> hashSet2 = new HashSet<>();
        hashSet2.add(new Employee("Mike", 3500, "Accounting"));
        hashSet2.add(new Employee("Paul", 3000, "Admin"));
        hashSet2.add(new Employee("Peter", 4000, "IT"));
        hashSet2.add(new Employee("Angel", 2000, "Maint"));
        ArrayList<Employee> myList2 = new ArrayList<>(hashSet2);
        Collections.sort(myList2);
        System.out.println("List<Employee> from HashSet after sort(); by salary:" + myList2);
    }

}
