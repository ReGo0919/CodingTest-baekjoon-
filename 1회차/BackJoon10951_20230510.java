import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon10951_20230510 {

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/* 이 문제는 테스트케이스의 변수가 없으므로 각각의 A와 B 변수를 입력 받을 때마다 A+B 값을 출력하면 되는데
   단 0과 0을 합할 경우 결과값을 출력 하지 않고 바로 종료를 시켜야 하므로 0과 0의 을 더한 값이 들어올 때까지
   반복문을 도는  while문을 사용 해야한다. foreach의 경우는 이미 배열의 값을 가진 n을 차례대로 꺼내야 하고
   for은 지정 레인지를 정해주어야 하는데 이번에는 테스트케이스(범위)가 입력되지 않았기 때문에 while문을 사용한다.
 */

        while (true) {
//              for문을 사용자 입력값 만큼 돌 동안
            StringTokenizer Line = new StringTokenizer(br.readLine(), " ");
//              토큰 생성 후 각각의 숫자를 A와 B에 저장
            int A = Integer.parseInt(Line.nextToken());
            int B = Integer.parseInt(Line.nextToken());
            System.out.println(A+B);
//          시스템의 인자값을받아 그 덧셈값을 출력하면 된다.

        }
    }
}


//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.
