package leetcode;

public class IntToRoman {
    private Numerals[] numerals = {
        new Numerals("M", 1000),
        new Numerals("CM", 900),
        new Numerals("D", 500),
        new Numerals("CD", 400),
        new Numerals("C", 100),
        new Numerals("XC", 90),
        new Numerals("L", 50),
        new Numerals("XL", 40),
        new Numerals("X", 10),
        new Numerals("IX", 9),
        new Numerals("V", 5),
        new Numerals("IV", 4),
        new Numerals("I", 1)
    };

    public String intToRoman(int num){
        String result = "";
        for(Numerals numeral: numerals){
            int numberOfSymbols = num / numeral.value;
            if(numberOfSymbols != 0) result+= numeral.symbol.repeat(numberOfSymbols);
            num %= numeral.value;
        }
        return result;
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(2994));
    }
    class Numerals {
        String symbol;
        int value;

        Numerals(String symbol, int value){
            this.symbol = symbol;
            this.value = value;
        }
    }
}
