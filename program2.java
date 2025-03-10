import java.util.Scanner;
class program2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your address:");
        String address=sc.nextLine();
        System.out.println("My name is"+name);
        System.out.println("My age is"+age);
        System.out.println("My address is:"+address);
    }
}