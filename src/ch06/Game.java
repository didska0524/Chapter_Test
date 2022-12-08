package ch06;
import java.util.*;
// 201804077최환규
// 6번문제
public class Game {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] select = {"","가위", "바위", "보"};

        System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)>>");

        while (true) {
            int n = (int) (Math.random() * 3 + 1); //정수 3개 랜덤리턴. 가위(1),바위(2),보(3) 순서
            int num = s.nextInt();
            if (num == 4) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            else if(num==1 || num==2 || num==3) {
                System.out.println("사용자 " + select[num] + " : 컴퓨터 " + select[n]);
                switch (num) {
                    case 1 -> {
                        if (n == 1) {
                            System.out.println("서로 비겼습니다.");
                        }
                        if (n == 2) {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        if (n == 3) {
                            System.out.println("사용자가 이겼습니다.");
                        }
                    }
                    case 2 -> {
                        if (n == 1) {
                            System.out.println("사용자가 이겼습니다.");
                        }
                        if (n == 2) {
                            System.out.println("서로 비겼습니다.");
                        }
                        if (n == 3) {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                    }
                    case 3 -> {
                        if (n == 1) {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        if (n == 2) {
                            System.out.println("사용자가 이겼습니다.");
                        }
                        if (n == 3) {
                            System.out.println("서로 비겼습니다.");
                        }
                    }
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
