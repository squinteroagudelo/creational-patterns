package singleton;

public class Application {
    private static Application application;

    boolean isRunning = false;

    private Application() {
    }

    public static Application getInstance() {
        if (application == null) {
            application = new Application();
        }

        return application;
    }

    public void run(){
        if (!isRunning){
            System.out.println("Application started!!!");
            isRunning = true;
        } else {
            System.out.println("Already is running!!!");
        }

    }
}
