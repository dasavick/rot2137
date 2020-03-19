package pl.daffit.rot2137;

import org.junit.Assert;
import org.junit.Test;
import pl.daffit.rot2137.impl.TableRot2137;

public class TestTableRot2137 {

    @Test
    public void testRot2137_encode() {
        TableRot2137 rot2137 = new TableRot2137();
        String result = rot2137.encode("Hello World!");
        Assert.assertEquals("CYggj RjmgX", result);
    }

    @Test
    public void testRot2137_decode() {
        TableRot2137 rot2137 = new TableRot2137();
        String result = rot2137.decode("CYggj RjmgX");
        Assert.assertEquals("Hello World", result);
    }
}
