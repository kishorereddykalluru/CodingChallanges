package algoexpert.recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    private static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for(Object e1: array){
            if(e1 instanceof ArrayList) {
                ArrayList<Object> ls = (ArrayList<Object>)e1;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                sum += (int) e1;
            }
        }
        return sum * multiplier;
    }

    public static void main(String[] args) {

        List<Object> internalList1 = new ArrayList<>();
        internalList1.add(7);
        internalList1.add(-1);

        List<Object> internalList2 = new ArrayList<>();
        internalList2.add(-13);
        internalList2.add(8);

        List<Object> internalList3 = new ArrayList<>();
        internalList3.add(6);
        internalList3.add(internalList2);
        internalList3.add(4);

        List<Object> objList = new ArrayList<>();
        objList.add(5);
        objList.add(2);
        objList.add(internalList1);
        objList.add(3);
        objList.add(internalList3);

        System.out.println(productSum(objList));
    }
}
