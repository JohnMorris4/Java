package Morrisje.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**boolean	true or false	false	1 bit	true, false
         byte	twos complement integer	0	8 bits	(none)
         char	Unicode character	\u0000	16 bits	'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
         short	twos complement integer	0	16 bits	(none)
         int	twos complement integer	0	32 bits	-2, -1, 0, 1, 2
         long	twos complement integer	0	64 bits	-2L, -1L, 0L, 1L, 2L
         float	IEEE 754 floating point	0.0	32 bits	1.23e100f, -1.23e-100f, .3f, 3.14F
         double	IEEE 754 floating point	0.0	64 bits	1.23456e300d, -1.23456e-300d, 1e1d**/

        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = myMaxValue / 2;
        System.out.println(myTotal);

        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myTotalByteValue = (byte)(myMaxByteValue/2); //include the (byte to declare the literal as a byte)
        System.out.println(myTotalByteValue);

        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        System.out.println(myShortMaxValue);

        long myLongMinValue = -9_223_372_036_854_775_808L;
        long mylongMaxValue = 9_223_372_036_854_775_807L;
        System.out.println(mylongMaxValue);


        //challange

        byte myByte = 10;
        short myShort = 5000;
        int myInt = 25000;
        long myLong = 50000 + 10 * (myByte  + myInt + myShort);
        System.out.println("My Assignment answer is " + myLong);
    }
}
