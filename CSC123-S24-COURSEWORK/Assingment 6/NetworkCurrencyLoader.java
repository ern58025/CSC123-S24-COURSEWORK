import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class NetworkCurrencyLoader extends AbstractCurrencyLoader {

    private static final String EXCHANGE_RATE_URL = "http://www.usman.cloud/banking/exchange-rate.csv";

    @Override
    protected InputStream getStream() throws IOException {
        URL url = new URL(EXCHANGE_RATE_URL);
        return url.openStream();
    }
}