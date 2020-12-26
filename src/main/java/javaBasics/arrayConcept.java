package javaBasics;

public class arrayConcept {
    public static void main(String[] arg) {
    // Array: to store similar data type values in a Array
    // int Array
    // Size is Fixed - Static Array - To over come this - we use Collections - ArrayList, HashTable, Dynamic Array
        int i[] = new int[4];   // Static Array
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[2]);
        System.out.println(i[3]);

        System.out.println(i.length);  // Size of Array
                                        // print All values of Array; use FOR loop
        for(int j=0;j<i.length;j++) {
            System.out.println(i[j]);
        }

        // 2. Double Array
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 13.44;
        d[2] = 44.55;

        System.out.println(d[2]);
       //3. Char Array
       char c[] = new char[3];
            c[0]= 'a';
            c[1]='2';
            c[2]='S';
        System.out.println(c[2]);
        //4. Boolean Array
        boolean b[] = new boolean[2];
                b[0]= true;
                b[1]= false;

        //5. String Array
        String s[] = new String[3];
               s[0] = "test";
               s[1] = "Hello";
               s[2] = "World";
        System.out.println(s[1]);

        //6. Object Array ( To store different Data types )
        Object ob[] = new Object[6];
               ob[0] = "Tom";
               ob[1] = 25;
               ob[2] = 12.33;
               ob[3] = "1/2/2000";
               ob[4] = "M";
               ob[5] = "London";
        System.out.println(ob[5]);
        }
        }