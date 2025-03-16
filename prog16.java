import java.util.Scanner;
class prog16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary:");
        int salary=sc.nextInt();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(salary>=20000 || age<25){
            System.out.print("Enter the loan amount:");
            int loan=sc.nextInt();
            if(loan<=50000){
                System.out.println("you're eligible for loan");
            }
            else{
                System.out.println("you're not eligible for loan ");
            }
        }
        else{
            System.out.println("you're not eligible for loan");
        }
    }
}