import java.util.Scanner;
class prog38{
    static int Fibonacci(int num){
        if(num<=1){
            return num;
        }
        return Fibonacci(num-1)+Fibonacci(num-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Fibonacci series are:"+" "+ Fibonacci(i));
        }
    }
}