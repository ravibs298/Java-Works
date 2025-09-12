import java.util.Scanner;
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
// CIRCLE CLASS
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI + radius * radius;
        System.out.println("Area of Circle:  " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
// TRIANGLE CLASS
class Triangle extends Shape {
    double a, b, c;
    double height, base;
    Triangle(double a, double b, double C, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    void calculatePerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}
// MAIN CLASS
public class CWR_25 {
    public static void main(String[] args) {
        System.out.println();
        Circle c = new Circle(3);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println();
        Triangle t = new Triangle(3, 4, 5, 4, 3);
        t.calculateArea();
        t.calculatePerimeter();
    }
}