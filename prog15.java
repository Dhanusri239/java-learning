import java.util.Scanner;
class prog12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        String answer =sc.nextLine();
        if(answer.equals("red")){
            System.out.println("Stop");

        }
        else if(answer.equals("yellow")){
            System.out.print("get ready");

        }
        else if(answer.equals("green")){
            System.out.println("go");
        }
        else{
            System.out.println("no match found");
        }

    }
}