package dsa.stackexample5;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> Mylist;
    private int tos;

    public Stack(){
        Mylist=new ArrayList<>();
        tos=-1;
    }
    public void push(int x) {
            tos++;
            Mylist.add(tos,x);
        }
    public int pop(){
        if(tos==-1){
            StackExeption obj=new StackExeption("Stack underflow")  ;
            throw obj;
        }
        int x;
        x=Mylist.remove(tos);
        tos--;
        return x;
    }
    public int peek(){
        if(tos==-1){
            StackExeption obj=new StackExeption("Stack underflow")  ;
            throw obj;
        }
        int x;
        x=Mylist .get(tos);
        return x;
    }
}
