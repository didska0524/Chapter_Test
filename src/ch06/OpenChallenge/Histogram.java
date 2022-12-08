package ch06.OpenChallenge;

import java.util.*;
// 201804077최환규
// OpenChallenge

// token 이용해서도 풀수있지않을까..?
public class Histogram {
    public static String readString(){
        StringBuffer sb = new StringBuffer();       // 키 입력을 받기위한 스트링버퍼 생성
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();       // 텍스트 한 라인을 읽기
            if(line.equals(";"))                    // ';'만 있는 라인이면
                break;                              // 입력 끝
            sb.append(line);                        // 읽은 라인 문자열을 스트링버퍼에 추가한다.
        }
        return sb.toString();                       // 스트링버퍼의 문자열을 스트링으로 리턴
    }
    public static void main(String[] args) {
        System.out.println("히스토그램을 그립니다.");

        String st = readString().toLowerCase();
        // 레퍼런스변수 st에 readString() 메소드 반환값대입
        // 소문자로 변경한 스트링 리턴
        //int index=0;
        int[] StrList = new int[26];
        for(int i=0; i<st.length(); i++) {  // st 의 길이만큼
            if(st.charAt(i)>='a' && st.charAt(i)<='z'){     // st의 요소들이 알파벳이라면
                StrList[Character.getNumericValue(st.charAt(i))-10]++;
                // char 의 문자데이터를 진짜 숫자로 변환하는 메소드
                // 10진수라 a는 10값부터 시작해 상수10을 빼준다.

                // StrList[st.charAt(i)-'a']++;
                // 두번째 방법이다.
                // String 은 char 로 쪼갤수있고, char 은 아스키코드로 변환가능하다.
                // char 형태의 'a' 에서 'a' 를 빼는셈이기때문에 순차적으로 0부터 25까지 증가된다.
            }
        }
        for(int i=0; i<26; i++){
            System.out.print((char)(i+'A')+"\t(" + StrList[i] + ")\t");
            // char 형태의 i(초기값은 0)에서 'A' 값을 더하기때문에 아스키코드에 의거해서
            // A부터 26가지의 알파벳인 Z까지 순차적으로 출력된다.
            for (int j=0; j<StrList[i];j++){
                System.out.print('-');
            }
            System.out.println();
        }
    }
}
