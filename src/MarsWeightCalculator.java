public class MarsWeightCalculator {

    static float earthWeight = 71.0f;
    static float marsGravity = 0.38f;

    static float marsWeight;
    static double marsWeightDouble;
    static int marsWeightInt;
    static char marsWeightChar;
    static int result;

    public static void main(String[] args) {

        marsWeight = earthWeight * marsGravity;
        System.out.println("Weight on Mars: " + marsWeight);

        marsWeightDouble = marsWeight;
        System.out.printf("Mars weight with 4 decimals: %.4f\n", marsWeightDouble);

        marsWeightInt = (int) marsWeightDouble;
        System.out.println("Mars weight as int: " + marsWeightInt);

        marsWeightChar = (char) marsWeightInt;
        System.out.println("Mars weight as char: " + marsWeightChar);

        result = marsWeightChar + 5;
        System.out.println("Final result after adding 5: " + result);
    }
}