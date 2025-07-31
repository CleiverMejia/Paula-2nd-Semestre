package ProyectoAula.Models;

public class User {
    private final String name;
    private final String entry;
    private final String exit;
    private final Car car;

    public User(Car car, String entry, String exit, String name) {
        this.car = car;
        this.entry = entry;
        this.exit = exit;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEntry() {
        return entry;
    }

    public String getExit() {
        return exit;
    }

    public Car getCar() {
        return car;
    }
}