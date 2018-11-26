package interview.pratice.miscellaneous;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertTimestampToDate {

    public static void main(String[] args) {

        System.out.println(convertTimestampToDateFormat(new Timestamp(48000)));
        System.out.println(new Timestamp(48000));
    }

    public static String convertTimestampToDateFormat(Timestamp timestamp) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String validDate = df.format(timestamp.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
        String validTime = sdf.format(timestamp);

        String dateTimeWithT = validDate + "T" + validTime;

        return dateTimeWithT;

    }
}
