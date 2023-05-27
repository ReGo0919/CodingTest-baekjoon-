import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon10101_20230527 {

    public static void main(String[] args) throws IOException, IOException {
        /* 일단 쓰기 졸라 귀찮을 뿐이지 이것도 한다면 금방 구하는 문제이다.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] apex = new int[3];
//      삼각형의 각 꼭지점 세 개를 담아줄 배열을 3만큼 생성
        int sum = 0;
//      그 세 꼭지점의 각(수)를 더할 sum 변수 선언
        for (int i = 0 ; i < apex.length ; i++) {
//      for문을 배열 길이만큼 돌려서
            apex[i] = Integer.parseInt(br.readLine());
//      사용자에게 입력을 받고
            sum += apex[i];
//      sum에 그 값을 누적 저장 시켜준다.
        }
        if (apex[0] == 60 && apex[0] == apex[1] && apex[0] == apex[2])
//      첫번째 조건, 만약 첫번째 값이 60이고 나머지 값이 첫번째 값과 똑같을 경우, 즉 셋 다 60인 경우를 선언 해준다.
            System.out.println("Equilateral");
//      출력 문구
        else if (sum == 180 && apex[0] == apex[1] || apex[0] == apex[2] || apex[1] == apex[2])
/*      둘째, 합(sum)이 180이고  첫번째 값과 두번째 값이 같거나,
        합(sum)이 180이고  첫번째 값과 세번째 값이 같거나,
        합(sum)이 180이고  두번째 값과 세번째 값이 같은 경우, 즉 세 숫자중 두 숫자가 같은 경우의 수를 조건으로 걸어준다. */
            System.out.println("Isosceles");
//      출력 문구
        else if (sum == 180 && apex[0] != apex[1] && apex[0] != apex[2] && apex[1] != apex[2])
//      그 다음, 합이 180이고 셋 다 다른 숫자일때
            System.out.println("Scalene");
//      해당 문구 출력.
        else System.out.println("Error");
/*      위와 같은 조건들이 입력되면 마지막 else의 조건은 자연스럽게 sum이 180이 아닌 경우만 자연스럽게 남겨지므로
        (180보다 크거나 작은 부등호가 쓰일수도 있으나 이 경우도 180과 같지 않은 경우와 똑같다.)
        이 경우 해당 Error 문구 출력.*/
    }
}


