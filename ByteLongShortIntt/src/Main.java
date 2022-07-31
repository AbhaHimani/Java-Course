//Learning Java DAY 2

public class Main {
    public static void main(String[] args) {
         int myVal= 10000;
         int myMin= Integer.MIN_VALUE;
         int myMax= Integer.MAX_VALUE;
         System.out.println("Integer Minimum Value="+ myMin);
         System.out.println("Integer Maximum Value="+myMax);
        System.out.println("Integer Busted Max Value"+ (myMax+1));
        System.out.println("Integer Busted Min Value"+(myMin-1));
        byte myminByte= Byte.MIN_VALUE;
        byte mymaxByte= Byte.MAX_VALUE;
        System.out.println("Maximum Byte Value="+mymaxByte);
        System.out.println("Minimum Value="+ myminByte);

        short myminshort= Short.MIN_VALUE;
        short mymaxshort= Short.MAX_VALUE;
        System.out.println("Maximum short Value="+mymaxshort);
        System.out.println("Minimum Value="+ myminshort);
//       System.out.println("Hello world!");
        long myLongValue= 100L;
        long myminlong= Long.MIN_VALUE;
        long mymaxlong= Long.MAX_VALUE;
        System.out.println("Maximum long Value="+mymaxlong);
        System.out.println("Minimum Value="+ myminlong);

        byte halfbyte= (byte) (mymaxByte/2); //casting
        short halfshort= (short) (mymaxshort/2);



        //Primitive Type Challenge
        byte mybyte = 122;
        short myshort= 22000;
        int myint= 10000;
        long mylong= 50000L + 10L*(mybyte+myint+myshort);
        System.out.println(mylong);

        float myF= 5f;
        double myD= 5d;
        System.out.println(5/3);
        System.out.println(myF/3f);
        System.out.println(myD/3d);

        char myChar='D';
        char myUnicodeChar= '\u0044';
        char myCopyRightChar= '\u00A9';
        System.out.println(myChar);
        System.out.println(myCopyRightChar);
        System.out.println(myUnicodeChar);


    }



}