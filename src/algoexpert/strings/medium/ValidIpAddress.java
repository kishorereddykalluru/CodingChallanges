package algoexpert.strings.medium;

import java.util.ArrayList;

public class ValidIpAddress {

    public static ArrayList<String> validIpAddress(String string) {
        ArrayList<String> ipAddressFound = new ArrayList<>();

        for(int i = 1; i < Math.min(string.length(), 4); i++){
            String[] currentIpAddressParts = new String[]{"", "", "",""};

            currentIpAddressParts[0] = string.substring(0, i);
            if(!isValidPart(currentIpAddressParts[0])){
                continue;
            }

            for (int j = i + 1; j < i + Math.min(string.length() -i, 4); j++){
                currentIpAddressParts[1] = string.substring(i, j);
                if(!isValidPart(currentIpAddressParts[1])){
                    continue;
                }

                for(int k = j+1; k < j + Math.min(string.length()-j, 4); k++){
                    currentIpAddressParts[2] = string.substring(j,k);
                    currentIpAddressParts[3] = string.substring(k);

                    if(isValidPart(currentIpAddressParts[2]) && isValidPart(currentIpAddressParts[3])){
                        ipAddressFound.add(join(currentIpAddressParts));
                    }
                }
            }
        }
        return ipAddressFound;
    }

    public static boolean isValidPart(String string){
        int stringAsInt = Integer.parseInt(string);
        if(stringAsInt > 255){
            return false;
        }
        return string.length() == Integer.toString(stringAsInt).length();
    }

    public static String join(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < strings.length; l++) {
            sb.append(strings[l]);
            if (l < strings.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "1921680";
        ArrayList<String> strings = validIpAddress(str);
        System.out.println(strings);

    }
}
