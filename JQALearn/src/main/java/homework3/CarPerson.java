package homework3;

public class CarPerson {
    public static void main(String[] args) {
        /*
        Creating two objects with theirs fields */
        Car car1 = new Car();
        car1.year = 1995;
        car1.price = 4999.99;
        car1.isSportCar = false;
        car1.fuelTankCapacity = 50;
        car1.freeFuel = 32;
        car1.engineFuelOperationSystem = "Gasoline";

        Car car2 = new Car();
        car2.year = 2022;
        car2.price = 105000;
        car2.isSportCar = true;
        car2.fuelTankCapacity = 80;
        car2.freeFuel = 20;
        car2.engineFuelOperationSystem = "Diesel";

        /* Changing the fuel of the car 1 */
        car1.changeEngineFuelOperationSystem("Diesel");
        /* Set of used fuel */
        car2.useFuel(56);

        /* Printing the results */
        System.out.println("Car 1: \n Year: " + car1.year + "\n Price: " + car1.price + "\n Is sport: " + car1.isSportCar +
                "\n Fuel Tank Capacity: " + car1.fuelTankCapacity + "\n Free fuel: " + car1.freeFuel +
                "\n Engine Fuel Operation System: " + car1.engineFuelOperationSystem);

        System.out.println("Car 2: \n Year:" + car2.year + "\n Price: " + car2.price + "\n Is sport: " + car2.isSportCar +
                "\n Fuel Tank Capacity: " + car2.fuelTankCapacity + "\n Free fuel: " + car2.freeFuel +
                "\n Engine Fuel Operation System: " + car2.engineFuelOperationSystem);
    }
}
