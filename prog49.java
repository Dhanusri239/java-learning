import java.util.ArrayList;
public class prog49 {
    String name;
    int[]marks;
 prog49(String name,int[]marks){
    this.name=name;
    this.marks=marks;
 }
 int calculatemarks(){
    int total=0;
    for(int marks:marks){
       total+=marks;
    }
    return total;
 }
 double getavgmarks(){
     return calculatemarks() /5.0;
 }
 String gradesystem(){
    double avg=calculatemarks();
    if(avg>90)
        return "A";
    else if(avg>80)
        return "B";
    else if(avg>70)
        return "C";
    else if(avg>60)
       return "D";
    else 
       return "Fail";
       

 }
 public static void main(String[]args){
    ArrayList <prog49> students=new ArrayList<>();
    students.add(new prog49("Henry", new int[]{100,80,60,40,70}));
    students.add(new prog49("Peter",new int[]{100,60,70,90,80}));
    students.add(new prog49("Holly", new int[]{100,90,50,70,90}));
    for(prog49 s:students){
        System.out.println("Student name:"+ s.name +
                           "--"+ "Stundent totalmark"+ s.calculatemarks()+
                           "--"+"Student average mark"+ s.getavgmarks()+
                           "--"+ "Student grade"+ s.gradesystem());
    }
 }

    
}
