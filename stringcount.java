import java.util.*;

class stringcount {
    public static void stringcount(String str) {
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("Upper case: " + uppercase);
        System.out.println("Lower case: " + lowercase);
        System.out.println("Digit count: " + digit);
        System.out.println("Spaces: " + spaces);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        stringcount(str);
    }
}