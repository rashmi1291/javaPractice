package interview.practice.string;

public class Substring {

    public static void main(String args[]) {
        String s3 = "JournalDev";
        int start = 0;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.length());

        if (end == 5) {
            s3 = s3.substring(start, end);
            System.out.println(s3);
        }

        System.out.println(s3);
        System.out.println(s3.substring(start, end));
        System.out.println(s3.length());
    }
}