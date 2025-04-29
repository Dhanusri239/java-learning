import java.util.*;
//task1
public class prog111 {
  public static int a(int a,int b){
        int add=a+b;
        return add;
    }
    public static int m(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int re=a(a,b);
        int be=m(a,b);
        System.out.println("Addition of value from static method is: "+re);
        System.out.println("Multiplication of value from static method is: "+be);
    }
}
