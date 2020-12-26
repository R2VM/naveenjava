package javaBasics;

public class loopConcept {

    public static void main(String[] args) {
        //While Loop
        int i = 1;       // initialisation
        while(i<=10){    // conditional
            System.out.println(i);
            i=i+1;       //  incremental or decrimental
        }
        System.out.println("********************");

        // For Loop  j++ means j = j+1
        // print 1 to 10
        for(int j=1;j<=10;j++){
            System.out.println(j);
        }
           System.out.println("****************");
        // print 10 to 1

        for(int k=10; k>=1; k--){
            System.out.println(k);
        }
    }
}
