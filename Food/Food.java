class Item {
    String itemName;
    int stock;

    Item(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    void buy(int quantity) throws StockException {
        if (quantity > stock) {
            throw new StockException(itemName + " not available!");
        }
        stock -= quantity;
        System.out.println(quantity + " " + itemName + "(s) purchased.");
    }
}

class Dish extends Item {
    double price;

    Dish(String itemName, int stock, double price) {
        super(itemName, stock);
        this.price = price;
    }

    double cost() {
        return price;
    }
}

class StockException extends Exception {
    StockException(String message) {
        super(message);
    }
}

public class Food {
    public static void main(String[] args) {
        Dish pizza = new Dish("Pizza", 5, 250 * 1.1);
        Dish burger = new Dish("Burger", 3, 150 * 1.05);

        try {
            pizza.buy(2);
            System.out.println("Pizza price: ₹" + pizza.cost());

            burger.buy(4);
            System.out.println("Burger price: ₹" + burger.cost());
        } catch (StockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}