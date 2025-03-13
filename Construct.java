class Construct {
    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test(10, 'k');

        a.Display();
        b.Display();
    }
}

class Test {
    int a;
    char y;

    Test() {
        System.out.println("Parameterless Constructor");
        a = 5;
        y = 's';
    }

    Test(int a, char y) {
        this.a = a;
        this.y = y;
        System.out.println("Parameterized Constructor");
    }

    void Display() {
        System.out.println("Data: " + this.a + "\n" + "Name: " + this.y);
    }
}
