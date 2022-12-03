package Ch05;

//201804077최환규
//1번문제
class Circle{
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    } // Circle 클래스의 생성자
    public int getRadius(){
        return radius;
    }   // radius 를 반환하는 메소드
}
class NamedCircle extends Circle {      // Circle 클래스를 상속받은 NamedCircle 클래스
    String name;        //name 필드

    public NamedCircle(int radius,String name){
        super(radius);  //부모 클래스의 생성자를 특정하는 super 이용
        this.name = name;   // 현재 객체를 가리키는 레퍼런스 this
    }
    void show(){
        System.out.println(name+", 반지름 = "+getRadius());
    }   //show메소드
    // 객체의 radius 와 name 을 출력하는 메소드
    public static void main(String[] args){
        NamedCircle w = new NamedCircle(5,"Waffle");
        // 객체의 생성과 동시에 생성자를 이용해서 값을 넣어준다.
        w.show();
        // NameCircle 클래스의 show() 메소드 호출
    }
}