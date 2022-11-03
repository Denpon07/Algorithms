import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,n = 0;

        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        SumDigits sumDigits = new SumDigits();
        SumNoUsingPlus sumNoUsingPlus = new SumNoUsingPlus();

        System.out.println("Enter number for calculations factorial");
        int c  = scanner.nextInt();

        a = factorial.cycleExecute(c);
        b = factorial.recursionExecute(c);

        System.out.println(factorial.cycleExecute(n));

        assert (a == b);
        System.out.println("Factorial search result with number " + n + " by using cycle = " + a);

        System.out.println("Enter number for calculations fibonacci");
        n = scanner.nextInt();

        a = fibonacci.cycleExecute(n);
        b = fibonacci.recursionExecute(n);

        assert (a == b);
        System.out.println("Fibonacci search result with number " + n + " by using recursion = " + b);

        System.out.println("Enter number for calculations sum digits");
        n = scanner.nextInt();

        System.out.println("Number n = "+ n + "\nSum digits = " + sumDigits.execute(n));

        System.out.println("Enter two digits number for calculations sum of numbers without plus");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Number a = " + a + "\nNumber b = " + b + "\nSum of numbers without plus = " + sumNoUsingPlus.execute(a,b));

    }
}