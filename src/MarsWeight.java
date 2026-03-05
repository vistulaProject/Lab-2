import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MarsWeight {
    static float earthsWeightIsmail = 71.0f;
    static float marsGravity = 0.38f;
    static float marsWeightIsmail;

    static double marsWeightDoubleIsmail;
    static int marsWeightIntIsmail;
    static char marsWeightCharIsmail;
    static int charMathResultIsmail;


    public static void main(String[] args){
        marsWeightIsmail = earthsWeightIsmail * marsGravity;
        out.println("Calculated mars weight : " + marsWeightIsmail);

        // assign to Double
        marsWeightDoubleIsmail = marsWeightIsmail;
        out.printf("Converted mars Weight with 4 decimal places: %.4f\n",marsWeightDoubleIsmail);

        // assign the converted int to marsWeightIntIsmail and it's called casting
        marsWeightIntIsmail = (int) marsWeightDoubleIsmail;
        out.println("Casted mars Weight in Integer : "+marsWeightIntIsmail);

        // assign the converted char to marsWeightCharIsmail
        marsWeightCharIsmail = (char) marsWeightIntIsmail;
        out.println("Casted mars Weight in character : " + marsWeightCharIsmail);

        // assign to result with an addition operation to marsWeightCharIsmail
        charMathResultIsmail = marsWeightCharIsmail + 5;
        out.println("Final result by adding 5 to marsWeightCharIsmail : "+charMathResultIsmail);
    }

}