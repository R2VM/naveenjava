package OOPConcept;

public class LocalAndGlobalVariables {
    //Global Variables --- Class Variables
    String name = "Tom";
    int age = 25;

    public static void main(String[] args) {
        int i = 10;  //Local Variable for MAIN Method
        System.out.println(i);

        LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
    public void sum() {
        int i = 15;  //Local Variable for SUM Method
        int j = 20;
    }
}
