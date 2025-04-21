import java.util.Scanner;

class Dish {
    String name;
    int stock;
    double price;

    Dish(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    void buy(int quantity) throws Exception {
        if (quantity > stock) {
            throw new Exception(name + " not available!");
        }
        stock -= quantity;
        System.out.println(quantity + " " + name + " purchased. Total Cost: Rs " + (price * quantity));
    }
}

public class FoodOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            /*
        Dish menu[] = new Dish[4]; 

        menu[0] = new Dish("Pizza", 5, 250 * 1.1);
        menu[1] = new Dish("Burger", 3, 150 * 1.05);
        menu[2] = new Dish("Pasta", 4, 200 * 1.08);
        menu[3] = new Dish("Sandwich", 6, 100 * 1.02);
            */
        
        Dish[] menu = {
            new Dish("Pizza", 5, 250 * 1.1),
            new Dish("Burger", 3, 150 * 1.05),
            new Dish("Pasta", 4, 200 * 1.08),
            new Dish("Sandwich", 6, 100 * 1.02)
        };
       
       

        System.out.println("Available dishes:");
        for (Dish dish : menu) {
            System.out.println("- " + dish.name + " (Rs " + dish.price + ", Stock: " + dish.stock + ")");
        }

        System.out.print("Enter dish name to order: ");
        String orderName = scanner.nextLine();
        System.out.print("Enter quantity to order: ");
        int quantity = scanner.nextInt();

        try {
            for (Dish dish : menu) {
                if (dish.name.equalsIgnoreCase(orderName)) {
                    dish.buy(quantity);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}