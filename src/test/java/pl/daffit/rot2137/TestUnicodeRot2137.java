package pl.daffit.rot2137;

import org.junit.Assert;
import org.junit.Test;
import pl.daffit.rot2137.impl.UnicodeRot2137;

public class TestUnicodeRot2137 {

    @Test
    public void testRot2136_encode() {
        UnicodeRot2137 rot2137 = new UnicodeRot2137();
        String result = rot2137.encode("Hello World!");
        Assert.assertEquals("ࢡ\u08BE\u08C5\u08C5\u08C8\u0879ࢰ\u08C8\u08CB\u08C5ࢽ\u087A", result);
    }

    @Test
    public void testRot2136_decode() {
        UnicodeRot2137 rot2137 = new UnicodeRot2137();
        String result = rot2137.decode("ࢡ\u08BE\u08C5\u08C5\u08C8\u0879ࢰ\u08C8\u08CB\u08C5ࢽ\u087A");
        Assert.assertEquals("Hello World!", result);
    }
}
