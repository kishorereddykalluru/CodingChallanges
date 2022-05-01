package algoexpert.strings.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {

    //awesome
    public static String runLengthEncoding(String string) {
        StringBuilder sb = new StringBuilder();
        int currentLength = 1;

        for(int i = 1; i < string.length(); i++){
            char currentChar = string.charAt(i);
            char previousChar = string.charAt(i -1);

            if(currentChar != previousChar || currentLength == 9){
                sb.append(currentLength).append(previousChar);
                currentLength = 0;
            }
                currentLength++;
        }
        sb.append(currentLength).append(string.charAt(string.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(runLengthEncoding(";;;;;;;;;;;;''''''''''''''''''''1233333332222211112222111s"));
    }
}
