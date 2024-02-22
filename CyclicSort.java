/*numbers should be range from either from 0 to n ot 1 to n
according to that if num are starting from 0 to n then correct inde will be that number-1 , and for 1 to n numbers, correct index will be number itself
  */
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args){
        int[] arr={5,6,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
}
