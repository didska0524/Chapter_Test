package Ch05.ch05_OpenChallenge;
// 201804077 최환규
// 오픈챌린지문제

import java.util.Scanner;

public class Bear extends GameObject {  // GameObject 를 상속받는 클래스 Fish
    private Scanner scanner = null;

    public Bear(int x, int y, int distance) {   // Bear 의 생성자
        super(x, y, distance);   // 부모클래스의 생성자를 특정하는 super()이용
        scanner = new Scanner(System.in);
    }

    @Override
    public void move() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char c;
        c = scanner.next().charAt(0);   // String 으로 저장된 문자열 중에서 한 글자만 선택해서 Char 타입으로 변환

        switch (c) { //입력받은 c값이
            case 'a' -> { // a일때 left
                x--;
                if (x < 0) x = 0;   // 맵에서 이탈하는걸 방지
            }
            case 'f' -> { // f일때 right
                x++;
                if (x >= Game.MAX_X) x = Game.MAX_X - 1;   // 맵에서 이탈하는걸 방지
            }
            case 'd' -> { // d일때 up
                y--;
                if (y < 0) y = 0;   // 맵에서 이탈하는걸 방지
            }
            case 's' -> { // s일때 down
                y++;
                if (y >= Game.MAX_Y) y = Game.MAX_Y - 1;   // 맵에서 이탈하는걸 방지
            }
        }
    }

    @Override
    public char getShape() { // Bear 의 모양 리턴
        return 'B';
    }
}

