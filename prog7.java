import java.util.Scanner;
class prog7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("yes it is divisinle by 5 and 3");
        }
        else
        {
            System.out.println("No it's not divisible");
        }

    }
}