import java.util.*;

class Event {
    String title;
    int duration;
    int priority;

    public Event(String title, int duration, int priority) {
        this.title = title;
        this.duration = duration;
        this.priority = priority;
    }
}

class BookingSystem {
    static final int TOTAL_TIME = 6;
    static final int BUFFER_TIME = 1;
    static Event[] schedule = new Event[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Event[] events = new Event[3];  
        int eventsIndex = 0;  
        int startTime = 10;  

        for (int i = 0; i < events.length; i++) {
            System.out.println("-----------------------------\n\nDo you wish to book an event? (Y/N): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                System.out.println("Enter event title:");
                String title = scanner.nextLine();

                System.out.println("Enter event duration (1 to 6 hours):");
                int duration = scanner.nextInt();
                scanner.nextLine();  

                System.out.println("Enter priority (1: Highest / 2: Medium / 3: Lowest):");
                int priority = scanner.nextInt();
                scanner.nextLine();  

                events[eventsIndex++] = new Event(title, duration, priority);
            } else {
                System.out.println("Booking process ended.");
                break;
            }
        }

        Arrays.sort(events, 0, eventsIndex, Comparator.comparingInt(e -> e.priority));

        int slotsTime = 0;
        int scheduleIndex = 0;

        
        System.out.println("\n----------------------------------------------------");
        System.out.println("Event Title     | Priority| Duration | Time Slot");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < eventsIndex; i++) {
            Event event = events[i];

            if (scheduleIndex < schedule.length && slotsTime + event.duration <= TOTAL_TIME) {
                schedule[scheduleIndex++] = event;

                
                System.out.println(event.title + "               | " + event.priority + "       | " 
                                   + event.duration + " hours  | " + startTime + ":00 - " + (startTime + event.duration) + ":00");

                startTime += event.duration; 

                if (scheduleIndex < eventsIndex) { 
                    System.out.println("Buffer Time     | -       | " + BUFFER_TIME + " hour   | " 
                                       + startTime + ":00 - " + (startTime + BUFFER_TIME) + ":00");
                    startTime += BUFFER_TIME;
                }
            }
        }
        System.out.println("----------------------------------------------------");
    }
}