public class prog98 {
    String make,model;
    int year;
    prog98(){
         this("Defaultmake", "Defaultmodel");
    }
    prog98(String make,String model){
        this(make, model,2012);
    }
    prog98(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void printdetails(){
        System.out.printf("model :%s\n make:%s\nyear:/%d",model,make,year);
    }
    public static void main(String[]args){
      prog98 obj=new prog98();
      obj.printdetails();
      prog98 ob=new prog98("Hundai","sonata");
      ob.printdetails();
      prog98 o=new prog98("Tata","nano",2010);
      o.printdetails();
    }
}
