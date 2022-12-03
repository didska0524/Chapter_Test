package Ch05.Bonus1;
//201804077최환규
//보너스1번문제

interface Shape{
    double PI = 3.14;         // 상수
    void draw();                    // 추상 메소드
    double getArea();               // 추상 메소드
    default void redraw(){   // 코드가 작성된 디폴트 메소드
        System.out.println("--- 다시 그립니다. ---");
        draw();
    }
}
class Circle implements Shape {

    private double i;

    public Circle(double i) {
        this.i=i;
    }

    @Override
    public void draw() {
        System.out.print("반지름 "+i);
    }

    @Override
    public double getArea() {
        return i*i*PI;
    }

}

public class ShapeApp {
    public static void main(String[] args) {
        Shape coin = new Circle(10);    //반지름이 10인 코인 객체 생성
        coin.redraw();
        System.out.println(" 코인의 면적은 "+ coin.getArea());
    }
}
