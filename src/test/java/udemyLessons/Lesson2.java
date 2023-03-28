package udemyLessons;

public class Lesson2 {
    public static void main(String[] args) {
        byte b1=12;
        byte b2=0b1100;
        byte b3=014;
        byte b4=0xC;

        System.out.println(b1+" "+b2+" "+b3+" "+b4);

        short sh1=1300;
        short sh2=0b0101_0001_0100;
        short sh3=02424;
        short sh4=0x514;

        System.out.println(sh1+" "+sh2+" "+sh3+" "+sh4);

        int i1=0;
        int i2=0b0;
        int i3=00;
        int i4=0x0;

        System.out.println(i1+" "+i2+" "+i3+" "+i4);

        long l1=123456789l;
        long l2=0b0111_0101_1011_1100_1101_0001_0101;
        long l3=0726_746_425;
        long l4=0x75B_CD15;

        System.out.println(l1+" "+l2+" "+l3+" "+l4);

        double d1=3.14d;
        double d2=3.33D;

        float f1=4.33f;
        float f2=4.55F;

        boolean bol1=true;
        boolean bol2=false;

        System.out.println(d1+" "+d2+"\n"+f1+" "+f2+"\n"+bol1+" "+bol2);

        char c1= 'a';
        char c2=7777;
        char c3='\u12AA';

        System.out.println(c1+" "+c2+" "+c3);
    }
}
