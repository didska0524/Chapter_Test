package ch06;
//201804077최환규
//1번문제

public class MyPoint {
    private int a;
    private int b;


    public MyPoint(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return getClass().getName() + "(" + a + "," + b+ ")";
    }

    public static void main(String[] args) {
        MyPoint a = new MyPoint(3,20);
        System.out.println(a);
    }
}
