import java.util.Scanner;
class prog8{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("==================");
        for(int i=0;i<3;i++)
        {
            String val=sc.nextLine();
            int num=sc.nextInt();
            System.out.printf("%-15s%03d%n",val,num);
            sc.nextLine();
        }
        System.out.println("==================");
    }
}