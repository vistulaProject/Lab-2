public class BrickContainerCalculator {

    public static void main(String[] args) {

        int bricks = 67;
        int capacity = 9;

        int full = bricks / capacity;
        int rest = bricks % capacity;

        int total;

        if (rest > 0) {
            total = full + 1;
        } else {
            total = full;
        }

        System.out.println("Bricks: " + bricks);
        System.out.println("Container size: " + capacity);
        System.out.println("Full containers: " + full);
        System.out.println("Total containers needed: " + total);
        System.out.println("Bricks in last container: " + rest);
    }


}