package OOPConcept;

public class Car {
    //Class variables;
    int mod;
    int wheel;

    public static void main(String[] args){
        //new Car() --- This is the Object of the CAR Class
        //new keyword is used to create Object
        //a,b,c --- These are Object Reference Variables

        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod = 2014;
        a.wheel = 4;
        b.mod = 2015;
        b.wheel = 4;
        c.mod = 2016;
        c.wheel = 4;

        System.out.println(a.mod);
        System.out.println(a.wheel);
        System.out.println(b.mod);
        System.out.println(b.wheel);
        System.out.println(c.mod);
        System.out.println(c.wheel);
    }
}
