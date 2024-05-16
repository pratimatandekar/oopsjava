package functionspractice;

import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        float x, y;
        System.out.println("Enter the num:");
        Scanner kb=new Scanner(System.in);
        x= kb.nextFloat();
        y= kb.nextFloat();
        tmrn();
        tsrn(x,y);
        tnts();
        tsrs(x,y);

    }
    
    //TNRN
    public static void tmrn (){
        float a,b;
        Scanner kb=new Scanner(System.in);
        a= kb.nextFloat();
        b= kb.nextFloat();
        System.out.println(a-b);
    }

    //TSRN
    public static void tsrn(float a,float b){

        System.out.println(a-b);

    }

    //TNRS
    public static float tnts(){
        float i,j,s;
        Scanner kb=new Scanner(System.in);
        i= kb.nextFloat();
        j= kb.nextFloat();
        s=i-j;
        return s;
    }
    //TSRS
    public static float tsrs(float a,float b){
        float m;
        m=a-b;
        return m;
    }
}
