/*Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
Implement the getArea() method for each of the three classes */



interface Shape{
    double getArea();
}

class Rectangle implements Shape{
        private double length,width;

        Rectangle(double l,double w){
            this.length=l;
            this.width=w;
        }

        public double getArea(){
            return length*width;
        }
}

class Circle implements Shape{
    private double radius;

    Circle(double r){
        this.radius=r;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

}

class Triangle implements Shape{
    private double base,height;

    public Triangle(double b,double h){
        this.base=b;
        this.height=h;
    }

    public double getArea(){
        return 0.5*base*height;
    }
}




public class Interface_Shape {
    public static void main(String[] args) {

        //length=10,width=12
        Rectangle r=new Rectangle(10, 12);

        //radius=3
        Circle c=new Circle(3);

        //base=4,height=6
        Triangle t=new Triangle(4,6);

        System.out.println("Area of the Rectangle: " + r.getArea());
        System.out.println("Area of the Circle: " + c.getArea());
        System.out.println("Area of the Triangle: " + t.getArea());
    }
}
