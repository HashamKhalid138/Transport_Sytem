package TransportSystem.ui;

import TransportSystem.model.Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("--------------------------------------------");
        System.out.println("Notification for " + name + ": \n" + message);
    }
}