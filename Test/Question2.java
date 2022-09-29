
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int []arr = {-15, -20, 1, 2, 30};
        System.out.println(maxTripletProduct(arr));
    }
    public static long maxTripletProduct(int[]arr){
        //sort the array
        Arrays.sort(arr);
        int  length = arr.length;
        //if length is less than 3 means triplet doesn't exist
        if(length<3){
            System.out.println("There is no any Triplet");
        }
        //case 1 : if all elements are positive then max product will be product of last 3 elements
        long product1 = arr[length-1]*arr[length-2]*arr[length-3];
        //case 2 : if there are negative elements in the array
        long product2 = arr[0]*arr[1]*arr[length-1];
        //maximum product will be max from above two cases
        long maxProduct = Math.max(product1, product2);
        return maxProduct;
    }
}
