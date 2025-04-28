import java.util.*;
public class prog109 {
    String name;
    int rollno;
    int marks;
    void displaydetails(){
        System.out.println("Student name:"+name);
        System.out.println("Student rollmo:"+rollno);
        System.out.println("Student marks:"+marks);
    }
    void passorfail(){
        if(marks>=40){
            System.out.println("Congratualtions you're pass");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name:");
            String name=sc.nextLine();
            System.out.println("Enter the rollno:");
            int rollno=sc.nextInt();
            System.out.println("Enter the marks:");
            int marks=sc.nextInt();
            prog109 obj=new prog109();
            obj.name=name;
            obj.rollno=rollno;
            obj.marks=marks;
            obj.displaydetails();
            obj.passorfail();

        }
    }

