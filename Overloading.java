class Overloading {
    public static void main(String[] args) {
        Load a = new Load();
        a.over();
        a.over(5);
        a.over(5, 6);
        double result = a.over(12.67);
        System.out.println(result);

    }
}

class Load {
    void over() {
        System.out.println("No argument");

    }

    void over(int a) {
        System.out.println(a);
    }

    void over(int a, int b) {
        System.out.println(a + b);

    }

    double over(double a) {
        return a * a;
    }

}