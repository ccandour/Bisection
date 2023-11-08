import java.util.Scanner;

class GetInputFromUser {
    public static void main(String args[]) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first point (double) : ");
        double first = in.nextDouble();

        System.out.println("Enter the second point (double) : ");
        double second = in.nextDouble();

        Main.a = Math.min(first, second);
        Main.b = Math.max(first, second);

        System.out.println("Enter maximum number of iterations (int) : ");
        Main.maxSteps = in.nextInt();

        System.out.println("Enter desired tolerance (double) : ");
        Main.tolerance = in.nextDouble();

        in.close();
    }
}
