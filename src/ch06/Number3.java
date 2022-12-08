package ch06;
//import java.util.*;
// 201804077최환규
// 3번문제
// 똑같은 코드를 String 방식과 int 형 방식(주석처리함) 모두 구현이 되게 하였다.
public class Number3 {
    public static void main(String[] args) {

        String[] a = new String[3]; //배열선언
        while(true) {
            for (int i=0; i<a.length; i++){ // a 배열의 길이만큼 반복
                System.out.print(a[i]=((int)(Math.random()*3 + 1))+"\t");
                // String 형식으로 제공되기 때문에 한 문장 안에서 배열에 값 대입과 출력이 동시에 가능
            }
            System.out.println();   // 줄바꿈
                if(a[0].equals(a[1]) && a[1].equals(a[2])){
                    // String 형식은 .equals 를 사용하여 값 비교연산
                    System.out.println("성공");
                break;  // 세개의 값이 전부 동일할시 종료
            }
        }

        /*int[] n = new int[3];
        while(true) {
            for (int i=0; i<n.length; i++){
                n[i] = (int)(Math.random()*3 + 1);
                System.out.print(n[i] + "\t");
                //System.out.print(n[i] = (int)(Math.random()*3 + 1) + "\t");
                // int 형은 이런식의 사용이 불가능하다.
            }
            System.out.println();
            if(n[0]==n[1] && n[1]==n[2]){
                System.out.println("성공");
                break;
            }
        }*/
    }
}
