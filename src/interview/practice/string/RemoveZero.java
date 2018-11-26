package interview.practice.string;

// have method to remove leading zero from string.
public class RemoveZero {

    public static void main(String[] args) {
        String str = "00001232400";

        System.out.println(removeZero(str));
    }

    private static String removeZero(String str) {
        int i = 0;
        while (str.charAt(i) == '0') {
            i++;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.replace(0, i, "");

        return stringBuffer.toString();

    }

}
