package Learn;

public class LangKey {
 private int key;
 private String value;

    public LangKey(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    /**
     *  Ghi đè phương thức hashCode()
     *  Phương thức này luôn trả về: 5
     */
    @Override
    public int hashCode() {
        return 5;
    }

    /**
     *  Ghi đè phương thức equals()
     *  Phương thức này luôn trả về: true
     */
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
