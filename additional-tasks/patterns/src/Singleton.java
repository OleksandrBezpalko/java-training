public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.doWork();
    }
}

class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {}
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    public void doWork() {
        System.out.println("do work");
    }
}
