package BaseDatos;

import java.util.*;

public class UserInfo {
    private ArrayList<String> nombre = new ArrayList<>();
    private ArrayList<String> tipoVehiculo = new ArrayList<>();
    private ArrayList<String> placa = new ArrayList<>();
    private ArrayList<String> ciudad = new ArrayList<>();


    public void NewUser(String name, String type, String placa, String city) {
        this.nombre.add(name);
        this.tipoVehiculo.add(type);
        this.placa.add(placa);
        this.ciudad.add(city);
    }

    public void GetUser(int i) {
        System.out.println(this.nombre.get(i));
        System.out.println(this.tipoVehiculo.get(i));
        System.out.println(this.placa.get(i));
        System.out.println(this.ciudad.get(i));
    }

    public String GetName(int i) {
        return this.nombre.get(i);
    }

    public String GetType(int i) {
        return this.tipoVehiculo.get(i);
    }

    public String GetPlaca(int i) {
        return this.placa.get(i);
    }
    
    public String GetCity(int i) {
        return this.ciudad.get(i);
    }

    public String GetAll(int i) {
        return this.nombre.get(i)+","+this.tipoVehiculo.get(i)+","+this.placa.get(i)+","+this.ciudad.get(i);
    }
}
