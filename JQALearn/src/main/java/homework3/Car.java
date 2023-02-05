package homework3;

public class Car {
    /* Add the fields of the Class*/
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    int freeFuel;
    String engineFuelOperationSystem;

    /*
    Change the value of the engineFuelOperationSystem;
     */
    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem){
        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    /*
    Subtraction the used fuel from free fuel. If there is no enough free fuel, then the message is shows
     */
    public void useFuel(double fuel){
        if( freeFuel > fuel){
            this.freeFuel -= fuel;
        } else {
            this.freeFuel = 0;
            System.out.println("Not enough free fuel");
        }
    }




}
