import java.util.Scanner;
public class prog34{
    static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of "+n +" "+"is"+" "+factorial(n));
    }
}
