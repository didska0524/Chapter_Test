package Ch05.ch05_OpenChallenge;
// 201804077 최환규
// 오픈챌린지문제

public abstract class GameObject { // 추상 클래스
    protected int distance; // 한 번 이동 거리
    protected int x, y; // 현재 위치(화면 맵 상의 위치)

    public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정하는 부모 메소드
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() { return x; } // x 좌표값을 return 해주는 getX 메소드
    public int getY() { return y; } // y 좌표값을 return 해주는 getY 메소드
    public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY())    // fish 와 bear 의 좌표값이 완전히 일치하면
            return true;    // true 값을 반환한다.
        else
            return false;
    }

    protected abstract void move(); // 이동한 후의 새로운 위치로 x, y 변경
    protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}

