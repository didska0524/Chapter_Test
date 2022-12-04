package Ch05.Bonus1;
//201804077최환규
//보너스1번문제

interface Shape{
    double PI = 3.14;         // public static final 생략된 상수
    void draw();                    // public abstract 생략된 추상 메소드
    double getArea();               // public abstract 생략된 추상 메소드
    default void redraw(){   // 코드가 작성된 디폴트 메소드 public 접근지정만 허용됨
                            // 인터페이스를 구현하는 클래스에 자동상속된다.
        System.out.println("--- 다시 그립니다. ---");
        draw();
    }
}
class Circle implements Shape { // Shape 인터페이스를 구현하는 클래스 Circle

    private double i;   // 원의 반지름을 표현하기 위한 변수 i

    public Circle(double i) {
        this.i=i;
    }   // 매개변수 i를 가지는 Circle 의 생성자

    @Override
    public void draw() {
        System.out.print("반지름 "+i);
    } // 추상 메소드를 재정의하는 메소드

    @Override
    public double getArea() {
        return i*i*PI;
    }   // 원의 넓이를 리턴함 ( 반지름 * 반지름 * 상수 PI)

}

public class ShapeApp {
    public static void main(String[] args) {
        Shape coin = new Circle(10);    // 반지름이 10인 코인 객체 생성
        coin.redraw();                    // 클래스의 값 정의
        System.out.println(" 코인의 면적은 "+ coin.getArea());    // 화면에 원의 넓이를 출력한다.
    }
}
