//Return all indices of the target element in the array using Recursion
import java.util.ArrayList;
public class FindAllIndicesRec{
    public static void main(String[] args) {
        int[] arr={2,1,0,6,8,8,6,0,1,2,0,6,8};
        System.out.println(findallindices(arr,8,0,new ArrayList<>())) ;
         /* OR
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println(findallindices(arr,8,0,list));
        */
    }
    static ArrayList<Integer> findallindices(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findallindices(arr,target,index+1,list);
    }
}
