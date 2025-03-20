import java.util.Random;
class prog35{
    public static void main(String args[]){
        Random rd=new Random();
        String [] funthings={"worlds largest desert is antartica not sahara",
                  "Things you saw may seem differnt,so deep drive untill you get it",
                  "Heart beats 1lakh times per day","if heart can go like non stop you can..",
                  "Good night honey have fun.."};
        int index=rd.nextInt(funthings.length);
        System.out.println("Hello");
        System.out.println(funthings[index]);          

    }
}