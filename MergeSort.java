import java.util.Arrays;
public class mergesortalgo {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,9,34,56,0,23,-1,-9, 4, 2, 3, 6, 8, 9, 4};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
        static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
            int mid=arr.length/2;
            int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
            int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(left,right);
        }
        static int[] merge(int[] first,int[] second){
             int i=0,j=0,k=0;
             int[] result=new int[first.length+second.length];
             while(i<first.length && j<second.length){
                 if(first[i]<second[j]){
                     result[k]=first[i];
                     i++;
                 }
                 else{
                     result[k]=second[j];
                     j++;
                 }
                 k++;
             }
             while(i<first.length){
                 result[k]=first[i];
                 i++;
                 k++;
             }
             while(j<second.length){
                 result[k]=second[j];
                 j++;
                 k++;
             }
             return result;
        }
    }
