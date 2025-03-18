import java.util.Scanner;
class prog28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=0;
        do{
            num=sc.nextInt();
        }while(num<10);
        System.out.println("The input is greater than 10");
    }
}