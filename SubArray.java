import java.util.ArrayList;

public class SubArray {
    public static void subArr(int numbers[]) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i; j <= numbers.length - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.println();
                newArray.add(sum);
            }
            System.out.println();
        }

        // Print the elements in newArray
        System.out.println("Min Max from Subarray");
        int min = newArray.get(0);
        int max = newArray.get(0);
        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.get(i) < min) {
                min = newArray.get(i);
            }
            if (newArray.get(i) > max) {
                max = newArray.get(i);
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArr(numbers);
    }
}