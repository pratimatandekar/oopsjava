package doughts;

public class Stack {
    private int tos;
    private int [] arr;
    private int size;

    public Stack(int size){
        tos=-1;
        this.size=size;
        arr=new int[size];
    }
    public void push(int x){
        if(tos==size-1){
            System.out.println("Stack Full Ho gya hai");
        }
        tos++;
        arr[tos]=x;
        System.out.println("Element pushed:"+x);
    }
}
