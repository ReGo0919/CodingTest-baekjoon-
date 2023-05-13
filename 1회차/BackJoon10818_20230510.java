import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BackJoon10818_20230510 {

    public static void main(String[] args) throws IOException, IOException {
    /* 이 문제는 배열의 값 중에 최솟값과 최대값을 찾는 문제인데
    사용작 입력값을 길이N과 해당 배열, 최솟값과 최대값의 변수를 지정 해주고
    for문을 돌리고 if문을 활용해 찾는 배열의 i번째(두번째 배열의 수) 값이 0번째(첫번째 배열의 수)의 값 보다 작을 경우
    그 값을 min변수에 저장 해주고, 또 다음 else if에서 다시 i번째의 값이 0번째 보다 클 경우 max변수에 저장 해주는 코드를 작성하면
    구해낼 수도 있으나, 자바 라이브러리 중에 Arrays 함수가 있으니 그것을 활용 하기로 했다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
//      사용자가 입력한 N의 값을 배열 array의 길이로 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
//      토큰 입력 선언
//      사용자가 입력할 테스트 케이스 수량
        for (int i = 0; i < N ; i++){
            array[i] = Integer.parseInt(st.nextToken());
//          for문이 도는 동안 토큰의 값들을 array에 차례대로 저장
        }
        Arrays.sort(array);
//      Arrays의 인터페이스의 sort 매서드를 활용해 array를 오름차순 해줌. 참고로 내림차순을 할려면
//      (array, Comparator.reverseOrder())), 즉 Comparator 인터페이스의 reverseOrder() 함수를 추가해야함
        int min = array[0];
        int max = array[array.length -1];
        System.out.print(min + " " + max);
    }
}


//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.
