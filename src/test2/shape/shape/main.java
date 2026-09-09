package test2.shape.shape;
//추상클래스 Shape에 추상메소드 double area()를 선언하세요.
//Circle(radius), Rectangle(width, height)이 Shape을 상속받아 area()를 각각 구현하세요.
//Shape 배열에 Circle, Rectangle 객체를 섞어 담고, for문으로 순회하며 area()를 호출하세요.
//참고 : Shape[] shapes = { new Circle(3), new Rectangle(4, 5), new Circle(1) };
//실제로 어떤 area()가 호출되는지는 컴파일 시점이 아닌 실행 시점(동적 바인딩)에 결정됨을 확인하세요.
//Shape타입객체.area()는 컴파일 시에는 Shape의 area()로 보이지만, 실행 시 s가 가리키는 실제 객체(Circle/Rectangle)의 area()가 호출됩니다(동적 바인딩).

abstract class Shape {
    abstract double area();

    void draw() {
        System.out.println(area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return radius * radius * Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5), new Circle(1) };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}