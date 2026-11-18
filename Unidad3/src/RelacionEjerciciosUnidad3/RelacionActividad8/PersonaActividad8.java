package RelacionEjerciciosUnidad3.RelacionActividad8;

public class PersonaActividad8 {
    /*Atributos*/
    private String nombre;
    private int edad;
    private String numero_telefono;
    private String poblacion;

    /*Constructores*/
    public PersonaActividad8() {}

    public PersonaActividad8(String nombre, int edad, String numero_telefono, String poblacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero_telefono = numero_telefono;
        this.poblacion = poblacion;
    }

    public PersonaActividad8(PersonaActividad8 copiaPersonaActividad8) {
        this.nombre = copiaPersonaActividad8.getNombre();
        this.edad = copiaPersonaActividad8.getEdad();
        this.numero_telefono = copiaPersonaActividad8.getNumero_telefono();
        this.poblacion = copiaPersonaActividad8.getPoblacion();
    }

    /*Metodos*/
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

    public String getNumero_telefono() {
        return numero_telefono;
    }
    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /*Mensajes para imprimir*/

    public void imprimirPersonaActividad8(){
        System.out.println("El nombre de la persona es: "+nombre);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El numero de telefono de la persona es: "+numero_telefono);
        System.out.println("La poblacion donde vive la persona es: "+poblacion);
    }
    
}
