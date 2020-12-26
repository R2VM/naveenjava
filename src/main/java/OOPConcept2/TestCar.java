package OOPConcept2;

public class TestCar {
    public static void main(String[] args) {

        //Static Polymorphism ----- Compile - Time Polymorphism
        //Polymorphism is 1 to Many, METHODS OVERIDDING
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.thrftSafety();

        System.out.println(" ************ ");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

    }
}
