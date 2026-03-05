public class EvenOrOdd {
    public static void main(String[] args){
        // math randon always give in the range 0-1 so we multiply with our range max value, Then we get in 1-100
        int randomNumber =(int) (Math.random() * 100);
        System.out.println("Random number is "+randomNumber);
        // Using if condition to find the even or odd by using division by 2
        if(randomNumber % 2 == 0){
            System.out.println("Number "+randomNumber+" is Even");
        }else{
            System.out.println("Number "+randomNumber+" is Odd");
        }

    }
}
