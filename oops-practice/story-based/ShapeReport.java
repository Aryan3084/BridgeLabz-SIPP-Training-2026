
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

public class ShapeReport {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(7),
            new Rectangle(10, 5),
            new Triangle(3, 4, 5)
        };

        System.out.println("Shape Report");
        System.out.println("-----------------------------");

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.printf("Area: %.2f%n", shape.area());
            System.out.printf("Perimeter: %.2f%n", shape.perimeter());
            System.out.println();
        }
    }
}