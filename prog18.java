import java.util.Scanner;
class prog17{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int num1=sc.nextInt();
        System.out.print("Enter the value:");
        int num2=sc.nextInt();
        String result=num1>num2?"num1 is greater":"num2 is greater";
        System.out.println(result);



    }
}