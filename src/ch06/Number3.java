package ch06;
import java.util.*;
public class Number3 {
    public static void main(String[] args) {
        Random random = new Random(System.nanoTime());
        //random.setSeed(System.currentTimeMillis());

        while(true) {
            int a = random.nextInt(3)+1;
            int b = random.nextInt(3)+1;
            int c = random.nextInt(3)+1;
            System.out.println(a + "\t" + b + "\t" + c);

            if(a==b){
                if(b==c) {
                    System.out.println("성공");
                    break;
                }
            }
        }
        //System.out.println(b);
        //System.out.println(c);
    }
}
