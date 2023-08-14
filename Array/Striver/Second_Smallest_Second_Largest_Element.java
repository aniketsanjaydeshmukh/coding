package Array.Striver;

import java.util.Arrays;

public class Second_Smallest_Second_Largest_Element {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSecondOrderElements(new int[]{1, 2, 3, 7, 7, 4, 5})));
    }

    private static int[] getSecondOrderElements(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < small) {
                secondSmall = small;
                small = i;
            } else if (i < secondSmall) {
                secondSmall = i;
            }

            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        return new int[]{secondLargest,secondSmall};
    }
}
