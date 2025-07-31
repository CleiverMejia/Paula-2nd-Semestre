package ProyectoAula.Models;

public class Car {
    private final String typeOfVehicle;
    private final String plate;
    private final String city;

    public Car(
        String typeOfVehicle,
        String plate,
        String city
    ) {
        this.typeOfVehicle = typeOfVehicle;
        this.plate = plate;
        this.city = city;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getPlate() {
        return plate;
    }

    public String getCity() {
        return city;
    }
}
