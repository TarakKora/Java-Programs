public class ReverseTheNumusingRec {
    public static void main(String[] args) {
        rever(3421);
        System.out.println(result);
    }
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
