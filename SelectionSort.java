//select the largest element in the array and put in the last position of array
import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args){
        int[] arr={2,5,1,6,7,2,13};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void sort(int[] arr){
               for(int i=0;i<arr.length;i++) {
                   int last = arr.length-i-1;
                   int max = getmaxvalue(arr, 0, last);
                   swap(arr, last, max);
               }
        }
        static int getmaxvalue(int[] arr,int start,int end){
          int max=start;
          for(int i=0;i<=end;i++){
                   if(arr[max]<arr[i]){
                       max=i;
                   }
          }
          return max;
        }
        static void swap(int[] arr, int first,int second){
          int temp=arr[first];
          arr[first]=arr[second];
          arr[second]=temp;
        }
}
