package Lab;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer>  biggestNumbers = new ArrayList<>();
        Arrays.sort(numbers);
        int count = Math.min(3,numbers.length);
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[numbers.length - i - 1] + " ");
        }
    }
}
