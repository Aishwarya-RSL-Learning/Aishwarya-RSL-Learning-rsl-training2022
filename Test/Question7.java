import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        int[] arr = {14, 12, 70, 15, 95, 65, 22, 30};
        System.out.println(findSecondMaxDiff(arr));
    }

    public static int findSecondMaxDiff(int[] arr) {
        //finding largest and second largest number
        int length = arr.length;
        //if array length is less than 2 then printing 0
        if (length < 2) {
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        //ans can be maximum of (difference between largest and second smallest) and (difference between second largest and smallest)
        int ans1 = largest - secondSmallest;
        int ans2 = secondLargest - smallest;
        int finalAns = Math.max(ans1, ans2);
        return finalAns;
    }
}

