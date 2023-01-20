package codingchallanges.interviewquestions;

import java.util.Objects;

public class Pair {

    private int num;
    private int result;

    public Pair(int num, int result) {
        this.num = num;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return (num == pair.num && result == pair.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, result);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "num=" + num +
                ", result=" + result +
                '}';
    }
}
