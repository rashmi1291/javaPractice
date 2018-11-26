package interview.pratice.miscellaneous;

import java.util.ArrayList;
import java.util.List;
// Perfect number, a positive integer that is equal to the sum of its proper divisors. 

public class FindingPerfectNumber {

    private List<Integer> findPerfectNumbers(List<Integer> numbers) {

        List<Integer> perfectNumbers = new ArrayList<>();

        for (int num : numbers) {
            int temp = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    temp = temp + i;
                }
            }
            if (temp == num) {
                perfectNumbers.add(temp);
            }
        }

        return perfectNumbers;

    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(7);
        numbers.add(28);
        numbers.add(31);
        FindingPerfectNumber findingPerfectNumber = new FindingPerfectNumber();
        System.out.println("List of numbers to be checked");
        for(int num: numbers){
            System.out.print(num + " ");
        }
        List<Integer> resultList= findingPerfectNumber.findPerfectNumbers(numbers);
        System.out.println("");
        System.out.println("List of perfect numbers");
        for(int num: resultList){
            System.out.print(num + " ");
        }
        
    }
}
