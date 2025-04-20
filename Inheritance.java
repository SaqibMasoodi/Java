
class Employee {
    Employee() {
        System.out.println("Parent Constructor");
    }
}

class Ap extends Employee {
    Ap() {
        super();
        System.out.println("Child Class Constructor");
    }
}

class A {
    A() {
        System.out.println("A's Constructor");
    }
}

class B extends A {
    int r;
    B() {
        super();
        System.out.println("B's Constructor");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C's Constructor");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Ap a1 = new Ap();
        C c = new C();
    }
}
