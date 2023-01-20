package algorithms.sorting;

public class Recursion {

    public static void main(String[] args) {

        System.out.println("factorial = " + recursiveFactorial(15));
        
    }
    
    private static int recursiveFactorial(int num){
        if(num == 0)
            return 1;
        
        return num * recursiveFactorial(num - 1);
    }
}
