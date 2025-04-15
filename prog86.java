import java.util.*;
public class prog86{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s="hell";
        String b ="hell";
        String sr=new String(s);
        String a=sc.nextLine();
        String c=sc.nextLine();
        System.out.println("Checking the reference of variables for defined variables");
        System.out.println("s "+System.identityHashCode(s));
        System.out.println("s "+System.identityHashCode(sr));
        System.out.println("s "+System.identityHashCode(b));
        System.out.println("Checking the reference of variables from user");
        System.out.println("s "+System.identityHashCode(a));
        System.out.println("s "+System.identityHashCode(c));


    }
    
}
