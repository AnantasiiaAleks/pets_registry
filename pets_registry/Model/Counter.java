package Model;

public class Counter {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void add() {
        this.value ++;
    }

    public void deleteOne() {
        this.value --;
    }

    public void deleteAll() {
        this.value = 0;
    }
}
