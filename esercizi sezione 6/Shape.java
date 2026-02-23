abstract class Shape {
    protected String Name;
    public Shape(String Name) {
        this.Name = Name;
    }
    public abstract double calculateArea();
    public void displayInfo() {
        System.out.println("Shape: " + Name);
        System.out.println("Area: " + calculateArea());
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String Name, double radius) {
        super(Name);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String Name, double width, double height) {
        super(Name);
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(String Name, double base, double height) {
        super(Name);
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}