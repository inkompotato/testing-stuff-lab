import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.Console;

public class TaxTimeTest {

    Console console = System.console();

    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        TaxTime.main(new String[]{"1000000","2"});

        // Verify the results
    }
}
