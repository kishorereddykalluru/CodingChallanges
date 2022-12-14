package algoexpert.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberMnemonics {

    public static Map<Character, String[]> DIGIT_LETTERS = new HashMap<>();

    static {
        DIGIT_LETTERS.put('0', new String[] {"0"});
        DIGIT_LETTERS.put('1', new String[] {"1"});
        DIGIT_LETTERS.put('2', new String[] {"a", "b", "c"});
        DIGIT_LETTERS.put('3', new String[] {"d", "e", "f"});
        DIGIT_LETTERS.put('4', new String[] {"g", "h", "i"});
        DIGIT_LETTERS.put('5', new String[] {"j", "k", "l"});
        DIGIT_LETTERS.put('6', new String[] {"m", "n", "o"});
        DIGIT_LETTERS.put('7', new String[] {"p", "q", "r", "s"});
        DIGIT_LETTERS.put('8', new String[] {"t", "u", "v"});
        DIGIT_LETTERS.put('9', new String[] {"w", "x", "y", "z"});
    }

    //O(4^n * n) time | O(4^n * n) space
    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        String[] currentMnemonics = new String[phoneNumber.length()];
        Arrays.fill(currentMnemonics, "0");

        ArrayList<String> mnemonicsFound = new ArrayList<>();
        phoneNumberMnemonicsHelper(0, phoneNumber, currentMnemonics, mnemonicsFound);
        return mnemonicsFound;
    }

    public void phoneNumberMnemonicsHelper(int idx, String phoneNumber, String[] currentMnemonics, ArrayList<String> mnemonicsFound) {
        if(idx == phoneNumber.length()) {
            String mnemonics = String.join("", currentMnemonics);
            mnemonicsFound.add(mnemonics);
        } else {
            char digit = phoneNumber.charAt(idx);
            String[] letters = DIGIT_LETTERS.get(digit);
            for(String letter : letters) {
                currentMnemonics[idx] = letter;
                phoneNumberMnemonicsHelper(idx + 1, phoneNumber, currentMnemonics, mnemonicsFound);
            }
        }
    }

    public static void main(String[] args) {


    }
}
