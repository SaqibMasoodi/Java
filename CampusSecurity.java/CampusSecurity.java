import java.util.*;

class Visitor {
    String name, entryTime, dept, purpose, place, exitTime;

    Visitor(String name, String entryTime, String dept, String purpose, String place) {
        this.name = name;
        this.entryTime = entryTime;
        this.dept = dept;
        this.purpose = purpose;
        this.place = place;
        this.exitTime = null;
    }

    void markExit(String time) {
        this.exitTime = time;
    }

    void display(int i) {
        System.out.println(
                "Visitor " + i + ":" + name + ", Entry: " + entryTime + ", Exit: "
                        + (exitTime != null ? exitTime : "N/A")
                        + ", Dept: " + dept + ", Purpose: " + purpose + ", Place: " + place);
    }
}

class Incident {
    String type, location, time;

    Incident(String type, String location, String time) {
        this.type = type;
        this.location = location;
        this.time = time;
    }

    void display() {
        System.out.println("Incident: " + type + ", Location: " + location + ", Time: " + time);
    }
}

public class CampusSecurity {.
    static Scanner sc = new Scanner(System.in);
    static Visitor[] visitors = new Visitor[100];
    static Incident[] incidents = new Incident[100];
    static int visitorCount = 0;
    static int incidentCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "\n1. Register Visitor\n2. Mark Exit\n3. Report Incident\n4. Show Visitors\n5. Show Incidents\n6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    visitorRegister();
                    break;
                case 2:
                    markExit();
                    break;
                case 3:
                    reportIncident();
                    break;
                case 4:
                    showVisitors();
                    break;
                case 5:
                    showIncidents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    static void visitorRegister() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Entry Time: ");
        String time = sc.nextLine();
        System.out.print("Dept: ");
        String dept = sc.nextLine();
        System.out.print("Purpose: ");
        String purpose = sc.nextLine();
        System.out.print("Place: ");
        String place = sc.nextLine();
        visitors[visitorCount] = new Visitor(name, time, dept, purpose, place);
        visitorCount++;

    }

    static void markExit() {
        System.out.print("Enter visitor name to mark exit: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < visitorCount; i++) {
            if (visitors[i].name.equalsIgnoreCase(name) && visitors[i].exitTime == null) {
                System.out.print("Exit Time: ");
                String timeOfExit = sc.nextLine();
                visitors[i].markExit(timeOfExit);
                System.out.println("Exit marked.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Visitor not found or already exited.");
        }
    }

    static void reportIncident() {
        if (incidentCount < 100) {
            System.out.print("Type: ");
            String type = sc.nextLine();
            System.out.print("Location: ");
            String loc = sc.nextLine();
            System.out.print("Time: ");
            String time = sc.nextLine();
            incidents[incidentCount] = new Incident(type, loc, time);
            incidentCount++;
        } else {
            System.out.println("Incident log is full.");
        }
    }

    static void showVisitors() {
        for (int i = 0; i < visitorCount; i++) {
            visitors[i].display(i + 1);
        }
    }

    static void showIncidents() {
        for (int i = 0; i < incidentCount; i++) {
            incidents[i].display();
        }
    }
}
