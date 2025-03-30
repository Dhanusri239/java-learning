import java.util.Scanner;
import java.util.Random;
public class prog47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd=new Random();
        String[] reply={
            "yes!!","No!!!","Maybe...",
            "Ask me later..","Absolutely....","I don'nt think so",
            "Not sure","Definitly No!!"};
        System.out.println("Feel free to ask Questions..!");
        System.out.println("Okay ask now..");
        String query=sc.nextLine();
        System.out.println(reply[rd.nextInt(reply.length)]);


        }
    }
    

    

