public class Forecast {

    public static void main(String[] args) {
        
        Data a1 = new Data('k', 10);
        Data a2 = new Data('j', 15);
        Data a3 = new Data('l', 22);

        Condition(a1);
        Condition(a2);
        Condition(a3);
    }

    public static void Condition(Data data) {
        if (data.temp <= 10) {
            System.out.println("City: " + data.city + " | Weather: Bohot Cold" + " | Temp : " + data.temp );
        } else if (data.temp <= 20) {
            System.out.println("City: " + data.city + " | Weather: Thoda Cold" + " | Temp : " + data.temp );
        } else {
            System.out.println("City: " + data.city + " | Weather: Sunny     " + " | Temp : " + data.temp );
        }
    }
}

class Data {
    char city;
    int temp;

    Data(char city, int temp) {
        this.city = city;
        this.temp = temp;
    }
}
