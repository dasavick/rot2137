package pl.daffit.rot2137.impl;

import pl.daffit.rot2137.TableRotED;

public class TableRot2137 extends TableRotED {

    public static final int ROT_STEP = 2137;

    /**
     * 21:37
     */
    public TableRot2137() {
        super(ROT_STEP);
    }

    public TableRot2137(char[] charTable) {
        super(ROT_STEP, charTable);
    }
}
