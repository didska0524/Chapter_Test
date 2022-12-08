package ch06;
import java.util.*;
// 201804077최환규
// 2번문제

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String query = scanner.nextLine();  // 라인단위로 값을 받아 query 에 대입

            if (query.equals("exit")){          // "exit"가 입력될경우
                System.out.println("종료합니다...");
                break;                          // 프로그램 종료
            }
            StringTokenizer st = new StringTokenizer(query, " ");
            // 공백을 구분 문자로 하여 으로 토큰 생성
            int n = st.countTokens();   // 토큰의 개수 정수형 변수 n에 대입
            System.out.println("어절 개수는 " + n);  // 토큰의 개수 출력
        }
    }
}
