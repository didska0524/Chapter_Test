package Ch05;//import org.w3c.dom.ls.LSInput;
//201804077최환규
//5번문제

import java.util.*;
interface StackInterface{
    int length();   //스택에 들어 있는 문자열 개수 래턴
    String pop();   //스택의 톱에 있는 문자열 팝
    boolean push(String ob);    //스택의 톱에 문자열 ob 푸시 삽입
}
class StringStack implements StackInterface {

    String[] Stack;
    int index=0;
    StringStack(int a){
        Stack = new String[a];
    }
    @Override
    public int length() {
        return index;
    }

    @Override
    public String pop() {
        if(index==0)
            return null;
        index--;
        return Stack[index];
    }

    @Override
    public boolean push(String ob) {
        if(index==Stack.length)
            return false;

        Stack[index++] = ob;
        return true;
    }
}

public class StackManager {
    public static void main(String[] args) {
        StringStack s = new StringStack(20);
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        for(int i=0; i<5; i++){
            String text = scanner.next();
            s.push(text);
        }

        int b = s.length();     //b로 for문을 돌릴때와 s.length()로 for문을 돌릴때 차이 구별 필요.
//        System.out.println(s.length());
//        System.out.println(b);
        for(int i=0; i<b; i++){
            System.out.print(s.pop()+" ");

            //System.out.println(s.length());
        }

        scanner.close();
    }
}
