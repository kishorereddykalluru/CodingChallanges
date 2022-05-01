package algoexpert.strings.easy;

public class CeaserCyberEncryptor {
    // my code
    public static String caesarCypherEncryptor1(String str, int key) {
        String s1 = "";
        key = key % 26;
        for(int i = 0; i < str.length(); i++){
            int newInt = (str.charAt(i) + key);
            if(newInt > 122) {
                s1 += (char)(96 + newInt % 122);
            } else {
                s1 += (char) newInt;
            }
        }
        return s1;
    }

    //simplified code
    public static String caesarCypherEncryptor(String str, int key) {
        char[] ch = new char[str.length()];
        if(key %26 == 0) return str;
        key = key % 26;
        for(int i = 0; i < str.length(); i++){
            ch[i] = getNewChar(str.charAt(i), key);
        }
        return new String(ch);
    }
    public static char getNewChar(char c, int key) {
        int newChar = c + key;
        return newChar <= 122 ? (char) newChar : (char) (96 + newChar % 122);
    }

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor1("ovmqkwtujqmfkao", 52));
    }
}
