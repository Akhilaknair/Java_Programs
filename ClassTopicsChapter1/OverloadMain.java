public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Main method with String array args.");
        main(5);
    }

    public static void main(int x) {
        System.out.println("Overloaded main method with int: " + x);
    }
}