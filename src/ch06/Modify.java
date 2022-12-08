package ch06;
import java.util.Scanner;
public class Modify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">>");
            String s = scanner.nextLine();      // 한 줄 읽기
            StringBuffer sb = new StringBuffer();       // StringBuffer 객체 생성
            if(sb.equals("exit")){      // sb의 문자열이 "exit 이면 종료"
                System.out.println("종료합니다...");
                break;
            }
            int index = (int)(Math.random()*s.length());    //변경할 문자 위치 선택
            while(true){
                int i = (int)(Math.random()*26);
                char c = (char)('a'+i);
                if(!sb.equals(c)){  // sb의 문자와 c가 다른 경우
                    sb.replace();
                    break;
                }
            }
            System.out.println(sb);
        } // end of while
        scanner.close();
    }
}
