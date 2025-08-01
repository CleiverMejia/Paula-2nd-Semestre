package ProyectoAula.Models;

public class User {
    private final String name;
    private final String entry;
    private final String exit;
    private final Vehicle vehicle;

    public User(Vehicle vehicle, String entry, String exit, String name) {
        this.vehicle = vehicle;
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

    public Vehicle getCar() {
        return vehicle;
    }
}