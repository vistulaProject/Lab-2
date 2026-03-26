public class NumberParityCheck {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 100);

        System.out.println("Random number: " + number);

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}