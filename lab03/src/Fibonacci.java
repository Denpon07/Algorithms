public class Fibonacci {
    public int recursionExecute(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }

    public int cycleExecute(int n){
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; ++i) {
            int number = a + b;
            a = b;
            b = number;
        }
        return b;
    }
}
