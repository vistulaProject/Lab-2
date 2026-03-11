public class BlockNeeds {

    public static void main(String[] args){

        // This is extra work. instead of choosing fixed number i choosing randomly
        int amountOfBricks = getRandomNumber(50,100,"odd");
        int containerCapacity = getRandomNumber(5,10,"even");

        int fullContainers = amountOfBricks / containerCapacity;
        int remainingBlocks = amountOfBricks % containerCapacity;

        int totalContainers;

        if (remainingBlocks > 0) {
            totalContainers = fullContainers + 1;
        } else {
            totalContainers = fullContainers;
        }

        System.out.println("Amount of bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);
        System.out.println("Full containers: " + fullContainers);
        System.out.println("Total containers needed: " + totalContainers);
        System.out.println("Blocks in the last container: " + remainingBlocks);
    }



    static int getRandomNumber(int start, int end, String oddOrEven) {
        int num;

        while (true) {
            num = (int) ((Math.random() * (end - start)) + start);

            if (oddOrEven.equals("odd") && num % 2 != 0) {
                return num;
            }

            if (oddOrEven.equals("even") && num % 2 == 0) {
                return num;
            }
        }
    }
}   
