public class prog50 
     {
        String name;
        prog50(){
            System.out.println("Default constructor called One student");
            name="Arisu";
        }
        void display() {
            System.out.println("Student name is:"+name);
        }
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
             System.out.println();
             prog50 obj=new prog50();
             obj.display();
        }
    
     }

