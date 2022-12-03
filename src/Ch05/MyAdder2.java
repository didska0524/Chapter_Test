package Ch05;

//201804077최환규
//2번문제
interface AdderInterface {  // 클래스가 구현해야 할 메소드들이 선언되는 인터페이스
    int add(int x, int y);  // 추상 메소드, public abstract 생략 가능
    int add(int n);   // 추상 메소드, public abstract 생략 가능
}
class MyAdder implements AdderInterface{    //인터페이스의 메소드를 모두 구현한 클래스

    @Override   // 매개변수 둘을 합한값을 리턴하는 첫번째 add 메소드
    public int add(int x, int y) {
        return x+y;
    }

    @Override   // 1부터 매개변수까지의 합을 리턴하는 두번째 add 메소드
    public int add(int n) {
        int sum = 0;
        for (int i=0; i<n+1; i++){
            sum+=i;
        }   //1부터 n까지 반복하여 값을 sum 에 저장하여 리턴
        return sum;
    }
}
public class MyAdder2 {
    public static void main(String[] args) {
        MyAdder adder = new MyAdder();  //객체 생성
        System.out.println(adder.add(5, 10));   // 매개변수가 두개인 첫번째 메소드 출력
        System.out.println(adder.add(10));            // 매개변수가 한개인 두번째 메소드 출력
    }
}
