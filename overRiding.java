class overRiding {
    public static void main(String[] args) {
        B b1 = new B(1, 2, 3);
        b1.show();
    }
}

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Sum (i + j): " + (i + j));
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(5, 10);
        k = 200;
    }

    void show() {
        super.show();
        System.out.println("Value of k: " + k);
    }
}
