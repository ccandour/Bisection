public class Main {
    public static int maxSteps;
    public static double tolerance;
    public static double a;
    public static double b;
    public static void main(String[] args) throws Exception {
        GetInputFromUser.getInput();
        System.out.println(calculate());
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
        // a -> first point
        // b -> second point
        // c -> midpoint

        if (f(a) * f(b) > 0) {
            throw new Exception("The set points have the same sign");
        }

        int currentStep = 1;
        double c = -999999999;

        while (currentStep < maxSteps) {
            // calculate new midpoint
            c = (a + b) / 2;

            // if reached 0 or is in tolerance, return midpoint
            if (f(c) == 0 && (b - a) / 2 < tolerance) return c;

            // increment step counter
            currentStep++;

            // calulate first or second point
            if (f(c) * f(a) > 0) a = c;
            else b = c;
        }
        return c;
    }

    public static double f(double x) {
        return x * x - 10;
    }
}
