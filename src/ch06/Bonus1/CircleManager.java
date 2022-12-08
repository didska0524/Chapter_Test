package ch06.Bonus1;

//201804077최환규
//보너스1번문제

class Circle{
    private int x,y,radius;
    public Circle(int x,int y,int radius){  //생성자
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString(){   // toString 재정의. 재정의 이후엔 재정의된 메소드가 호출된다.
        return "("+x+","+y+")반지름 "+radius;
    }
    public boolean equals(Object obj){    // equals 재정의
        Circle c = (Circle)obj; // obj 오브젝트를 다운캐스팅
        if (3.14 * radius * radius == 3.14 * c.radius * c.radius) return true;
        // 만약 원의 면적이 같다면? true
        else return false;
    }
}
public class CircleManager {
    public static void main(String[] args) {
        Circle a = new Circle(1,2,10);  // Circle 객체 a
        Circle b = new Circle(5,6,10);  // Circle 객체 b

        System.out.println("원 1: "+a);      // 재정의된 toString 으로 원의 정보가 출력된다
        System.out.println("원 2: "+b);
        
        if(a.equals(b)) System.out.println("같은 원입니다."); //재정의된 equals 함수로 조건이 비교된다.
        else System.out.println("다른 원입니다.");
    }
}
