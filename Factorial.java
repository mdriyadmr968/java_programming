import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.print("Enter a number to find Factorial:");
        num = sc.nextInt();

        while (num > 1 ) {
            fact = fact * num;
            num = num - 1;
            
        }
        System.out.println("factorial is: " + fact );


    }
    
}
