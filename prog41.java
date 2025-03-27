import java.util.Scanner;
class prog41{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value that you want to be reversed:");
        int value=sc.nextInt();
        int reverse=0;
        while(value!=0)
        {
            reverse=reverse*10+value%10;
            value/=10;
        }
        System.out.println("Reversed value is:" +reverse);
    }
}