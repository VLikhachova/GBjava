public class GeekBrainsHw1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 19;
        int c = a+b;
        if (c >= 0) {
            System.out.println ("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        };
    }
    public static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println ("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println ("Yellow");
        }
        if (value > 100) {
            System.out.println ("Green");
        }
    }
    public static void compareNumbers() {
        int a = 74;
        int b = 11;
        if (a>=b) {
            System.out.println ("a>=b");
        }
        else {
            System.out.println ("a<b");
        }
    }
}
