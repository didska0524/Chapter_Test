package Ch05;

//201804077최환규
//4번문제
class Point {   //부모클래스
    private int x, y;
    public Point(int x, int y){ // Point 의 생성자
        this.x = x;     // 현재 객체를 가리키는 레퍼런스 this
        this.y = y;
    }
    public int getX(){
        return x;
    }   // x를 리턴하는 메소드
    public int getY(){
        return y;
    }   // y를 리턴하는 메소드
    protected void move(int x, int y){  // x와 y를 재설정하는 메소드 move
        this.x = x;
        this.y = y;
    }
}

public class ColorPoint extends Point{  // Point 를 상속받는 ColorPoint 클래스
    private String Color;   // 변수 Color 추가

    public ColorPoint(int x, int y, String Color) { // ColorPoint 의 생성자
        super(x, y);    // 부모 객체의 생성자를 지정하여 호출
        this.Color = Color;     // 현재 객체를 가리키는 레퍼런스 this
    }
    public void setPoint(int x, int y) // 부모의 메소드를 통해 x,y값 재정의
    {
        super.move(x,y);        // super 를 이용해 부모의 메소드라는것을 알려줌
    }
    public void setColor(String Color) {    // Color 변수정의
        this.Color=Color;
    }
    public void show()  // 화면 출력 메소드 show()
    {
        System.out.println(Color+"색으로"+"("+getX()+","+getY()+")");
    }
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");   // ColorPoint 객체 생성, 생성자 호출
        cp.setPoint(10,20);
        cp.setColor("GREEN");
        cp.show();
    }
}
