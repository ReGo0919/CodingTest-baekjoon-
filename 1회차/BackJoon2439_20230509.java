import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2439_20230509 {

        public static void main(String[] args) throws IOException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
//          for 문을 이용해 역삼각형으로 별찍기 (사용자 입력값을 5라고 가정.)
            for (int i = 1; i <= n; i++) {
//               메인 for문 시작
                for (int j = 1; j <= n-i; j++) {
                   System.out.print(" ");
                }
//              첫번째 for문은 공백을 출력하는 for문, 위의 범위 (n-i / 5-1 = 4)만큼 공백을 출력.
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
//              두번째 for문, 첫번째 i번째 줄에서 공백이 네개 찍히고 바로 내려와서 별은 같은 줄에 한번 찍혀야 하기에 i와 같은 값으로 설정
                }System.out.println("");
//              줄을 안바꾸면 고대로 1줄에 다 표시되므로 줄바꿈 실행.
            }
        }
}