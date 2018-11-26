package interview.pratice.miscellaneous;

public class IsPerfectNumber {

    boolean isPerfectNumber(int num) {
        int temp = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                temp = temp + i;
            }
        }
        if (temp == num) {
            System.out.println(num + " is a perfect number");
            return true;
        }
        else {
            System.out.println(num + " is not a perfect number");
            return false;
        }

    }

    public static void main(String[] args) {
        IsPerfectNumber ipm = new IsPerfectNumber();
        ipm.isPerfectNumber(6);
        ipm.isPerfectNumber(28);
        ipm.isPerfectNumber(50);
    }

}
