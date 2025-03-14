import java.io.*;
import java.util.Scanner;
class prog12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of terms:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("enter the starting value:");
            int a=sc.nextInt();
            System.out.print("enter the next value");
            int b=sc.nextInt();
            System.out.print("Ending value:");
            int n=sc.nextInt();
            int seriesvalue=a;
            for(int j=0;j<n;j++){
                seriesvalue+=(int) Math.pow(2,j)*b;
                System.out.println(seriesvalue + "");
            }
            System.out.println();
            sc.close();
        }
    
}
}