import java.util.*;
public class prog113 {
    static int maxplayers;
    static{
        maxplayers=5;
        System.out.println("static block is executed,maxplayers are set");
    }
    public static void display(){
        System.out.println("Max players allowed are "+maxplayers);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        display();
    }
}
