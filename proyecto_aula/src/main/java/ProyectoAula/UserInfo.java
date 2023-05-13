package ProyectoAula;

import java.util.*;

public class UserInfo {
    private ArrayList<String> nombre = new ArrayList<>();
    private ArrayList<String> tipoVehiculo = new ArrayList<>();
    private ArrayList<String> placa = new ArrayList<>();
    private ArrayList<String> ciudad = new ArrayList<>();
    private ArrayList<String> entrada = new ArrayList<>();
    private ArrayList<String> salida = new ArrayList<>();

    public void NewUser(String name, String type, String placa, String city, String input, String output) {
        this.nombre.add(name);
        this.tipoVehiculo.add(type);
        this.placa.add(placa);
        this.ciudad.add(city);
        this.entrada.add(input);
        this.salida.add(output);
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

    public String GetInput(int i) {
        return this.entrada.get(i);
    }

    public String GetOutput(int i) {
        return this.salida.get(i);
    }

    public String SetOutput(int i, String fecha) {
        return this.salida.set(i, fecha);
    }

    public String GetAll(int i) {
        return this.nombre.get(i)+"⁋"+this.tipoVehiculo.get(i)+"⁋"+this.placa.get(i)+"⁋"+this.ciudad.get(i)+"⁋"+this.entrada.get(i)+"⁋"+this.salida.get(i);
    }
}
