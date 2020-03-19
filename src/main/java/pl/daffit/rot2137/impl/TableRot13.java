package pl.daffit.rot2137.impl;

import pl.daffit.rot2137.TableRotED;

public class TableRot13 extends TableRotED {

    public static final int ROT_STEP = 13;

    /**
     * Pretty boring, huh?
     */
    public TableRot13() {
        super(ROT_STEP);
    }

    public TableRot13(char[] charTable) {
        super(ROT_STEP, charTable);
    }
}
