import java.util.Scanner;

public class prog40{
    int guessnumber=12;
    void guessnum(int playersguess){
        if(playersguess==guessnumber){
            System.out.println("Huraayy you're right!!");
        }
        else
        {
            System.out.println("Better luck nexttime");
        }
    }
}
class Main{
    public static void main(String []args){
        prog40 guess=new prog40();
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess the number between 1-20:");
        int num=sc.nextInt();
        guess.guessnum(num);
    }
}
