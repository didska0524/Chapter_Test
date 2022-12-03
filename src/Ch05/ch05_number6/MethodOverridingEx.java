package Ch05.ch05_number6;
import java.util.*;

//201804077최환규
//6번문제
abstract class Shape { // 도형의 슈퍼 클래스
    abstract String draw();
    //public abstract void delete();
}

class Editor extends Shape{
    Scanner scanner = new Scanner(System.in);
    static int i = 0;
    private String[] Shape2 = new String[10];


    public void insert() {
        System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                Line line = new Line();
                Shape2[i] = line.draw();
                i++;
            }
            case 2 -> {
                Rect rect = new Rect();
                Shape2[i] = rect.draw();
                i++;
            }
            case 3 -> {
                Circle circle = new Circle();
                Shape2[i] = circle.draw();
                i++;
            }
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
    public void delete(){
        System.out.println("삭제할 도형의 위치>>");
        int num = scanner.nextInt();
        if(i<num){
            System.out.println("삭제할 수 없습니다.");
        }
        else{
            List<String> strList = new ArrayList<>(Arrays.asList(Shape2));
            strList.remove(num-1);
            Shape2 = strList.toArray(new String[0]);
            i--;
            //Shape2[num-1] = "";
        }
    }
    @Override
    public String draw() {
        for(int x = 0; x < i; x++) {
            System.out.println(Shape2[x]);
        }
        return null;
    }
}
class Line extends Shape {
    public String draw() { // 메소드 오버라이딩
        //System.out.println("Line");
        return "Line";
    }
}
class Rect extends Shape {
    public String draw() { // 메소드 오버라이딩
        //System.out.println("Rect");
        return "Rect";
    }
}
class Circle extends Shape {
    String draw() { // 메소드 오버라이딩
        //System.out.println("Circle");
        return "Circle";
    }
}

public class MethodOverridingEx {
    //static void paint( Shape p ) { // Shape 를 상속받은 객체들이
// 매개 변수로 넘어올 수 있음
        //p.draw(); // p가 가리키는 객체에 오버라이딩된 draw() 호출.
// 동적바인딩

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Editor e = new Editor();

        boolean a = true;
        while(a) {
            System.out.println("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int select = s.nextInt();
            switch (select) {
                case 1 -> e.insert();
                case 2 -> e.delete();
                case 3 -> e.draw();
                case 4 -> {
                    System.out.println("프로그램을 종료합니다...");
                    a = false;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}