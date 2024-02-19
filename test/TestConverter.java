import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {

    @Test
    public void testConversionToMorse() {
        assertEquals("*-", Converter.toMorse("A"));
    }

    @Test
    public void testConversionToText() {
        assertEquals("A", Converter.fromMorse("*-"));
    }

    @Test
    public void testUnknownChar() {
        assertEquals("?", Converter.toMorse("@"));
    }
}
