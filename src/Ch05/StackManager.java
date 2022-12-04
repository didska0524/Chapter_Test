package Ch05;//import org.w3c.dom.ls.LSInput;
//201804077최환규
//5번문제

import java.util.*;
interface StackInterface{   // 클래스가 구현해야 할 메소드들이 선언되는 인터페이스
    int length();   //스택에 들어 있는 문자열 개수 리턴
    String pop();   //스택의 톱에 있는 문자열 팝
    boolean push(String ob);    //스택의 톱에 문자열 ob 푸시 삽입
}
class StringStack implements StackInterface {   // 인터페이스의 메소드를 구현한 클래스

    String[] Stack; // String 형태의 변수 Stack
    int index=0;    // 배열의 위치를 가르켜줄 index
    StringStack(int a)
    {
        Stack = new String[a];  // String[] 형태의 변수 Stack 의 인덱스값을 매개변수 a 값을 받기
    }
    @Override
    public int length()
    {
        return index;   // 배열의 크기(갯수) return
    }

    @Override
    public String pop() {
        if(index==0)
            return null;    // 크기가 0이면 null 리턴
        index--;            // index 값을 사용 이후 감소연산
        return Stack[index];  // pop 메소드 호출시 Stack 의 index 위치에 있는 값 return
    }

    @Override
    public boolean push(String ob) {
        if(index==Stack.length) // 만약 index 값이 배열보다 클경우 false
            return false;

        Stack[index++] = ob;    // index 위치에 입력받은 문자열을 저장한 이후 증가연산
        return true;
    }
}

public class StackManager {
    public static void main(String[] args) {
        StringStack s = new StringStack(20);    // 20의 int 값을 StringStack 의 생성자 매개변수 a에 담는다
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        for(int i=0; i<5; i++){
            String text = scanner.next();   // 문자열 5개 순차적으로 받아오기
            s.push(text);                   // 받아온걸 StringStack 의 레퍼런스변수 s에 전달
        }

        int b = s.length();     //b로 for 문을 돌릴때와 s.length()로 for 문을 돌릴때 차이 구별 필요.
                                // 둘다 5값으로 돌리지만 미리 5값을 변수에 담아두지않으면 pop 연산에 의해 감소한 값으로 변한다.
//        System.out.println(s.length());
//        System.out.println(b);
        for(int i=0; i<b; i++){
            System.out.print(s.pop()+" ");
            //System.out.print(s.length()); //위 주석의 내용을 검증하기 위한 코드를 주석처리함
        }

        scanner.close();
    }
}
