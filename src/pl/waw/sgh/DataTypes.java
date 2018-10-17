package pl.waw.sgh;

public class DataTypes {

    /*
    This is a comment
    */

    // psvm
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 120;
        long i1 = 1434535355;
        long i2 = 985245454;

        long i3 = i1;
        // i3 = i3 + i2'
        i3 += i2;

        //long i3 = i1 + i2;

        // sout
        // str(i3) - python
        System.out.println("13: " + i3);

        int a = 5;
        int b, bb;

        b = a++;
        // a = 5;
        bb = ++a;

        System.out.println("b=" + b);
        System.out.println("bb=" + bb);

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1, d2);

        System.out.println("d3=" + d3);
    }


}
