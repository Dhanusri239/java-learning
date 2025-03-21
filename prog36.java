import java.util.Scanner;
class prog36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        sc.close();
        System.out.println("The factorial of the"+" "+num+" "+"is"+" "+factorial);
    }
}