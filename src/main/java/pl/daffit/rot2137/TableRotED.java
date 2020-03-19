package pl.daffit.rot2137;

public abstract class TableRotED {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final int step;
    private final char[] charTable;
    private final String charTableString;

    /**
     * @param step Size of single character move
     */
    public TableRotED(int step) {
        this.step = step;
        this.charTable = ALPHABET.toCharArray();
        this.charTableString = ALPHABET;
    }

    /**
     * @param step      Size of single character move
     * @param charTable Custom character table
     */
    public TableRotED(int step, char[] charTable) {
        this.step = step;
        this.charTable = charTable;
        this.charTableString = new String(charTable);
    }

    public int getStep() {
        return this.step;
    }

    public char[] getCharTable() {
        return this.charTable;
    }

    public String getCharTableString() {
        return this.charTableString;
    }

    /**
     * @param rawString     Unencrypted string
     * @param removeUnknown Should we remove characters that cannot be found in charTable?
     * @return Encoded string
     */
    public String encode(String rawString, boolean removeUnknown) {

        StringBuilder buffer = new StringBuilder();
        char[] chars = rawString.toCharArray();
        int charTableLength = this.getCharTable().length;

        for (char singleChar : chars) {

            if (Character.isWhitespace(singleChar)) {
                buffer.append(singleChar);
                continue;
            }

            int charIndex = this.getCharTableString().indexOf(singleChar);
            if (charIndex == -1) {
                if (!removeUnknown) {
                    buffer.append(singleChar);
                }
                continue;
            }

            int stepIndex = charIndex + this.getStep();
            while (stepIndex >= charTableLength) {
                stepIndex = stepIndex - (charTableLength - 1);
            }

            buffer.append(this.charTable[stepIndex]);
        }

        return buffer.toString();
    }

    /**
     * Warning:
     * <p>
     * This is a shortcut for {@link #encode(String, boolean)}
     * with 2nd argument, removeUnknown set to true.
     * <p>
     * This method will remove all unknown characters
     * from your input text.
     *
     * @param rawString Unencrypted string
     * @return Encoded string
     */
    public String encode(String rawString) {
        return this.encode(rawString, true);
    }

    /**
     * @param encryptedString Encrypted string
     * @return Decoded string
     */
    public String decode(String encryptedString) {

        StringBuilder buffer = new StringBuilder();
        char[] chars = encryptedString.toCharArray();
        int charTableLength = this.getCharTable().length;

        for (char singleChar : chars) {

            if (Character.isWhitespace(singleChar)) {
                buffer.append(singleChar);
                continue;
            }

            int charIndex = this.getCharTableString().indexOf(singleChar);
            if (charIndex == -1) {
                buffer.append(singleChar);
                continue;
            }

            int stepIndex = charIndex - this.getStep();
            while (stepIndex < 0) {
                stepIndex = charTableLength + stepIndex;
            }

            buffer.append(this.charTable[stepIndex]);
        }

        return buffer.toString();
    }
}
