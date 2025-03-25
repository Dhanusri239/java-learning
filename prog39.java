import java.io.PrintStream;
import java.util.Random;
class prog39{
    public static void main(String[]args){
        Random rd=new Random();
        int diceroll=rd.nextInt(6)+1;
        String[] dicefaces={
            "\u2680","\u2681","\u2683","\u2684","\u2685","\u2686"
        };
        System.out.println("The dice you rolled"+ " "+dicefaces[diceroll-1]+" " +(diceroll));
    }
}