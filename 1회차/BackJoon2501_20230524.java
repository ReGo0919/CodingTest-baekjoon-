import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon2501_20230524 {

    public static void main(String[] args) throws IOException, IOException {
    /* 문제는 의외로 쉽다. 근데 기본적인 배열을 이용하면 수가 좀 복잡해져서 편하게 가변 길이로 저장 가능한 ArrayList를 사용했다.
     */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
//      버퍼 생성 후 st로 사용자 입력값을 토큰으로 받아 각각 N과 K 변수에 저장
        ArrayList<Integer> result = new ArrayList<>();
//      Integer 형의 ArrayList 변수 result 생성하고

        for(int i = 1 ; i <= N ; i++){
//      N만큼 for문이 실행 하는데 i가 1인 이유는 N의 값을 1부터 나누어서 그 약수를 구해야 하기 때문이다.)
            if (N%i == 0) result.add(i);
//      N을 i로 나눈 몫이 0이면 result에 그 i를 차곡차곡 저장한다.
        }
        if (result.size() < K){
//      윗쪽 for문 종료 후 result의 size가 k보다 작을 경우
            System.out.println(0);
//      0을 출력하고
        }else{
//      같거나 크다면
            System.out.println(result.get(K-1));
//          result에 k-1번째 인덱스 값을 가져와준다(get) k-1인 이유는 result의 인덱스는 0부터 시작하기 때문!
        }
    }
}



