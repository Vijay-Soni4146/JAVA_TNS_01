public class Constructor_Demo {  
        int id;  
        String name;  
        int age; 

        Constructor_Demo(){}  

        Constructor_Demo(int i,String n){  
            id = i;  
            name = n;  
        }  
        Constructor_Demo(int i,String n,int a){  
            id = i;  
            name = n;  
            age=a;  
        }  
        void display(){
            System.out.println(id+" "+name+" "+age);
        } 

        public static void main(String args[]){  
        //creating objects  
        Constructor_Demo s1=new Constructor_Demo();  
        Constructor_Demo s2=new Constructor_Demo();  
        Constructor_Demo s3 = new Constructor_Demo(111,"Karan");
        Constructor_Demo s4 = new Constructor_Demo(222,"Aryan",25);    
        //displaying values of the object  
        s1.display();  
        s2.display();  
        s3.display();
        s4.display();
        }   
}
