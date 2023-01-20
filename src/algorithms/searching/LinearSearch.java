package algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {

        int[] input = {-22, 35, 1, 55, 7, -15, 20};

        System.out.println(linearSearch(input,55));
        System.out.println(linearSearch(input,1));
        System.out.println(linearSearch(input,8888));
        System.out.println(linearSearch(input,-15));
    }

    public static int linearSearch(int[] input, int value){
        for(int i = 0 ; i < input.length; i++){
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }

}
