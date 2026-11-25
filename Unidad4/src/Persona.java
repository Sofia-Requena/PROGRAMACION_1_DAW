public class Persona {
    String nombre;
    int edad;
    Persona pareja;

    public Persona(){}
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona getPareja() {
        return pareja;
    }
    public void setPareja(Persona pareja) {
        this.pareja = pareja;
    }

    public void infoPersona(){
        if (pareja==null){
            System.out.println("Me llamo "+nombre+" y tengo "+edad);
        }
        else{
            System.out.println("Me llamo "+nombre+" y tengo "+edad+ " y el nombre de mi pareja es "+pareja.getNombre());
        }
    
    }
}
