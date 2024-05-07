public class TestClass {

    public static void main(String[] args) {
        Currencies currencies = new Currencies(new FileCurrencyLoader());

        MyCurrency usd = currencies.getCurrency("USD");
        if (usd != null) {
            double amountInCAD = 100.0;
            double amountInUSD = usd.convertToUSD(amountInCAD);
            System.out.println(amountInCAD + " CAD is equivalent to " + amountInUSD + " USD");

            double amountInGBP = usd.convertFromUSD(125.0);
            System.out.println("125 USD is equivalent to " + amountInGBP + " GBP");
        }

        MyCurrency eur = currencies.getCurrency("EUR");
        if (eur == null) {
            System.out.println("EUR currency does not exist.");
        }
    }
}

