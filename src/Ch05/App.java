package Ch05;

import java.util.Scanner;   //스캐너 패키지 임폴트
//201804077최환규
//3번문제
abstract class Calculator{  // Calculator 추상클래스(abstract)
    protected int a,b;  // 접근지정자가 protected 인 변수 a,b
    abstract protected int calc();  // 추상 메소드
    protected void input(){ // 두 정수를 입력받는 메소드
        Scanner scanner = new Scanner(System.in);   // 스캐너 객체 생성
        System.out.print("정수 2개를 입력하세요>>"); // int 형 변수 2개 입력받음
        a=scanner.nextInt();
        b=scanner.nextInt();
    }
    public void run(){  //두 정수를 입력받아 계산하고 결과를 출력하는 메소드
        input();
        int res = calc();
        System.out.println("계산된 값은 "+res);
    }
}
//이곳에 Adder와 Subtracter 클래스작성
class Adder extends Calculator{ // 추상클래스인 Calculator 를 상속받음
    @Override   // 추상클래스에서 정의되지 못한 메소드 재정의
    protected int calc() {
        return a+b;
    }       // 두 값을 더한 값을 리턴
}
class Subtracter extends Calculator{    // 추상클래스인 Calculator 를 상속받음
    @Override   // 추상클래스에서 정의되지 못한 메소드 재정의
    protected int calc() {
        return a-b;
    }       // 두 값을 뺀 값을 리턴
}

public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();  // 추상 클래스를 상속받은 두 클래스의 객체 선언

        adder.run();
        sub.run();
        // 두 객체의 같은 메소드를 호출하지만 각자 다르게 정의된 메소드가 호출된다.
    }
}
