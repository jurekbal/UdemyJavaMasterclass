package otherStuff;

public class MyBoolean {
    private boolean value;

    public MyBoolean(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value) {
            return "PRAWDA";
        } else {
            return "FAŁSZ";
        }
    }
}
