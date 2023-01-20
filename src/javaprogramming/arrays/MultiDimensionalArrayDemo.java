package javaprogramming.arrays;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        int[][] multi = {{1,2,3,4,5,6}, {7,8,9,0,1,2}, {3,4,5,6,7,8}};

        for(int i = 0; i < multi.length; i++){
            for(int j = 0; j < multi[i].length; j++){
                System.out.print(multi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
