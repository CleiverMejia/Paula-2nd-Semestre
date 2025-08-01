package ProyectoAula.Models;

import ProyectoAula.Enums.TypeOfVehicle;

public class Vehicle {
    private final TypeOfVehicle typeOfVehicle;
    private final String plate;
    private final String city;

    public Vehicle(
        TypeOfVehicle typeOfVehicle,
        String plate,
        String city
    ) {
        this.typeOfVehicle = typeOfVehicle;
        this.plate = plate;
        this.city = city;
    }

    public TypeOfVehicle getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getPlate() {
        return plate;
    }

    public String getCity() {
        return city;
    }
}
