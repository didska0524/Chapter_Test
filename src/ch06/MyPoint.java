package ch06;
//201804077최환규
//1번문제

public class MyPoint {
    private int a;
    private int b;


    public MyPoint(int a, int b) {  // 생성자
        this.a = a;
        this.b = b;
    }

    public String toString() {  // 오버라이딩을 통한 toString 클래스 재정의
        return getClass().getSimpleName() + "(" + a + "," + b+ ")";
        // getClass() 는 현재 참조하고 있는 클래스를 확인할 수 있는 메소드
        // getName() 은 각 패키지명이 포함된 클래스명을 추출
        // getSimpleName() 은 경로가 포함되지않는 클래스명을 추출
    }

    public static void main(String[] args) {
        MyPoint a = new MyPoint(3,20);   // 객체생성
        System.out.println(a);  // 재정의된 toString 호출
    }
}
