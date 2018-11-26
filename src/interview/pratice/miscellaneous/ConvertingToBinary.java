package interview.pratice.miscellaneous;

public class ConvertingToBinary {

    public static void getBinaryNumber(int n) {

        int binaryNum[] = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {

            System.out.print(binaryNum[j]);
        }
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println("Binary number for " + num + ": ");
        getBinaryNumber(num);
    }

}
