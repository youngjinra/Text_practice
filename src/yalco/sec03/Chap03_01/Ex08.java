package yalco.sec03.Chap03_01;

public class Ex08 {
    public static void main(String[] args) {
        int int1 = 3;
        int int2 = int1++;
        int int3 = ++int1;
        int int4 = -(int2-- * --int3);

        int x = 1;

        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
    }
}
