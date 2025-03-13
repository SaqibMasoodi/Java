class Main {
    public static void main(String[] args) {
        Expense expense1 = new Expense("Groceries", 1500);
        expense1.display();
    }
}

class Expense {
    String category;
    int amount;
    
    Expense(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    void display() {
        System.out.println("Category: " + this.category);
        System.out.println("Amount: " + this.amount);
    }

    void Add(int x){
        this.amount = this.amount + x;
        System.out.println("New Expense");
        this.display();
    }

    void Sub(int x){
        this.amount = this.amount - x;
        System.out.println("New Expense");
        this.display();
    }

}
