package ch07;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("input the name");
            String s = scanner.next();
            al.add(s);
            if(s.equals("exit")){
                break;
            }
            for(int i = 0; i<al.size(); i++){
                String name = al.get(i);
                System.out.println(name);
            }
            String longest = al.get(0);
            for(int i=0; i<al.size(); i++){
                String name = al.get(i);
                if(longest.length() < name.length())
                    longest = name;
            }
            System.out.println("가장 긴 이름은: "+longest);
        }
    }
}
