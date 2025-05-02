import java.util.*;
public class prog118 {
    public static void main(String[]args)throws Exception{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(s.equals("dhanu@123")){
        System.out.println("Mobile unlocked");
    }
    else{
        throw new Exception("Wrong password");
    }
    
}
}