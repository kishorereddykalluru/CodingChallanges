package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static String longestPrefix(String[] elements) {
        if(elements.length == 0) return "";
        String prefix = elements[0];
        for(int i = 1; i < elements.length; i++){
            while(elements[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    
    public static void main(String args[]) {
        String [] elements = {"flower","flow","flight"};

        System.out.println("longestPrefix(elements) = " + longestPrefix(elements));
    }
}
