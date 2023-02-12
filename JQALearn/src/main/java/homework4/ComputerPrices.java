package homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        /* Creating new object and set his price */
        Computer pc1 = new Computer();
        pc1.setPrice(2000);

        /* Creating new object by using the constructor with 3 arguments*/
        Computer pc2 = new Computer(2022,2000,"Windows");

        /* Printing the result from the comparing */
        System.out.println(pc1.comparePrice(pc2));
    }
}
