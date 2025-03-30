import java.util.Scanner;
class prog46{
        String passorfail(int score){
        if(score>35){
            return "pass";
            
        }
        else{
            return "Fail";
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int totalmark=sc.nextInt();
        prog46 obj=new prog46();
        String result=obj.passorfail(totalmark);
        System.out.println(result);
    }
}