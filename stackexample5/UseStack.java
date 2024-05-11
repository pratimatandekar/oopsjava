package dsa.stackexample5;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        int choice;
        int x;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Enter an operation:");
            System.out.println("1.push/n2.pop/n3.peek/n4.Quit");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter no. to push");
                    x = kb.nextInt();
                    try {
                        s.push(x);
                        System.out.println("Pushed" + x);
                    } catch (StackExeption ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("Popped" + x);
                    } catch (StackExeption ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("Peeked" + x);
                    } catch (StackExeption ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thankyou");
                    break;
                default:
                    System.out.println("Wrong choice.Try Again");
            }
        } while (choice != 4);
    }
}

