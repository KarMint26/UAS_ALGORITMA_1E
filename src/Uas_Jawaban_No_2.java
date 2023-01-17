import java.util.Arrays;

public class Uas_Jawaban_No_2 {

    public static String countPositivesSumNegatives(int[] input){

        int BilanganPositive = 0;
        int BilanganNegatif = 0;
        // Your code here
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                BilanganPositive++;
            } else if (input[i] < 0) {
                BilanganNegatif += input[i];
            }
        }
        return Arrays.toString(new int[]{BilanganPositive, BilanganNegatif});
    }
    public static void main(String[] args) {
        // Output {10, -65}
        System.out.println(countPositivesSumNegatives(new int[] {1,2,3,4,5,6,7,8,9,10, -11, -12, -13, -14, -15}));

        // Output {8, -50}
        System.out.println(countPositivesSumNegatives(new int[] {0,2,3,0,5,6,7,8,9,10,-11,-12,-13,-14}));
    }
}
