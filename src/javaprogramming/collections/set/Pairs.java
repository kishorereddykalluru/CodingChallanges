package javaprogramming.collections.set;

import java.util.Objects;

public class Pairs {

    private int num1;
    private int num2;

    public Pairs(int num1, int num2){
        this.num1 = num1;
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

    @Override
    public String toString() {
        return "Pairs{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
