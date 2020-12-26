package OOPConcept;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.soap.SOAPPart;

public class MethodsFunctions {
    public static void main(String[] args) {
        MethodsFunctions obj = new MethodsFunctions();
        //one Object will be created, obj is thevReference Variable, referrring to this OBJECT
        //after creating the Object, the copy of ALL Non-Static Methods will be given to this OBJECT

        obj.test();
        int l = obj.pqr();
        System.out.println(l);
        String s = obj.qa();
        System.out.println(s);

        int d = obj.division(30, 10);
        System.out.println(d);
        //Main Methods is void, never returns a VALUE
    }

    //Non Static Methods
    // void --- Does NOT return any Value
    // return type = void
    public void test() {
        System.out.println("test method");
    }

    //return type = int
    public int pqr() {
        System.out.println("PQR method");
        int a = 10;
        int b = 20;
        int c = 30;
        return c;
    }
    //return type = String
    public String qa() {
        System.out.println("qa method");
        String s = "Selenium";
        return s;
    }
    //return type = int
    public int division(int x, int y){
        System.out.println("division method");
        int d = x/y;
        return d;
    }

}
