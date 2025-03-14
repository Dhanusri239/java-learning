import java.io.*;
import java .util.Scanner;
class prog14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(sc.hasNext()){
            System.out.println(num + " " +sc.nextLine() );
            num++;
        }
        sc.close();
    }
}