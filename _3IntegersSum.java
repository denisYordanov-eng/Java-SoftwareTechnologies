import java.util.Arrays;
import java.util.Scanner;

public class _3IntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int firstNumber = input[0];
        int secondNumber = input[1];
        int thirdNumber = input[2];

        if(firstNumber + secondNumber == thirdNumber){
            System.out.printf("%d + %d = %d",Math.min(firstNumber,secondNumber),
                    Math.max(firstNumber,secondNumber),thirdNumber);
        } else if (secondNumber + thirdNumber == firstNumber) {
            System.out.printf("%d + %d = %d",Math.min(secondNumber,thirdNumber),
                    Math.max(secondNumber,thirdNumber),firstNumber);
        } else if (firstNumber + thirdNumber == secondNumber) {
            System.out.printf("%d + %d = %d",Math.min(firstNumber,thirdNumber),
                    Math.max(firstNumber,thirdNumber),secondNumber);
        }else{
            System.out.println("No");
        }
    }
}
