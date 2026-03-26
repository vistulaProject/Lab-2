
import java.math.BigDecimal;
import java.math.RoundingMode;

public class VATComputation {

    public static void main(String[] args) {
        BigDecimal net = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");
        BigDecimal one = new BigDecimal("1");

        BigDecimal gross = net.multiply(one.add(vat));
        gross = gross.setScale(2, RoundingMode.HALF_UP);

        BigDecimal grossTotal = gross.multiply(new BigDecimal("10000"));
        BigDecimal netAgain = grossTotal.divide(one.add(vat), 2, RoundingMode.HALF_UP);

        System.out.println("Net price: " + net);
        System.out.println("Gross price: " + gross);
        System.out.println("Gross for 10000 items: " + grossTotal);
        System.out.println("Net from gross: " + netAgain);
    }
}