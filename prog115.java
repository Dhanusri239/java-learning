import java.util.*;
public class prog115 {
    static int c;
    prog115(){
         c++;
         System.out.println("Account created.Total accounts are:"+c);
    }
    public static void display(){
        System.out.println("Total accounts created are: "+c);
    }
    public static void main(String[]args){
        prog115 o=new prog115();
        prog115 o1=new prog115();
        prog115 o2=new prog115();
        prog115 o3=new prog115();
        prog115 o4=new prog115();
        display();
    }
}
