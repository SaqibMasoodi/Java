class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    float area() {
        return 3.14f * radius * radius;
    }
}

class Square {
    int side;

    Square(int side) {
        this.side = side;
    }

    int area() {
        return side * side;
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

class Triangle {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    float area() {
        return base * height * 0.50f;
    }
}

class Main {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square sq = new Square(5);
        Rectangle rect = new Rectangle(4, 5);
        Triangle tri = new Triangle(3, 4);

        System.out.println("Area of Circle: " + cir.area());
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}
