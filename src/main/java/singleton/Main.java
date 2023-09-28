package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setCounter(15);
        System.out.println("Counter 1: " + singleton.getCounter() + ". Singleton: " + singleton);

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setCounter(20);
        System.out.println("Counter 2: " + singleton1.getCounter() + ". Singleton: " + singleton1);

        System.out.println("------------------------------------------------------------");

        Application application = Application.getInstance();
        Application app = Application.getInstance();
        application.run();
        app.run();

        System.out.println(application + " " + app);

    }
}
