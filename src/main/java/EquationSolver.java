public class EquationSolver {
    public static double[] Solve(double a, double b, double c) {
        double[] results;

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            results = new double[2];
            double sqrtDiscriminant = Math.sqrt(discriminant);
            results[0] = (-b + sqrtDiscriminant) / (2 * a);
            results[1] = (-b - sqrtDiscriminant) / (2 * a);

        } else if (discriminant == 0) {
            results = new double[1];
            results[0] = -b / (2 * a);

        } else {
            results = new double[0];
        }

        return results;
    }
}