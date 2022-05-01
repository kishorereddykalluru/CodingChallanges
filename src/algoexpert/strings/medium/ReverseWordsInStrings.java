package algoexpert.strings.medium;

public class ReverseWordsInStrings {

    public static String reverseWordsInString(String string) {
        StringBuilder sb = new StringBuilder();
        int index = string.length();
        for(int i = string.length() - 1; i >= 0 ; i--){
            if(string.charAt(i) == ' '){
                sb.append(string.substring(i+1, index) + string.charAt(i));
                index = i;
            } else if(i == 0){
                sb.append(string.substring(0, index));
            }
        }
        return sb.toString();
    }

    public static String reverseWordsInString_leetcode(String string) {
        StringBuilder sb = new StringBuilder();

        String[] split = string.split(" ");
        for(int i = split.length - 1 ; i >= 0 ; i--){
            if(!split[i].equals("")) {
                sb.append(split[i] + " ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWordsInString_leetcode("example   good a"));
//        String s = "tim is great";
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == ' '){
//                System.out.println(i);
//            }
//        }
    }
}
