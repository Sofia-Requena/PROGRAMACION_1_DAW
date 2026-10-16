public class Persona {
    //Conjunto de atributos
    private String nombre;
    private int edad;
    private double estatura;
    private final String DNI="";

    //Constructor
    public Persona(String nombre){} //Constructor base o por defecto
    public Persona(String nombre, int edad, double estatura) { //Constructor por parametros
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;

        //Constructor por copia
    }


    
    //Metodos
        //Metodo GET devuelve algo
        //Metodo SET da un valor a una variable
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

        public void Saludar (){
            System.out.println("Hola Soy "+nombre);
        }




    public static void main(String[] args) {
        //Crear un objeto persona
        Persona p=new Persona( "Sofia");
        Persona p2=new Persona("Sofia", 18, 1.59);

        Persona pepa=new Persona("Pepa", 18, 1.87);
        Persona paco=new Persona("Paco", 51, 1.68);
        Persona miguel=new Persona("Miguel", 27, 1.79);
        //Saludar
        p.Saludar();
        p2.Saludar();

        // Persona otra=pepa; Esto es una referencia en memoria
        // Persona otra=new Persona(pepa); Constructor por copia
        pepa.Saludar();
        // otra.setNombre("Sofia");
        pepa.Saludar();

        // otra.nombre="Luis"; NO ASIGNAR UN VALOR a un atributo completo de una clase

        

    }




}
