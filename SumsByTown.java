package Lab;

import java.util.*;

public class SumsByTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String,Double> cityIncome = new TreeMap<>();
        for (int i = 0; i < n; i++) {
           String[] input = (scanner.nextLine().split("\\s+\\|"));

           String city = input[0];
           double income = Double.parseDouble(input[1]);

           if (cityIncome.containsKey(city)){
               cityIncome.put(city,cityIncome.get(city) + income);
           }else {
               cityIncome.put(city,income);
           }
        }
        for (String kvp : cityIncome.keySet()) {
            System.out.println(kvp + " -> " + cityIncome.get(kvp));
        }

    }
}
