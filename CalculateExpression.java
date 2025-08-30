
public class CalculateExpression {
    public static void main(String[] args) {
        //	((30 + 21) * 1/2 * (35 - 12 – 1/2))2
        double val = (30 + 21) * (0.5) * (35 - 12 - (0.5));
        double result = Math.pow(val,2);
        System.out.printf("%.4f", result);
    }
}
