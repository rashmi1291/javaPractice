package interview.practice.string;

public class ReverseString {

    public static void main(String[] args) {
        String stringToReverse = "Rashmi Kannaujia";
        char[] output = new char[stringToReverse.length()];

        char[] input = stringToReverse.toCharArray();
        int j=0;
        for (int i = input.length - 1; i >= 0; i--) {
        	
            output[j] = input[i];
            j++;
           

        }
        for(int k=0; k< output.length; k++){
        System.out.print(output[k]);}
    }
    
}
