package Ch05.ch05_OpenChallenge;
// 201804077 최환규
// 오픈챌린지문제

public class Game {
    public static final int MAX_X = 20; // 맵의 가로 크기를 나타내는 상수
    public static final int MAX_Y = 10; // 맵의 세로 크기를 나타내는 상수
    private char map [][] = new char [MAX_Y][MAX_X];    // 맵 크기를 20 , 10 으로 지정한다.
    private GameObject [] m = new GameObject[2];
    //private int state; // 0: 게임 중, 1: Monster가 winner, 2:Human이 winner

    public Game() {
        for(int i=0; i<MAX_Y; i++)
            for(int j=0; j<MAX_X; j++)
                map[i][j] = '-';        // 2중 for 문을 이용하여 맵을 '-'로 구성한다.
        m[0] = new Bear(0, 0, 1);   // 배열의 0번인덱스에 객체 Bear 입력
        m[1] = new Fish(5, 5, 2);   // 배열의 1번인덱스에 객체 Fish 입력
        //state = 0; // 게임 중
    }

    public void run() {
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");

        update(); // 초기 좌표에 따른 맵 설정
        draw(); // 초기 게임 맵을 보여줌

        while(!doesEnd()) {     // 곰이 물고기를 먹지 않았으면
            clear();            // 현재의 맵 지움
            for(int i=0; i<m.length; i++)
                m[i].move();    // 곰과 물고기의 좌표값 변경
            update(); // 움직인 후 좌표 변경에 따른 맵 갱신
            draw(); // 맵 그리기
        }
        System.out.println("Bear Wins!!");  // 먹었을경우 Bear Wins 출력하게함.
    }

    private void update() {
        for(int i=m.length-1; i>=0; i--) // Fish 부터 먼저 그려서 Fish 를 먹는 경우 Fish 가 보이지 않기
            map[m[i].getY()][m[i].getX()] = m[i].getShape();    // 맵에 입력된 좌표값에 Fish (@)를 그린다.
    }

    private void clear() {  // 맵 초기화하는 메소드 clear()
        for(int i=0; i<m.length; i++)
            map[m[i].getY()][m[i].getX()] = '-';
    }

    private void draw() {
        System.out.println();
        for(int i=0; i<MAX_Y; i++) {
            for(int j=0; j<MAX_X; j++)
                System.out.print(map[i][j]);    // 맵 그리기 (-)
            System.out.println();
        }
    }

    private boolean doesEnd() {
        if(m[0].collide(m[1])) {    // Bear ate Fish 만약 곰이 물고기를 먹으면
            return true;    // true 값을 반환하고
        }
        return false;   // 그 외엔 false 값을 반환한다.
    }

    public static void main(String[] args) {
        Game game = new Game(); // Game 객체 생성
        game.run();             // run 메소드 실행
    }

}

