import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon1085_20230526 {

    public static void main(String[] args) throws IOException, IOException {
        /* 일단 2차원 좌표의 개념, x와 y의 개념을 먼저 알아야 풀 수 있는 문제다. 27323 문제는 그를 위한 첫번째 문제였고
        이번에는 해당 x,y의 점에서 사각형의 어느 경계면을 가야 최소의 거리로 도달 할 수 있는지, 즉 사분면 중
        가장 짧은 거리를 구해내면 되는 문제이다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//      일단 사용자로부터 값 네 개를 입력 받고
        int x0 = 0;
        int y0 = 0;
//      2차원의 원점 좌표 (0,0)을 각각 x0와 y0에 할당해 준 후
        int[] gap = new int[4];
//      x와 y부터 각 경계면의 거리들을 저장 시켜줄 배열 gap을 4의 길이(사분면 이기 때문에 거리 결과도 4개가 출력.)로 선언

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
//      사용자 토큰 값들을 각각 x,y,w,h에 저장

        gap[0] = Math.abs(x-x0);
        gap[1] = Math.abs(x-w);
        gap[2] = Math.abs(y-y0);
        gap[3] = Math.abs(y-h);
/*      일단 가장 적은 최소의 거리를 구하는 것이기에 x와 y를 중심으로
        x에서 xO(원점) 으로 가는 거리 하나, 다시 x에서 w(w와 h는 오른쪽 위 모서리, 즉 x와 y의 최고 지점이기 때문)
        으로의 거리 하나, 다시 y에서 yO(원점) 으로 가는 거리 하나, 다시 y에서 h로 가는 거리 하나
        이렇게 총 네 개의 거리를 구해 각각 gap의 처음 인덱스부터 담아준다.
        또 abs 함수를 사용해준 이유는 결과 값이 음수일 때 그 음수가 sort를 할때 가장 앞쪽에 오는
        불상사를 막기 위해 모든 값을 거리값으로 받도록 abs(절대값)으로 변경 해주는 것이다.*/

        Arrays.sort(gap);
//      저장이 다 된 배열 gap을 sort로 오름차순.

        System.out.println(gap[0]);
//      그 후 gap의 0번째 인덱스, 가장 적은 값을 출력 하면 된다.

    }
}



