import java.util.Random;
import java.util.Scanner;
class prog43{
    public static void main(String[]args){
        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        String [] values={"Rock","Paper","Scissors"};
        String yourchoice=sc.nextLine();
        int mychoices=rd.nextInt(3);
        String mychoice=values[mychoices];
        if(yourchoice.equalsIgnoreCase(mychoice)){
            System.out.println("oops it's tie!!");
        }
        else if((yourchoice.equalsIgnoreCase("Rock") && mychoice.equalsIgnoreCase("Scissors")) ||
               ( yourchoice.equalsIgnoreCase("Paper") && mychoice.equalsIgnoreCase("Rock")) ||
                (yourchoice.equalsIgnoreCase("Scissors") && mychoice.equalsIgnoreCase("Paper"))){
                    System.out.println("You won,have fun!!");
                }
        else{
            System.out.println("Hurray I won jolly jolly!!");
        }
        sc.close();
    }
}