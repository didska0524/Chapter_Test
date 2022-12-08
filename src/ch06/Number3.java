package ch06;
//import java.util.*;
// 201804077최환규
// 3번문제
public class Number3 {
    public static void main(String[] args) {
        //  Random random = new Random(System.nanoTime());
        //  random.setSeed(System.currentTimeMillis());

        int[] n = new int[3];
        while(true) {
            for (int i=0; i<n.length; i++){
                n[i] = (int)(Math.random()*3 + 1);
                System.out.print(n[i] + "\t");
            }
            System.out.println();
            if(n[0]==n[1] && n[1]==n[2]){
                System.out.println("성공");
                break;
            }
        }

        /*while(true) {
            int a = (int)(Math.random()*3 + 1);
            int b = (int)(Math.random()*3 + 1);
            int c = (int)(Math.random()*3 + 1);
            System.out.println(a + "\t" + b + "\t" + c);

            if(a==b && b==c){
                System.out.println("성공");
                break;
            }
        }*/
    }
}
