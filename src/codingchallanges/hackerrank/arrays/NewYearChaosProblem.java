package codingchallanges.hackerrank.arrays;

import java.util.Scanner;

public class NewYearChaosProblem {

    /**
     * returns minimum bribes each person took in a queue
     * @param q
     */
    static void minimumBribes(int[] q) {
        int swap = 0;
        for(int i = q.length-1; i >= 0; i--){
            if(q[i] != i+1){
                if(((i-1) >= 0) && q[i-1] == i+1){
                    swap++;
                    swap(q, i-1, i);
                } else if(((i - 2) >=0 ) && q[i-2] == i+1){
                    swap += 2;
                    swap(q, i-2, i-1);
                    swap(q, i-1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swap);
    }

    private static void swap(int[] q, int i, int i1) {
            int temp = q[i1];
            q[i1] = q[i];
            q[i] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
