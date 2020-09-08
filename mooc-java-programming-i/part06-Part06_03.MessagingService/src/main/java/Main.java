
public class Main {

    public static void main(String[] args) {
        String text = "Implement the MessagingService class. The class must have a parameterless constructor and contain a list of Message objects. After that, add the following two methods to the class Implement the MessagingService class. The class must have a parameterless constructor and contain ss";
        Message test = new Message("larry", text);
        
        MessagingService icq = new MessagingService();
        icq.add(test);
        System.out.println(icq.getMessages());
    }
}
