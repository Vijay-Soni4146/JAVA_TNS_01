/*Create an abstract class called Animal with the following properties and methods:

Properties:
name (String)
age (int)
Methods:
abstract void makeSound(): This method should be implemented by each subclass of Animal and should print the sound made by the specific animal.
Create two subclasses of Animal called Dog and Cat. Implement the makeSound() method in each subclass to print the sound made by a dog and a cat, respectively.

In the Main class, create instances of Dog and Cat,
set their name and age properties, and call the makeSound() method for each instance*/



abstract class Animal{
    String name;
    int age;
    abstract void makesound();

    Animal(String n,int a){
        this.name=n;
        this.age=a;
    }

    void display(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }

}

class Dog extends Animal{

    Dog(String name,int age){
        super(name, age);
    }

    void makesound(){
        System.out.println("Barking....");
    }
}
class Cat extends Animal{
    
    Cat(String name,int age){
        super(name,age);
    }

    void makesound(){
        System.out.println("Meow...");
    }
}

public class Abstract_Prac {
    public static void main(String[] args) {
        Dog d=new Dog("Tommy",2);
        d.display();
        d.makesound();

        Cat c=new Cat("Minti",5);
        c.display();
        c.makesound();
    }
}