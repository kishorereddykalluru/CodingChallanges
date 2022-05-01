package algoexpert.recursion.easy;

public class FibonacciSeries {

    public static int getNthFib(int n) {
        if( n == 2) return 1;
        else if(n == 1) return 0;
        else return getNthFib(n) + getNthFib(n-1);
    }

    public static int getNthFib1(int n){
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

}
