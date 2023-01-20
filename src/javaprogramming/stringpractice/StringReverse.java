package javaprogramming.stringpractice;

public class StringReverse {

    public static void main(String[] args) {

        /**
         * There are 5 ways to revers a string
         * 1. Using Recursion
         * 2. Reversing array
         * 3. Using String Builder
         * 4. Using String Buffer
         * 5. By Swapping elements
         */
        System.out.println("Reverse String Using Recursion : "+reverseStringUsingRecursion("helloworld"));
        System.out.println("Reverse String : "+reverseString("reverse"));
        System.out.println("Reverse String Using String Builder : "+reverseStringUsingStringBuilder("hello"));
        System.out.println("Reverse String Using String Buffer : "+reverseStringUsingStringBuffer("world"));
        System.out.println("Reverse String Using Swapping elements : "+reverseStringUsingSwappingElements("abcdefg"));
    }

    private static String reverseStringUsingSwappingElements(String reverse) {

        char[] c = reverse.toCharArray();
        int right = c.length - 1;

        for(int left = 0; left < right ; left++, right--){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
        }

        return new String(c);

    }

    private static String reverseStringUsingStringBuffer(String reverse) {
        return new StringBuffer().reverse().toString();
    }

    private static String reverseStringUsingStringBuilder(String reverse) {
        return new StringBuilder().reverse().toString();
    }

    private static String reverseStringUsingRecursion(String reverse) {

        if(reverse.length() == 1)
            return reverse;
        /**
         * remove first character and send substring to reverseStringUsingRecursion()
         * append removed string i.e., charAt(0) to recursive call
         *
         */
        return reverseStringUsingRecursion(reverse.substring(1, reverse.length())) + reverse.charAt(0);
    }

    public static String reverseString(String reverse){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = reverse.length()-1; i >=0 ; i--){
            stringBuilder.append(reverse.charAt(i));
        }

        return stringBuilder.toString();
    }
}
