public class VatCalculate {
    public static void main(String[] args) {
        double netPrice = 9.99;
        double vat = 0.23;

        double grossPriceInDecimal = netPrice * (1 + vat);
        double grossFor10000InDecimal = grossPriceInDecimal * 10000;
        double netFromGrossInDecimal = grossFor10000InDecimal / (1 + vat);

        System.out.println("Net price: " + netPrice);
        System.out.println("Gross price: " + grossPriceInDecimal);
        System.out.println("Gross value for 10000 pcs: " + grossFor10000InDecimal);
        System.out.println("Net value from gross: " + netFromGrossInDecimal);
    }
}
