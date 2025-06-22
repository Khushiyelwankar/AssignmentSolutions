// Interface
interface Notification {
    void notifyUser();
}

// Concrete Classes
class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}

// Factory Class
class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty())
            return null;
        if (type.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        else if (type.equalsIgnoreCase("EMAIL"))
            return new EmailNotification();
        else if (type.equalsIgnoreCase("PUSH"))
            return new PushNotification();
        return null;
    }
}

// Main Class to test
public class FactoryMethodPattern {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("SMS");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("EMAIL");
        notification2.notifyUser();

        Notification notification3 = factory.createNotification("PUSH");
        notification3.notifyUser();
    }
}