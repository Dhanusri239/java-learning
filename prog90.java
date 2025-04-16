import java.util.*;
public class prog90 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Appending string");
        StringBuilder s=new StringBuilder();
        for(int i=0;i<5;i++){
            s.append("java");
        }
        System.out.print(s);
        System.out.print("Inserting a string");
        StringBuilder a=new StringBuilder("Good Morning");
        a.insert(4,"  Beautiful");
        System.out.println(a);
        System.out.println("Deleting a piece of string");
        StringBuilder b=new StringBuilder("Welcome to the world of java!");
        b.delete(7,14);
        System.out.println(b);
        System.out.println("Deleting a piece of character at string");
        StringBuilder c=new StringBuilder("Hello world");
        c.deleteCharAt(5);
        System.out.println(c);
        System.out.println("Replacing a piece of string");
        StringBuilder d=new StringBuilder("I love programming");
        d.replace(7,18,"coding");
        System.out.println("Reverse a string");
        StringBuilder e=new StringBuilder("Reverse me");
        e.reverse();
        System.out.println(e);
        System.out.println("Checking the capacity of stringbuilder");
        StringBuilder f=new StringBuilder(10);
        f.append("Hey dude let's have sum fun with java");
        System.out.println(f.capacity());
        System.out.println("Setting the length");
        StringBuilder g=new StringBuilder();
        g.setLength(10);
        g.append("It hurts a lot");
        System.out.println(g);
        System.out.println("Getting substring");
        StringBuilder i=new StringBuilder("Java learning");
        String sub=i.substring(5);
        System.out.println(sub);

    }
    
}
