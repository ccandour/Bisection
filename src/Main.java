public class Main {
    public static int maxSteps;
    public static double tolerance;
    public static double a;
    public static double b;
    public static void main(String[] args) {
        while (true);

        /*
        N ← 1
        while N ≤ NMAX do // limit iterations to prevent infinite loop
            c ← (a + b)/2 // new midpoint
        if f(c) = 0 or (b – a)/2 < TOL then // solution found
        Output(c)
        Stop
        end if
        N ← N + 1 // increment step counter
        if sign(f(c)) = sign(f(a)) then a ← c else b ← c // new interval
        end while
        Output("Method failed.") // max number of steps exceeded
        */

    }
    public static double calculate() throws Exception {
        if (f(a) * f(b) < 0) {

        }
        throw new Exception("something went wrong");
    }

    public static double f(double x) {
        return x * x - 10;
    }
}
