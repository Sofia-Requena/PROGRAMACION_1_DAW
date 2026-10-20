public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private double estatura;
    private final String DNI="111111111111A";

    //Constructor
    public Persona(){ }//Constructor por defecto
    public Persona(String nombre, int edad, double estatura) {//Constructor por parámetros
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public Persona(Persona otra){//Constructor por copia
        this.nombre=otra.getNombre();
        this.edad=otra.getEdad();
        this.estatura=otra.getEstatura();
    }

    //Métodos
    
    public void saludar(){
        System.out.println("Hola a todos, soy "+nombre);
    }
    public void presentacion(){
        System.out.println("Hola a todos, soy "+nombre+", tengo "+edad+" años y mido "+estatura);
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //main
    
}