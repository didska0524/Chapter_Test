package Ch05.ch05_number6;
import java.util.*;

//201804077최환규
//6번문제
abstract class Shape {      // 도형의 슈퍼 클래스 추상클래스로 선언됨
    abstract String draw(); // 추상메소드 draw(), 반드시 오버라이딩 해야 사용가능
                            // 선언부만 있고 구현부가 없음
}

class Editor extends Shape{
    Scanner scanner = new Scanner(System.in);   // scanner 객체생성
    static int i = 0;   // static 으로 선언되는 변수 i, 공유해서 사용해야하기때문에 static 으로 선언
    private String[] Shape2 = new String[10];   // 크기가 10인 String[] 형태의 변수 Shape2


    public void insert() {  // 도형을 삽입하는 메소드 insert()
        System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
        int num = scanner.nextInt();    // 스캐너를 통해 int 형식의 값을 받고
        switch (num) {
            case 1 -> { // 받은값이 1이면
                Line line = new Line();     // line 객체를 만들어 오버라이딩된 line.draw()를
                Shape2[i] = line.draw();    // Shape2[i] 에 삽입
                i++;                        // 이때 i는 삽입된 이후 증가된다.
            }
            case 2 -> {
                Rect rect = new Rect();     // Rect 의 경우도 동일
                Shape2[i] = rect.draw();
                i++;
            }
            case 3 -> {
                Circle circle = new Circle();   // Circle 의 경우도 동일
                Shape2[i] = circle.draw();
                i++;
            }
            default -> System.out.println("잘못된 입력입니다.");    // 이외의 값 발생시 예외처리
        }
    }
    public void delete(){   // 삭제하기 위한 메소드 delete()
        System.out.println("삭제할 도형의 위치>>");
        int num = scanner.nextInt();    // 스캐너를 통해 int 형식의 값을 받고
        if(i<num){                      // 입력된 배열의 크기보다 num 값이 클경우 에러메세지
            System.out.println("삭제할 수 없습니다.");
        }
        else{       // 배열 안 인덱스를 깔끔하게 삭제하기위해 리스트로 변환하고 다시 배열로 변환하는 연산
            List<String> strList = new ArrayList<>(Arrays.asList(Shape2));
            strList.remove(num-1);
            Shape2 = strList.toArray(new String[0]);
            i--;    // 연산이 끝나고 i값 감소
            //Shape2[num-1] = "";
        }
    }
    @Override
    String draw() {
        for(int x = 0; x < i; x++) {    // 배열의 크기만큼 반복
            System.out.println(Shape2[x]);  // 배열의 내용을 출력한다.
        }
        return null;
    }
}
class Line extends Shape { // Shape 를 상속받은 자식 클래스 Line
    public String draw() { // 메소드 오버라이딩
        //System.out.println("Line");
        return "Line";
    }
}
class Rect extends Shape { // Shape 를 상속받은 자식 클래스 Rect
    public String draw() { // 메소드 오버라이딩
        //System.out.println("Rect");
        return "Rect";
    }
}
class Circle extends Shape { // Shape 를 상속받은 자식 클래스 Circle
    String draw() { // 메소드 오버라이딩
        //System.out.println("Circle");
        return "Circle";
    }
}

public class MethodOverridingEx {
    //static void paint( Shape p ) { // Shape 를 상속받은 객체들이 매개 변수로 넘어올 수 있음
        //p.draw(); // p가 가리키는 객체에 오버라이딩된 draw() 호출.
        // 동적바인딩

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Editor e = new Editor();

        boolean a = true;
        while(a) {  // while(true) 랑 같은 의미
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int select = s.nextInt();   // int 형식으로 값을 받아와 select 변수에 저장
            switch (select) {   // 받아온값이
                case 1 -> e.insert();   // 1일때 삽입 메소드
                case 2 -> e.delete();   // 2일때 삭제 메소드
                case 3 -> e.draw();     // 3일때 draw (모두출력하는) 메소드
                case 4 -> { // 4일때 프로그램을 종료하는 코드
                    System.out.println("프로그램을 종료합니다...");
                    a = false;
                }
                default -> System.out.println("잘못된 입력입니다.");
                // 입력값이 잘못될경우 예외처리
            }
        }
    }
}