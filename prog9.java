import java.util.Scanner;
class prog9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the score");
        int score=sc.nextInt();
        if(score<50)
        {
            System.out.println("improvement need");
        }
        else if(score>=50 && score<70){
            System.out.println("well done");
        }
        else if(score>=70){
            System.out.println("great performance");
        }

    }}