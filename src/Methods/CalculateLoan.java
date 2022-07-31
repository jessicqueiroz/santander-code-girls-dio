package Methods;

import java.util.Scanner;

public class CalculateLoan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount, tranche;

        System.out.println("what is the loan amount?");
        amount = scan.nextInt();
        System.out.println("how many will be the loan tranches?");
        tranche = scan.nextInt();
        System.out.println("the final loan amount will be " + calculateFinalAmount(tranche, amount));
    }

    public static double calculateFinalAmount(int tranche, int amount) {
        if (tranche < 6) {
            double totalValue = (amount * 0.4) + amount;
            return totalValue;
        }
        double totalValue = (amount * 0.7) + amount;

        return totalValue;
    }
};
