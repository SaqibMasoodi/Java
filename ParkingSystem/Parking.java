import java.util.Scanner;

class Vehicle {
    String ownerName;
    String ownerDesignation;
    int numberPlate;

    Vehicle(String ownerName, String ownerDesignation, int numberPlate) {
        this.ownerName = ownerName;
        this.ownerDesignation = ownerDesignation;
        this.numberPlate = numberPlate;
    }

    boolean checkVC() {
        return ownerDesignation.equalsIgnoreCase("vc");
    }

    void displayInfo() {
        System.out.println(
                "Owner: " + ownerName + ", Designation: " + ownerDesignation + ", Number Plate: " + numberPlate);
    }
}

class Lot {
    Vehicle[] parkingLot;

    Lot(int lotSize) {
        parkingLot = new Vehicle[lotSize];
    }

    void display() {
        System.out.println("\n--- Current Status ---");
        for (int i = 0; i < parkingLot.length; i++) {
            System.out.print("Slot " + i + ": ");
            if (parkingLot[i] != null) {
                parkingLot[i].displayInfo();
            } else {
                System.out.println("Empty");
            }
        }
        System.out.println("--------------------------\n");
    }

    void addVehicle(int index, Vehicle v) {
        if (index < 0 || index >= parkingLot.length) {
            System.out.println("Invalid index.");
            return;
        }
        if (parkingLot[index] != null) {
            System.out.println("Slot already occupied.");
            return;
        }
        if (v.checkVC() && index != 0) {
            System.out.println("VC vehicle can only be parked at slot 0.");
            return;
        }
        
        parkingLot[index] = v;
    }

    void removeVehicle(int index) {
        if (index < 0) {
            System.out.println("Invalid slot.");
            return;
        }
        if (index >= parkingLot.length) {
            System.out.println("Invalid slot");
            return;
        }
        if (parkingLot[index] == null) {
            System.out.println("Empty slot.");
            return;
        }
        
        parkingLot[index] = null;
       
    }
}

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking lot size: ");
        int lotSize = sc.nextInt();
        sc.nextLine(); 

        Lot parkingLot = new Lot(lotSize);

        while (true) {
            parkingLot.display();
            System.out.println("1. Add Vehicle    2. Remove Vehicle    3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 3)
                break;

            System.out.print("Enter slot index: ");
            int index = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter owner name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter number plate: ");
                    int plate = sc.nextInt();

                    Vehicle v = new Vehicle(name, designation, plate);
                    parkingLot.addVehicle(index, v);
                    break;

                case 2:
                    parkingLot.removeVehicle(index);
                    break;

                default:
                    break;
            }
        }

        sc.close();
    }
}
