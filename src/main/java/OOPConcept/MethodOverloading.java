package OOPConcept;

public class MethodOverloading {
    public static void main(String[] args){

        MethodOverloading obj = new MethodOverloading();
            obj.sum();
            obj.sum(10);
            obj.sum(10, 5);
    }

    public void sum() {
        System.out.println("Sum Method --- Zero Parameter");
    }

    public void sum(int i){
        System.out.println("Sum Method --- 1 input Parameter");
        System.out.println(i);
    }

    public void sum(int k, int l){
        System.out.println("Sum Method --- 2 Input Parameter");
        System.out.println(k+l);
    }
}
