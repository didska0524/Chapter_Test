package ch06.Bonus3;

import java.util.Scanner;

public class StringRotateOnEnter {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();   // '\n' 액션이 이루어지기 전까지 한줄 받아오기.

        System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");

        while(true){
            String key = scanner.nextLine();
            if(key.equals("")){     // Enter 키 외에 다른 입력된 키가 없는 경우
                String first = text.substring(0,1); // 첫번째 문자값을 first
                String last = text.substring(1);    // 나머지 문자열을 last
                text =  last.concat(first); // 나머지 문자열 뒤에 첫 번째 문자를 연결한다.
                System.out.print(text+">>");    // 완성된 문자열 출력
            } else if (key.equals("q")) {   // 만약 q를 입력하면
                break;  // 회전을 종료한다.
            } else {
                System.out.print(text+">>");    // 그 외엔 현재 문자열을 출력한다.
            }
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
