package dsa.stackexample1;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
      int x=10;
      for(int i=1;i<=5;i++){
          s.push(x);
          System.out.println("element is pushed"+x);
          x=x+10;
      }
        System.out.println("top element of the Stack is"+s.peek());
        for(int i=1;i<=5;i++){
            x=s.pop();
            System.out.println("element is pooped"+x);

        }
    }
}
