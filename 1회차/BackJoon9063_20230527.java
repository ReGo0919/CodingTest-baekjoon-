import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon9063_20230527 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이 문제는 3009번의 문제의 정사각형의 좌표를 구하는 문제를 활용해서 풀 수 있다.
        즉 x의 최상점과 최하점, y의 최하점과 최상점을 뺀 값을 곱하면 되는 것이다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//      우선 사용자에게 테스트케이스 값 받고
        int[] xcord = new int[N];
        int[] ycord = new int[N];
//      그 값 만큼 x와 y배열을 각각 만들어준다.

        for (int i = 0 ; i < N ; i++){
//      그 다음 N값 만큼 반복을 해주고
            StringTokenizer st = new StringTokenizer(br.readLine());
//      사용자 입력값 br을 토큰으로 만들어준 후
            xcord[i] = Integer.parseInt(st.nextToken());
//      첫번째 값을 xcord의 i번째에
            ycord[i] = Integer.parseInt(st.nextToken());
//      두번째 값을 ycord의 i번째에 담아주는 작업을 마저 진행한다.

        }
//      이후 반복 저장 작업이 끝난 두 배열을 sort로 오름차순 시켜준 후
        Arrays.sort(xcord);
        Arrays.sort(ycord);

        int minX = xcord[0];
        int maxX = xcord[N-1];
        int minY = ycord[0];
        int maxY = ycord[N-1];
//      정렬 된 xcord와 ycord의 가장 앞의 값(작은 값들 / 0)을 각각 minX와 minY에 저장 해주고 최댓값도 마찬가지로 저장 해준다.

        System.out.println((maxX - minX)*(maxY - minY));
//      작업이 완료 됬으면 각각의 1차원 좌표들 간의 거리 차이를 계산 해주고 곲해주면 끝.
    }
}


