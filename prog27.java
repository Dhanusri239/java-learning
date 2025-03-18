import java.util.Random;
class prog27{
    public static void main(String args[]){
        Random rd=new Random();
        int num=0;
        while(num!=10){
             num=rd.nextInt(20);
             System.out.println("Random number is:"+num);
        }
    }
}