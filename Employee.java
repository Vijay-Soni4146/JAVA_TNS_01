public class Employee {
        public static void main(String[] args) {
                System.out.println("Name   Year Of Joining   Address ");

                Employee obj1=new Employee("Robert",1994,"64C- WallsStreat");
                Employee obj2=new Employee("Sam",2000,"68D- WallsStreat");
                Employee obj3=new Employee("John",1999,"26B- WallsStreat");
                              
                obj1.display();
                obj2.display();                        
                obj3.display();                               

        }   
        String name,address;
        int joining;
        public Employee(String n,int join,String add){
            name=n;
            joining=join;
            address=add;
        }
        void display(){
            System.out.println(name+"        "+joining+"       "+address);
        }
}
