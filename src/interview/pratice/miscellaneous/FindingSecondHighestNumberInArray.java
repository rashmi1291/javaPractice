package interview.pratice.miscellaneous;

public class FindingSecondHighestNumberInArray {

    public int getSecondHighestNumber(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        return numbers[numbers.length - 2];
    }

    public static void main(String[] args) {

        int numbers[] = { 10, 22, 13, 9 };
        FindingSecondHighestNumberInArray shn = new FindingSecondHighestNumberInArray();
        System.out.println("Second highest number= " + shn.getSecondHighestNumber(numbers));
    }

}
