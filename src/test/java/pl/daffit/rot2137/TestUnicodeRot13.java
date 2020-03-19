package pl.daffit.rot2137;

import org.junit.Assert;
import org.junit.Test;
import pl.daffit.rot2137.impl.UnicodeRot13;

public class TestUnicodeRot13 {

    @Test
    public void testRot13_encode() {
        UnicodeRot13 rot13 = new UnicodeRot13();
        String result = rot13.encode("Hello World!");
        Assert.assertEquals("Uryy|-d|\u007Fyq.", result);
    }

    @Test
    public void testRot13_decode() {
        UnicodeRot13 rot13 = new UnicodeRot13();
        String result = rot13.decode("Uryy|-d|\u007Fyq.");
        Assert.assertEquals("Hello World!", result);
    }
}
