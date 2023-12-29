// nCr= n!/(r!*(n-r!))

import java.util.Scanner;

public class BinomialCoefficient {

    public static int Findfactorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        int binomial = Findfactorial(n) / (Findfactorial(r) * Findfactorial(n - r));
        System.out.println(binomial);
    }
}