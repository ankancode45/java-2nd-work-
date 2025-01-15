// Author Ankan 
class LED {
    private int id;
    private String brand;
    private double price;

    // Constructor to initialize the attributes
    public LED(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to print details of the LED
    public void displayDetails() {
        System.out.println("LED ID: " + id + ", Brand: " + brand + ", Price: Rs" + price);
    }
}

class LEDComparison {

    // Method to compare prices of Sony and Samsung and set the higher priced TV as "Premium Model"
    public static void determinePremiumModel(LED sony, LED samsung) {
        if (sony.getPrice() > samsung.getPrice()) {
            sony.setBrand("Premium Model - Sony");
        } else if (samsung.getPrice() > sony.getPrice()) {
            samsung.setBrand("Premium Model - Samsung");
        }
    }

    // Method to print the details of both LED TVs
    public static void displayLEDDetails(LED sony, LED samsung) {
        sony.displayDetails();
        samsung.displayDetails();
    }

    public static void main(String[] args) {
        LED sonyLED = new LED(1, "Sony", 120000.00);
        LED samsungLED = new LED(2, "Samsung", 100000.00);

        // Method to compare the prices and update the brand
        determinePremiumModel(sonyLED, samsungLED);

        // Method to print the details
        displayLEDDetails(sonyLED, samsungLED);
    }
}