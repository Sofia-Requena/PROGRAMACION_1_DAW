import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona2 {
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    static int hijos;
    Persona2 pareja;
    

public Persona2(){} //Contructor por defecto 

public Persona2(String DNI,String fecha){ //Contructor parametros
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
}

public Persona2(Persona2 otra){//Constructor por copia
        this.nombre=otra.getNombre();
        this.fechaNacimiento=otra.getFechaNacimiento();
        this.estatura=otra.getEstatura();
        this.DNI=otra.getDNI();
        this.hijos=otra.getHijos();
        this.pareja=otra.getPareja();
    }

public void obtenerEdad(){
        Period periodo=Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes "+periodo.getYears()+" años");
    }


//Práctica: Completa los métodos get y set de forma automática
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getDNI() {
        // return DNI;
    }

    public static int getHijos() {
        return hijos;
    }

    public static void setHijos(int hijos) {
        Persona2.hijos = hijos;
    }

    public Persona2 getPareja() {
        return pareja;
    }

    public void setPareja(Persona2 pareja) {
        this.pareja = pareja;
    }

    public void asignaPareja(Persona2 p){
        this.pareja=p; //Hará referencia a la ya existente
    }

    public static void main(String[] args) {
        Persona2 p=new Persona2("12345678A","15/08/1985");
            p.obtenerEdad();
            System.out.println("Tienes "+p.hijos+" hijos");

            
        
        Persona2 p2=new Persona2("12345678B","01/07/1987");
            p.hijos=1;
            System.out.println("Tienes "+p2.hijos+" hijos");

        
        // System.out.println(p.getDNI()+ " "+p.getNombre("Sofia")+" "+p.getEstatura(1.58)+" "+p.getHijos());

        
    }



}