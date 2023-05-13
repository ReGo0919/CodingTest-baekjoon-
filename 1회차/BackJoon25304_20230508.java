import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class BackJoon25304_20230508 {

        public static void main(String[] args) throws IOException, java.io.IOException {
        /*
         변수는 총 4개, 총 금액(X), 물건의 종류 수(N), 물건의 가격(a)과 개수(b)
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      Buffer 생성
        long X = Long.parseLong(br.readLine());
        int N = Integer.parseInt(br.readLine());
//      총 금액과 종류수 선언. 총 금액은 값이 좀 커서 int의 다음 크기를 가진 long을 선언
        for (int i = 0  ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
//      for문을 돌리고 토큰st를 생성 후 사용자에게 입력을 받아 각각 a와 b에게 배분 해주고
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            X = X - (a*b);
/*      예제의 예시에서 각 토탈 값에 물건의 가격과 갯수를 더한 값을 뺴주면서 그 가격이 딱 들어맞는지를 비교하는데
        위와 같은 식으로 X를 초기화 해주든, 아니면 a와 b를 곱해서 더한 값들을 저장하는 변수를 하나 만들어서
        X와 비교를 하는 식을 써주든 상관 없다.
*/


        }
        if (X == 0){
            System.out.println("YES");
        }else{
                System.out.println("NO");
        }

    }
}