package javaprogramming.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(matchAlphaNumbericCharacters("abc#123"));
    }

    private static boolean matchAlphaNumbericCharacters(String s) {
        Pattern pattern = Pattern.compile("^[a-z0-9]*$");
        Matcher matcher = pattern.matcher(s);

        return matcher.find();
    }


}
