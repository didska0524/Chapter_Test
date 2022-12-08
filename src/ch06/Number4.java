package ch06;

import java.util.*;
// 201804077최환규
// 4번문제

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();  // 줄바꿈전까지 입력된 문장 받기
        int sum = 0;
        StringTokenizer st = new StringTokenizer(a, "+");
        // String 으로 스트링 토크나이저 생성 구분 문자는 '+'로 지정

        while(st.hasMoreTokens()){
            String token = st.nextToken();  // 다음 토큰을 리턴
            String s = token.trim();        // String 앞뒤의 공백제거
            int i = Integer.parseInt(s);    // String s를 10진 정수로 변환한 값 리턴
            sum += i;   // i값 sum 에 계속 합산
        }
        System.out.println("합은 "+sum);
    }
}
