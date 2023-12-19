package calc;
import java.util.Objects;
import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a,b,choice;
        String run;
        System.out.print("Enter 2 int:");
        a=kb.nextInt();
        b=kb.nextInt();
        do {
            System.out.println("Enter a number to perform the operation:");
            System.out.println();
            System.out.println("1.Add\n2.Sub\n3.Multi\n4.Divide:");
            choice=kb.nextInt();
            switch (choice) {
                case 1 -> System.out.println("The sum is:" + (a + b));
                case 2 -> System.out.println("The subtraction is:" + (a - b));
                case 3 -> System.out.println("the multiple is:" + (a * b));
                case 4 -> System.out.println("The divide is :" + (a / b));
                default -> System.out.println("Wrong input!...Please enter correct input:");
            }
            System.out.println("Do you want to continue the operations:(yes/no)");
            run=kb.next();
        }while(Objects.equals(run, "yes"));
        System.out.println("Thank you for visiting here");
    }
}
