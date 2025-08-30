import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long sum = 0L;
        for (int i = 0; i < n; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());
            sum += newNumber;
        }
        System.out.printf("Sum = %d",sum);
    }
}
