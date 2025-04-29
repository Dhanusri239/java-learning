import java.util.*;

//task2//

public class prog112 {
    static String Libraryname="City library";
    String booktitle;
    String author;
    void displaybookinfo(String b,String a){
        this.booktitle=b;
        this.author=a;
        System.out.println("BookTitle: "+b);
        System.out.println("BookAuthor: "+a);
        System.out.println("LibraryName: "+Libraryname);
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter booktitle: ");
    String b=sc.nextLine();
    System.out.println("Enter bookAuthor: ");
    String a=sc.nextLine();
    System.out.println("Enter booktitle: ");
    String b1=sc.nextLine();
    System.out.println("Enter bookAuthor: ");
    String a2=sc.nextLine();
    prog112 o=new prog112();
    System.out.println("Displaying 1st bookdetails");
    o.displaybookinfo(b,a);
    prog112 ob=new prog112();
    System.out.println("Displaying 2nd bookdetails");
    ob.displaybookinfo(b1,a2);
    }
}
