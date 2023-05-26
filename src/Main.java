import design.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setValue(10);
        System.out.println(Singleton.class.getName());
        System.out.println(s1.value);
        System.out.println("Hello world!");

    }
}
