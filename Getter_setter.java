class Getter_setter{
    public static void main(String[] args) {
        Getset obj=new Getset();
        obj.setName("Vijay");
        System.out.println(obj.getName());
        obj.setRoll(8);
        System.out.println(obj.getRoll());
        
        obj.setAge(18);
        System.out.println(obj.getAge());
    }
}
class Getset{
    private String name;
    private int rollno,age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRoll(){
        return rollno;
    }
    public void setRoll(int rollno){
        this.rollno=rollno;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}




