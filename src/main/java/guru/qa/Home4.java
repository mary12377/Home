package guru.qa;

public class Home4 {
    public static void main(String[] args) {
        char symbol = 'w';
        boolean flag = false;

        byte aByte = 87;                 // -128 ... 127                                                 // 1 byte
        short aShort = 20890;               // -32768 ... 32767                                             // 2 byte
        int aInt = 98754;                   // -2147483648 ... 2147483647                                   // 4 byte
        long aLong = 123L;                 // –9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807     // 8 byte
        float aFloat = 1.23F;               // -2147483648 ... 2147483647                                   // 4 byte
        double aDouble = 1.2D;             // –9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807     // 8 byte

        //arithmetic
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));        // a + b = 30
        System.out.println("a - b = " + (a - b));        // a - b = -10
        System.out.println("a * b = " + (a * b));        //a * b = 200
        System.out.println("b / a = " + (b / a));        //b / a = 2
        System.out.println("b % a = " + (b % a));        //b % a = 0
        System.out.println("c % a = " + (c % a));        //c % a = 5
        System.out.println("a++   = " +  (a++));         //a++   = 10
        System.out.println("b--   = " +  (a--));         //b--   = 11
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));         //d++   = 25
        System.out.println("++d   = " +  (++d));         //++d   = 27


        //comparison (сравнение)
        int o = 10;
        int t = 20;
        System.out.println("o == t = " + (o == t) );   //o == t = false
        System.out.println("o != t = " + (o != t) );   //o != t = true
        System.out.println("o > t = " + (o > t) );     //o > t = false
        System.out.println("o < t = " + (o < t) );     //o < t = true
        System.out.println("t >= o = " + (t >= o) );   //t >= o = true
        System.out.println("t <= o = " + (t <= o) );   //t <= o = false


        //logical
        boolean g = true;
        boolean i = false;

        System.out.println("g && i = " + (g&&i));        // g && i = false

        System.out.println("g || i = " + (g||i) );        // g || i = true

        System.out.println("!(g && i) = " + !(g && i));        // !(g && i) = true


        //assignment(присваивание)
        int e = 10;
        int p = 20;
        int s = 0;

        s = e + p;
        System.out.println("s = e + p = " + s );     //s = e + p = 30

        s += e ;
        System.out.println("s += e  = " + s );        //s += e  = 40


        s -= e ;
        System.out.println("s -= e = " + s );        //s -= e = 30

        s *= a ;
        System.out.println("s *= e = " + s );       //s *= e = 300

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );        //c /= a = 1


        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );        //c %= a  = 5


        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );        //c <<= 2 = 20


        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );        //c >>= 2 = 5


        c >>= 2 ;
        System.out.println("c >>= a = " + c );        //c >>= 2 = 1


        c &= a ;
        System.out.println("c &= 2  = " + c );        //c &= a  = 0


        c ^= a ;
        System.out.println("c ^= a   = " + c );        //c ^= a   = 10


        c |= a ;
        System.out.println("c |= a   = " + c );        //c |= a   = 10


        //overflow(переполнение)
        System.out.println("overflow:");
        System.out.println("byte min = " + Byte.MIN_VALUE);
        // b = Byte.MIN_VALUE - 1;
        System.out.println("byte min = " + Byte.MAX_VALUE);
        // b = Byte.MAX_VALUE + 1;

    }


}

