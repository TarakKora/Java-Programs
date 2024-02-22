// for every one iteration in outer loop, if i=0 then upto i+1, that is i=1 the array should be sorted
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr={2,3,4,5,-6,-9,13,19,27,67,56,100,1,0,-1,-4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
