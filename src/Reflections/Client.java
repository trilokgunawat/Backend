package Reflections;

public class Client {
    public static void main(String[] args)  {
        demo();

    }
    public static void demo()  {
        try {
            Class studentDetails = Class.forName("Reflections.Student");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
