import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon2562_20230512 {

    public static void main(String[] args) throws IOException, IOException {
    /* 이 문제는 서로 다른 아홉개의 자연수가 제시 되었을때 그 수들 중 가장 큰 값과 몇번째 자리수인지를 구하는 문제이다.
    이를 해결하기 위해선 일단 자연수 N, 사용자의 입력수를 담을 int 형 배열 하나, 그 배열 중 가장 큰 값 max와
    그 max의 index 번호를 담을 position 총 내게의 변수가 필요하다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 9;
//      배열의 길이 설정
        int[] array = new int[N];
//      배열의 길이를 생성한 array 배열에 지정.
        int max = 0;
//      최댓값 max 선언
        int position = 0;
//      max의 자릿값을 담을 int형 position 선언
        for (int i = 0; i < N; i++) {
//           배열의 길이 만큼 for문을 실행해서
            array[i] = Integer.parseInt(br.readLine());
//          그 길이 만큼 사용자에게 하나씩 i번째에 입력을 받을 때
            if (array[i] > max){
//              만약 array의 i번째의 값이 max(첫번째에선 0) 보다 큰 경우
                max = array[i];
//              max에 해당 array의 값을 저장 후
                position = i+1;
//              position에 i+1을 누적 (i는 0부터 시작 되므로 i<N은 n-1이 된다. 그래서 +1을 해줘야 정상적인 자릿수 획득이 가능하다.)
            }

        }
        System.out.printf("%d%n%d", max, position);
//      for문이 끝난 후 형식 문자열을 활용해 max와 position의 값을 출력.
    }
}


//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.
