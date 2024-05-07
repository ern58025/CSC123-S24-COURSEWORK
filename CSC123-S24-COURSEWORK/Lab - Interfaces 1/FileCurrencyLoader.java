import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCurrencyLoader implements ICurrencyLoader {

    @Override
    public Map<String, Double> loadCurrencies() {
        Map<String, Double> currencies = new HashMap<>();
        try {
            File file = new File("C:\\Users\\renes\\Downloads\\currencies.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String currencyName = parts[0].trim();
                    double exchangeRate = Double.parseDouble(parts[1].trim());
                    currencies.put(currencyName, exchangeRate);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class FileCurrencyLoader implements ICurrencyLoader {
//
//    @Override
//    public Map<String, Double> loadCurrencies() {
//        Map<String, Double> currencies = new HashMap<>();
//        Map m = new HashMap<String,Double>();
//        try {
//            File file = new File("C:\\Users\\renes\\Downloads\\currencies.csv");
//            Scanner scanner = new Scanner(file);
//            String line=null;
//            
//            while ((line = scanner.nextLine() != null) {
//                String line = scanner.nextLine();
//                String[] parts = line.split(",");
//                if (parts.length == 2) {
//                    String currencyName = parts[0].trim();
//                    double exchangeRate = Double.parseDouble(parts[1].trim());
//                    currencies.put(currencyName, exchangeRate);
//                }
//            }
//            scanner.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return currencies;
//    }
//}
