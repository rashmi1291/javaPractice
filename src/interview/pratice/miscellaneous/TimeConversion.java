package interview.pratice.miscellaneous;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    /**
     * Convert time from 12 hour format to 24 hour format.
     */
    static String timeConversion(String s) {

        int hh = Integer.parseInt((s.substring(0, 2)));
        String amPm = s.substring(8, 10);
        System.out.println("amPm: " + amPm);
        String hr = Integer.toString(hh);
        String convertedTime = s.substring(0, 8);
        System.out.println("convertedTime" + convertedTime);
        if ("PM".equals(amPm)) {
            if (hh == 12) {
                convertedTime = s.substring(0, 8);
            }
            else {
                hh = hh + 12;
                hr = Integer.toString(hh);
                System.out.println(hh);
                convertedTime = hr + s.substring(2, 8);
            }
        }
        else if ("AM".equals(amPm) && hh == 12) {
            hr = "00";
            System.out.println(hr);
            convertedTime = hr + s.substring(2, 8);
        }

        return convertedTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}
