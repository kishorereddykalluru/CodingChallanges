package dummy;

import java.util.Objects;

public class Pairs {
    
    private int num1;
    private int num2;

    public Pairs(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pairs pairs = (Pairs) o;
        return num1 == pairs.num1 && num2 == pairs.num2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }
}
