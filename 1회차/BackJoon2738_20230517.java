import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BackJoon2738_20230517 {

        public static void main(String[] args) throws IOException {
        /* 이번 문제는 꽤 고전을 해서 블로그 글을 참고 했는데 다른 블로그에는 첫번째 3X3의 값과 두번째 3X3의 값을
        담을 각각의 배열을 생성 후 이중 for문을 이용해 이들을 각각의 첫번째 사용자의 3X3 입력값을 첫번째 배열에,
        두번째 사용자의 3X3 입력값을 두번째 배열에 저장 후 각각 이 배열들
        별개의 또다른 배열에 더하는 방식(Arrayresult[i] = Array1[i] + Array2[i]) 으로 처리하는 글도 있었으나
        문제 자체가 이중배열을 연습으로 요하는 문제라 다음 코드를 작성 해주었다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner (System.in);
//      일단 여기까지는 버퍼 br값을 토큰 st에 담고, 또 int를 전용으로 입력 받기 위한 Scanner 클래스를 호출한다.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
//      토큰의 첫번째와 두번째 값을 A와 B에 받고
        int[][] Array = new int[A][B];
//      Array의 행 A, 열 B값을 길이로 지정해준다.

        for (int i = 0; i < 2; i++) {
/*      for문이 총 두 번 도는 이유는 사용자가 3x3의 행렬을 입력하는 횟수가 총 2번이기 때문이다
        즉 3X3짜리 표가 2개 있다고 생각을 하면 되며 i(0)은 첫번째 표의 행과 열을 전부 입력,
        i(1)은 두번째 표의 행과 열을 전부 입력하는 개념으로 이해를 하면 된다.
        대신 여기서는 누적값(각 j와 k 값을 누적 저장) 할거라서 사용자가 1번 작업, 2번 작업을 끝내는 개념이라고 생각하면 된다.*/
			for (int j = 0; j < A; j++) {
//          그 이후의 for문은 j를 0, 그러니까 1행부터 그 안의 for문(k)의 값들을 열에 차곡차곡 담는 작업을 수행한다.
				for (int k = 0; k < B; k++) {
					Array[j][k] += sc.nextInt();
				}
			}
            /* 만약 j의 for문 작업이 다 끝나게 되면 i를 1로 증가 후 다시 j와 k for문을 수행한다.
            이럴 경우 j는 다시 0(1행) 부터 시작해서 i가 0이었을때와 마찬가지로 1행의 k의 for문이 실행되는동안
            차곡차곡 k의 값들을 누적시켜주고 다시 j를 1(2행)로 증가시킨 후 또 k의 for문을 실행하며
            차곡차곡 누적 증가시키는 효과를 주게 된다.
            */
		}
        for (int i = 0; i < A; i++) {
                for (int j = 0; j < B; j++) {
                        System.out.print(Array[i][j] + " ");
                }
                System.out.println();
        }
//      누적 작업이 마쳤으면 마찬가지로 이중 for문으로 i의 0,1,2(1부터 3행) 의 k의 0,1,2(1부터 3열) 값을 출력해준다.

            }
        }

