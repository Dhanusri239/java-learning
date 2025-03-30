import java.util.Scanner;
class prog45{
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[]args){
        prog45 obj=new prog45();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        obj.evenorodd(num);
        sc.close();

    }
}