import java.util.Scanner;
class prog37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("Fibonacci series are:"+" "+a+" "+b);
        for(int i=2;i<num;i++){
            int c= a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}