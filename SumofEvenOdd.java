import java.util.Scanner;
public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number % 2 == 0){
                evensum +=number;
            }else{
                oddsum +=number;
            }

            System.out.println("Do you want to enter another:");
            System.out.println("yes = 1, no=0");

            choice = sc.nextInt();
            



        }while(choice == 1);
        System.out.println("Even sum is" + evensum );
        System.out.println("Even sum is" + evensum );
        }
        

    
}
