package lambda_stream.lesson1_2;

public class Application {
    public static void main(String[] args) {
        Human tom = new Human();
        walker(tom);
        Robot wale = new Robot();
        walker(wale);
        System.out.println();
        System.out.println("Using functional interface");

        walker(() -> System.out.println("Custom object walking ..."));

        ALambdaInterface aBlockOfCode = () -> {
            System.out.println("Custom object walking ...");
            System.out.println("the object tripped ...");
        };

        Walkable aBlockOfCode1 = () -> {
            System.out.println("Custom object walking ...");
            System.out.println("the object tripped ...");
        };
        walker(aBlockOfCode1);
        ALambdaInterface helloVar = () -> System.out.println("Hello there");
        Calculate sumVar = (a, b) -> a + b;
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroDivide = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroDivide.compute(10, 5));
        StringWorker revers = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println(revers.work("Vehicle"));
        NumberWorker computerNumber = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(computerNumber.compute(10));
        MyGenericInterface<String> rev = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println("MyGenericInterface to String: " + rev.work("Vehicle"));
        MyGenericInterface<Integer> computerNum = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("MyGenericInterface to Integer: " + computerNum.work(10));

    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    public String revers(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            return i * result;
        }
        return result;
    }


    public static void walker(Walkable walkable) {
        walkable.walk();
    }
}

interface Calculate {
    int compute(int a, int b);
}

interface StringWorker {
    String work(String str);
}

interface NumberWorker {
    int compute(int a);
}

interface MyGenericInterface<T> {
    T work(T t);
}

