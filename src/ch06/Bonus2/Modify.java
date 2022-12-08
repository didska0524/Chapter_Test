package ch06.Bonus2;
import java.util.Scanner;
// 201804077최환규
// 보너스2번문제
public class Modify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">> ");
            String s = scanner.nextLine();      // 한 줄 읽기
            StringBuffer sb = new StringBuffer(s);       // StringBuffer 객체 생성
            if(s.equals("exit")){      // s에서 받아온 입력값이 "exit 이면 종료"
                System.out.println("종료합니다...");
                break;
            }
            int index = (int)(Math.random()*s.length());    // 변경할 문자 위치가 난수로 선택됨
            while(true){
                int i = (int)(Math.random()*26);    // 0부터 25까지의 26가지 랜덤난수
                char c = (char)('a'+i); // 아스키코드를 이용해 a부터 z 까지의 랜덤알파벳 c
                if(!sb.equals(c)){  // sb의 문자와 c가 다른 경우
                    sb.replace(index, index+1, Character.toString(c));
                    // index(시작값과 끝값) 위치의 문자를 지정된 c 로 바꾼다.
                    break;
                }
            }
            System.out.println(sb);
        } // end of while
        scanner.close();
    }
}
