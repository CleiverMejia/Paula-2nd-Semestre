package BaseDatos;

class Persona {

    String nombre="ARMANDO";
    String Apellido = "CASAS";
    int edad = 45;

    public void desplegarnombre(){
        System.out.println("nombre: "+nombre);
        System.out.println("Apellido: "+ Apellido);
        System.out.println("Edad: "+edad);

    }

}

public class asd {

    public static void main(String[] args) {
        Persona p1; 
        p1 = new Persona();
        p1.desplegarnombre();

        Persona p2 = new Persona();
        p2.nombre="CARLA";
        p2.Apellido="GOMEZ";
        p2.edad=44;
        
        System.out.println("");
        p2.desplegarnombre();
    }
}
