package javaprogramming.basics;

public class SwitchExample {

    public static void main(String[] args) {

        int day = 5;
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("monday to thursday");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("friday to sunday");
                break;
            default:
                System.out.println("day should be between 1 and 7");
                break;
        }
    }
}
