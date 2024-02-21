public class ReverseTheNumusingRec {
    public static void main(String[] args) {
        rever(3421);
        System.out.println(result);
    }
    /*
    If you declare the result variable as a non-static variable inside the rever method, it will become a local variable within that method. As a local
    variable, its scope will be limited to the rever method, and it won't be accessible outside of that method. Therefore, if you try to print the value of
    result in the main method after calling rever, it will result in a compilation error, as result will not be recognized in the main method.
    */
    static int result=0; 
    static void rever(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        result=result*10+rem;
        rever(num/10);
    }
}
