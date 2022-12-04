package Ch05.ch05_OpenChallenge;
// 201804077 최환규
// 오픈챌린지문제

public class Fish extends GameObject {  // GameObject 를 상속받는 클래스 Fish
    public Fish(int x, int y, int distance) {     // Fish 의 생성자
        super(x, y, distance);  // 부모클래스의 생성자를 특정하는 super()이용
    }

    @Override
    public void move() { // 한 번 움직이는 과정 전개
        int n = (int)(Math.random()*5); // 0,1,2,3,4 중에서 0인 경우 + 방향, 1인 경우 - 방향, 나머지 정지
        if(n==0) x += distance; // 0인경우 2만큼 +연산
        else if(n==1) x -= distance;    // 1인경우 2만큼 -연산

        if(x < 0) x=0;  // 정해진 맵에서 이탈하는걸 방지(좌표값 마이너스 방지)
        if(x >= Game.MAX_X) x = Game.MAX_X - 1; // 정해진 맵에서 이탈하는걸 방지(좌표값 초과 방지)

        n = (int)(Math.random()*5);
        if(n==0) y += distance; // y 좌표도 위와 동일하다.
        else if(n==1) y -= distance;

        if(y < 0) y=0;
        if(y >= Game.MAX_Y) y= Game.MAX_Y - 1;
    }

    @Override
    public char getShape() { // Fish 의 모양 리턴
        return '@';
    }
}

