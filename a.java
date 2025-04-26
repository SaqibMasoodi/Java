import java.util.Scanner;

class B {

    int price;

    B(int p) {
        this.price = p;

    }

    void buy(int amount) throws Exception {
        if (amount < price) {

            throw new Exception("given amount =" + amount + "not sufficient");
        }
        System.out.println("Ok you have now acquired a item owporth" + this.price);
    }

}

public class a {

    public static void main(String[] args) {

        Scanner sc = new Scanner();
        int x;
        x = sc.nextInt();

        B pizza = new B(100);
        B milk = new B(20);

        try {
            pizza.buy(x);
        } catch (Exception t) {
            System.out.println(t.getMessage());
        }

        try {
            milk.buy(25);
        } catch (Exception m) {
            System.out.println("Msle gov");
        }

    }
}
