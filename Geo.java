class Geo {
    public static void main(String[] args) {
        Circle cir = new Circle(5);

        float area = cir.area();
        float peri = cir.perimeter();

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + peri);
    }
}

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    float area() {
        return 3.14f * radius * radius;
    }

    float perimeter() {
        return (float) 2 * 3.14f * radius;
    }
}
