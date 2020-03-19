package pl.daffit.rot2137;

public abstract class UnicodeRotED {

    private final int step;

    /**
     * @param step Size of single character move
     */
    public UnicodeRotED(int step) {
        this.step = step;
    }

    public int getStep() {
        return this.step;
    }

    /**
     * @param rawString Unencrypted string
     * @return Encoded string
     */
    public String encode(String rawString) {

        StringBuilder buffer = new StringBuilder();
        char[] chars = rawString.toCharArray();

        for (char singleChar : chars) {
            buffer.append((char) (singleChar + this.getStep()));
        }

        return buffer.toString();
    }

    /**
     * @param encryptedString Encrypted string
     * @return Decoded string
     */
    public String decode(String encryptedString) {

        StringBuilder buffer = new StringBuilder();
        char[] chars = encryptedString.toCharArray();

        for (char singleChar : chars) {
            buffer.append((char) (singleChar - this.getStep()));
        }

        return buffer.toString();
    }
}
