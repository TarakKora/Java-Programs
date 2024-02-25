public class LinearSearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 6, 8, 3, 4, 5, 9};
        System.out.println(search(arr,3,0));
        System.out.println(findindex(arr,3,0));

    }

    static boolean search(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, index + 1, target);
    }

    static int findindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index+1);
        }
    }
}
