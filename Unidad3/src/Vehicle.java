public class Vehicle {
    private boolean usedFlag;
    private String model;
    private int numTires;

    public Vehicle(boolean used, String theModel, int tires){
        this.usedFlag= used;
        this.model= theModel;
        this.numTires=tires;
    }

    public void start(){
        System.out.println("El coche ha arrancado");
    }
    public void turnLeft(){}
    public void turnRight(){}
    public void stop(){}
    public void forward(int speed){
        System.out.println("El coche ha avanzado 20 metros");
    }

    public static void main(String[] args) {
        Vehicle motorcycle1= new Vehicle(false,"Honda",2);
        Vehicle car1= new Vehicle (true,"Toyota",4);
        motorcycle1.start();
        car1.start();
        motorcycle1.forward(20);
    }






}
