import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BackJoon2566_20230517 {

        public static void main(String[] args) throws IOException {
            /* 해당 문제는 2차원 배열을 생성 후 최대값을 찾은 후 그 위치(행과 열)를 표시하는 코드이다.
            그러므로 우선 2차원 배열 하나, 최대값 하나, x와 y(행과 열)을 표시할 변수 하나씩을 만들어 주면 된다.
            */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            /* 여기서 Buffer와 StringTokenizer를 사용하려 했으나 NoSuchElementException (변수 없음) 에러가 떠서
            그냥 스캐너를 이용했다.*/
            Scanner sc = new Scanner(System.in);
            int Arrays[][] = new int[9][9];
//          스캐너 생성 후 Arryas 배열에 9X9 만큼의 배열 생성
            int max = 0;
//          최대값을 담을 max 생성
            int x = 0, y = 0;
//          x좌표와 y좌표값 생성
            for (int i = 0; i < 9; i++)
            {
//          열 반복 시작

                for (int j = 0; j < 9; j++)
                {
//                  행 반복 시작
                    Arrays[i][j] = sc.nextInt();
//                    i열 j행에 사용자로부터 값을 입력 받은 후
                    if (max < Arrays[i][j])
//                  해당 열이 max보다 클시
                    {
                        max = Arrays[i][j];
//                      max에 그 값을저장 후
                        x = i;
                        y = j;
//                      각각 x에는 i(행), y에는 j(열) 값을 저장 해준다.
                    }
                }
            }
            System.out.println(max);
//          for 문이 끝나면 max값 출력
            System.out.println((x + 1) + " " + (y + 1));
            /*마찬가지로 x와 y의 좌표값을 생성 해주는데 x와 y에는 인덱스의 위치값이 나타나 있으므로 +1을 해주거나
            아니면 처음부터 배열 길이를 10으로 설정 후 i와 j를 1부터 10까지 실행 시켜주고 결과값으로  x와 y를 그냥
            출력 시켜줄수도 있다.*/

        }

}