import java.util.*;
public class prog116 {
    int a;
    int b;
    void sumoftwo(int a,int b){
       int sum=a+b;
       System.out.println(sum);
    }
}
class demo extends prog116{
    int c;
    void sumofthree(int a,int b,int c){
        int s=a+b+c;
        System.out.println(s);
    }
}
class demo1 extends demo{
    int d;
    void sumoffour(int a,int b,int c,int d){
        int su=a+b+c+d;
        System.out.println(su);
    }
}
class m{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    demo1 ob=new demo1();
    System.out.println("Enter the value:");
    int a=sc.nextInt();
    System.out.println("Enter the value:");
    int b=sc.nextInt(); 
    System.out.println("Enter the value:");
    int c=sc.nextInt();
    System.out.println("Enter the value:");
    int d=sc.nextInt();
    System.out.println("Sum of two values");
    ob.sumoftwo(a, b);
    System.out.println("Sum of three values");
    ob.sumofthree(a, b, c);
    System.out.println("Sum of four values");
    ob.sumoffour(a, b, c, d);

}
}

