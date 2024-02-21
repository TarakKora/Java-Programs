public class NoOfStepsToRedNumToZero {
    public static void main(String[] args) {
        System.out.println(findcount(41, 0));
    }
        static int findcount(int num, int steps) {
            if (num == 0) {
                return steps;
            }

            if (num % 2 == 0) {
                return findcount(num/2, steps+1);
            }
            return findcount(num-1, steps+1);
    }
}
