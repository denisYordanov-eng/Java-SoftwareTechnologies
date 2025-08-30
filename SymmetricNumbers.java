package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SymmetricNumbers {
    public static <ArraysList> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);

        List<String> symmetricDigits = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {

            String currentDigit = String.valueOf(i);
            if(currentDigit.length() >=2) {
                String reversedString = reversingCurrentDigit(currentDigit);

                if (currentDigit.equals(reversedString)) {
                    symmetricDigits.add(currentDigit);
                }
            }else {
                symmetricDigits.add(currentDigit);
            }
        }
        System.out.println(String.join(" ",symmetricDigits));
        }
        static String reversingCurrentDigit(String currentDigit){
        StringBuilder sb = new StringBuilder();
            for (int i = currentDigit.length() - 1; i >= 0; i--) {
                sb.append(currentDigit.charAt(i));
            }
            return sb.toString();
        }
    }

