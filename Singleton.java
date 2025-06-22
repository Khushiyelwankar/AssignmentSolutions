// Singleton Class
public class Singleton {

    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private so that this class cannot be instantiated from outside
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method to test
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        // Verify both objects are same
        System.out.println("Are obj1 and obj2 same? " + (obj1 == obj2)); // true
    }
}