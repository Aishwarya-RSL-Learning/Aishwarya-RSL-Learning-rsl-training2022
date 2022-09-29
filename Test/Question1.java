
import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        int[]arr = {1,2,-3,4,5};
        int product = -15;
        pairsWithGivenProduct(arr, product);
    }
    public static void pairsWithGivenProduct(int[]arr, int product){
        int length = arr.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i]*arr[j]==product){
                    System.out.print(arr[i]+ " "+ arr[j]);
                    System.out.println();
                }
            }
        }
    }
}
