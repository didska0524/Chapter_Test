package ch06;
import java.util.*;
// 201804077최환규
// 6번문제
public class Game {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] select = {"","가위", "바위", "보"}; // 가위바위보 중 선택된게 출력됨. 1부터 선택하기때문에 0값은 비워둠

        while (true) {
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
            int com = (int) (Math.random() * 3 + 1); //정수 3개 랜덤리턴. 가위(1),바위(2),보(3) 순서
            int player = s.nextInt();   // 플레이어의 선택을 입력받음
            if (player == 4) {      //끝내기 선택시 게임 종료
                System.out.println("게임을 종료합니다...");
                break;
            }
            else if(player==1 || player==2 || player==3) {  // 정상적인 입력이 이루어지는지 감지
                System.out.println("사용자 " + select[player] + " : 컴퓨터 " + select[com]);
                //각각 무엇을 선택했는지 보여준다.
                switch (player) {
                    case 1 -> { //플레이어가 가위일때
                        if (com == 1) { //컴퓨터가 가위면
                            System.out.println("서로 비겼습니다.");
                        }
                        if (com == 2) { //컴퓨터가 바위면
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        if (com == 3) { //컴퓨터가 보면
                            System.out.println("사용자가 이겼습니다.");
                        }
                    }
                    case 2 -> { //플레이어가 바위일때
                        if (com == 1) { //컴퓨터가 가위면
                            System.out.println("사용자가 이겼습니다.");
                        }
                        if (com == 2) { //컴퓨터가 바위면
                            System.out.println("서로 비겼습니다.");
                        }
                        if (com == 3) { //컴퓨터가 보면
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                    }
                    case 3 -> { //플레이어가 보일때
                        if (com == 1) { //컴퓨터가 가위면
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        if (com == 2) { //컴퓨터가 바위면
                            System.out.println("사용자가 이겼습니다.");
                        }
                        if (com == 3) { //컴퓨터가 보면
                            System.out.println("서로 비겼습니다.");
                        }
                    }
                }
            }
            else{       // 비정상적인 입력시 오류를 방지하기위한 코드
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
