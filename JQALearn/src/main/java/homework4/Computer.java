package homework4;

public class Computer {
    /* The fields of the class */
    private int year;
    private double price;
    private String operationSystem;

    /* Default constructor */
    Computer(){}

    /* Constructor with 3 arguments */
    Computer(int year, double price, String operationSystem){
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    /* Use method for comparing prices of two object. The argument is an object */
    public int comparePrice(Computer compare){

        if(this.price > compare.price){
            return -1;
        } else if(this.price < compare.price) {
            return 1;
        } else {
            return 0;
        }
    }
    /* Getters and Setters for private fields */
    public int getYear(){
        return this.year;
    }

    public double getPrice(){
        return this.price;
    }

    public String getOperationSystem(){
        return this.operationSystem;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setOperationSystem(String operationSystem){
        this.operationSystem = operationSystem;
    }
}
