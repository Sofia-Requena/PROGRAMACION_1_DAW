package RelacionEjerciciosUnidad3.RelacionActividad7;

public class Lucha {
    public static void main(String[] args) {
        Heroe heroe1 = new Heroe("Spider-Man", 100, 20);
        Monstruo monstruo1 = new Monstruo("Venom", 100, 10);

        System.out.println("En esta batalla se van a enfretar el Heroe: "+heroe1.getNombre()+" contra el Monstruo: "+monstruo1.getNombre());

        System.out.println("En esta batalla la informacion del heroe es: ");
        heroe1.mostrarInfo();
        System.out.println("");

        System.out.println("En esta batalla la informacion del Monstruo es: ");
        monstruo1.mostrarInfo();
        System.out.println("");

        while (heroe1.getVida()>0 && monstruo1.getVida()>0) {
            int min=1;
            int max=2;
            int aleatorio =((int)(Math.random()*(max-min+1))+min);

            if (aleatorio==1) {
                monstruo1.recibirDaño(heroe1.getAtaque());
                System.out.println("El monstruo ha sido atacado por el heroe, su vida actual es de: "+monstruo1.getVida());
                System.out.println("");
            }

            else if (aleatorio==2) {
                heroe1.recibirDaño(monstruo1.getAtaque());
                System.out.println("El Heroe ha sido atacado por el monstruo, su vida actual es de: "+heroe1.getVida());
                System.out.println("");
            }

            if (heroe1.getVida()>0 && monstruo1.getVida()==0) {
                System.out.println("El ganador de esta batalla ha sido: "+heroe1.getNombre()+" y le ha quedado de vida: "+heroe1.getVida());
            }

            else if (heroe1.getVida()==0 && monstruo1.getVida()>0) {
                System.out.println("El ganador de esta batalla ha sido: "+monstruo1.getNombre()+" y le ha quedado de vida: "+monstruo1.getVida());
            }
        }
    }

/*No borrar llave*/
}
