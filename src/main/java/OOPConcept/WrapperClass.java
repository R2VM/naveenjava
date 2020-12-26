package OOPConcept;

public class WrapperClass {
    public static void main(String[] args){
        String x = "100";
        System.out.println(x+20);

        // Data conversion: String to int
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //Interger, Double, Charecter, Boolean
        // String to double conversion
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+20);

        //String to Boolean
        String k = "true";
        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);

        //Int to String Conversion
        int j =200;
        System.out.println(j+20);
        String s = String.valueOf(j);  //"200"
        System.out.println(s+20);

        //Unable to Convert - Error Number Format Exception
        String u = "100A";
        Integer.parseInt(u);
    }
}
