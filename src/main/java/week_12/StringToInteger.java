package week_12;

public class StringToInteger {
    public static int convertStringToInteger(String strNums) {
        int num = 0;
        for (int i = 0; i < strNums.length(); i++) {
            char ch = strNums.charAt(i);
            int digit = ch - '0';
            num = num * 10 + digit;
        }
        return num;
    }

    public static void main(String[] args) {
        String strNumbers = "12345";
        int result = convertStringToInteger(strNumbers);
        System.out.println(result);
    }
}
