import java.util.Scanner;
class prog30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=2;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            System.out.printf("%04d %-5s%n",a,b);
        }
    }
}