public class Factorial {

    public  int recursionExecute(int n){
        if (n < 2) {
                return 1;
            }
        return recursionExecute(n - 1) * n;
    }

    public  int cycleExecute(int n){
        int result = 1;

        for (int i = 1; i <= n; i ++){

            result = result*i;

        }

        return result;
    }

}
