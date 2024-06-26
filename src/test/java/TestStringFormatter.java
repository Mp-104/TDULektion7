import org.example.StringFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStringFormatter {

    StringFormatter stringFormatter = new StringFormatter();

    @Test
    public void test1 () {

        String input = "test";

        String test = stringFormatter.toNameFormat(input);

        Assertions.assertEquals("Test", test);
    }

    @Test
    public void testFailCorrected () {

        String input = "test";

        String test = stringFormatter.toNameFormat(input);

        Assertions.assertEquals("Test", test);

    }
}
