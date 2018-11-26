package interview.pratice.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class FindingSecondHighestNumberInList {

    public int findSecondHighestNumber(List<Integer> numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        int secondMax = 0;
        for (int number : numbers) {
            if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(29);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(31);
        FindingSecondHighestNumberInList findingSecondHighestNumber = new FindingSecondHighestNumberInList();
        System.out.println("List of numbers to be checked");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("Second Highest number= " + findingSecondHighestNumber.findSecondHighestNumber(numbers));
    }
}
