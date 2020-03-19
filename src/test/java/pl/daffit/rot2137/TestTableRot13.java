package pl.daffit.rot2137;

import org.junit.Assert;
import org.junit.Test;
import pl.daffit.rot2137.impl.TableRot13;

public class TestTableRot13 {

    @Test
    public void testRot13_encode() {
        TableRot13 rot13 = new TableRot13();
        String result = rot13.encode("Hello World!");
        Assert.assertEquals("UryyB kBEyq", result);
    }

    @Test
    public void testRot13_decode() {
        TableRot13 rot13 = new TableRot13();
        String result = rot13.decode("UryyB jBEyq");
        Assert.assertEquals("Hello World", result);
    }
}
