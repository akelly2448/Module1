public class Variables {
    public static void main(String[] args){
        int linesOfCode;
        linesOfCode = 227;

        int dogCount = 94;
        int catCount = 112;
        int petCount = dogCount + catCount;
        System.out.println(petCount);   //206

        int tacos = 17;
        int hotdogs = 23;
        int total = hotdogs + tacos;
        System.out.println(total); //40

        tacos = 22;
        System.out.println(total); //still 40

        total = hotdogs + tacos;
        System.out.println(total); //45

        byte b = 56;
        short s = 1024;
        int i = 314;
        long lng = -256;

        float f = 3.14f;
        double d = 3.14;

        byte b2 = 8;
        short s2 = 16;
        int i2 = 32;
        long lng2 = 64L;

        //widening conversion
        s2 = b2;
        i2 = s2;
        lng2 = i2;
        lng2 = 32;

        //floating point numbers
        float f2 = 32.0f;
        double d2 = 64.0;

        //widening conversion
        d2 = f2;
        f2 = i2;
        d2 = lng2;
    }
}
