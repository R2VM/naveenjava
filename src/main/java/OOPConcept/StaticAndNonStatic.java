package OOPConcept;

public class StaticAndNonStatic {
    String name = "Tom";    // Non Static Global Variable
    static int age = 25;    //Static Global Variable

    public static void main(String[] args) {
        // How to Call Static Methods
        sum();   // 1. Direct Calling
        StaticAndNonStatic.sum();   // 2. Calling by Classname

        // How to Call Variables
        System.out.println(age);
        System.out.println(StaticAndNonStatic.age);

        // How to Call Non Static Methods and Variable
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();
        System.out.println(obj.name);
    }
    public void sendMail() {       // Non Static Method
        System.out.println("Send Mail Method");
    }
    public static void sum() {     // Static Method
        System.out.println("Sum Method");
    }
}
