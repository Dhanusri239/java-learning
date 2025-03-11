import java.util.Scanner;
class program4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Score:");
        int n=sc.nextInt();
        if(n>35){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}