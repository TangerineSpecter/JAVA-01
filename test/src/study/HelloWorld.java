package study;

public class HelloWorld {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        for (int g = 0; g <= e; g++) {
            if (g == c) {
                System.out.println("c的值为:" + c);
            }
            if (g == d) {
                System.out.println("d的值为:" + d);
            }
            if (g == e) {
                System.out.println("e的值为:" + e);
            }
            if (g == f) {
                System.out.println("f的值为:" + f);
            }
        }
    }
}
