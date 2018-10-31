package pl.waw.sgh;

public class Blocks {

    //the widest visibility - everyweher
    //public static int = i0 = 0
    //protected static int i0 =5;
    static int i0 = 5;
    //no visibility operator - package wide visibility
    //private static i0 =5;

    static final String MY_CONSTANT = "some text";

    public static void main(String[] args) {
        int i1 = 0;
        System.out.println(MY_CONSTANT);
        //       MY_CONSTANT="dgghd";
        {
            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2 =" + i2);
            {
                int i3 = 7;
                System.out.println("inside internal block i3=" + i3);
            }
        }
        System.out.println("inside a block i1=" + i1);
        //System.out.println("inside a block i2=" + i2);

    }
}
