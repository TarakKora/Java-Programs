public class sumOfDigitsUsingRec {
    public  static void main(String[] args){
       System.out.println(sumrec(0));
    }
    static int sumrec(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumrec(n/10);
    }
}
