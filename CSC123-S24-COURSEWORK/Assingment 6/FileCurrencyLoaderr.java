
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileCurrencyLoaderr extends AbstractCurrencyLoader{

    private static final String FILE_PATH = "C:\\Users\\renes\\Downloads\\currencies.csv";

    @Override
    protected InputStream getStream() throws FileNotFoundException {
        return new FileInputStream(FILE_PATH);
    }
}