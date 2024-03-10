abstract class Shape {
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double SquareArea(double side) {
        return side * side;
    }

    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Area areaObj = new Area();

        double rectangleArea = areaObj.RectangleArea(5, 4);
        double squareArea = areaObj.SquareArea(6);
        double circleArea = areaObj.CircleArea(3);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);

        //Question 2
        System.out.println("========= Question 2 ===========");
        FurnitureFactory factory = new ModernFurnitureFactory(); // Change factory to switch between variants

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        // Use the created furniture objects
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();
    }
}
