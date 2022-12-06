package ch06;
import java.util.*;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String query = scanner.nextLine();

            if (query.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(query, " ");
            int n = st.countTokens();
            System.out.println("어절 개수는 " + n);
        }
    }
}
