// for every iteration the largest element come to its correct index, largest element comes to last index of element and then next element and so on.........

import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 3, 2, 6, 7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
