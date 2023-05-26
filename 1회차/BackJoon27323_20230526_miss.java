import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon27323_20230526_miss {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번 문제 부터는 2차원 좌표를 이용한 문제의 시작점이다.
        가장 쉬운 문제이지만 앞으로 직면 할 2차원 좌표 문제들을 생각 해본다면
        이번 문제에서는 x와 y의 개념에 대해 익혀 두는것이 좋다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if (A >= 1 && A <= 100 && B >= 1 && B <= 100){
            System.out.println(A*B);
        }else{
            System.out.println("정확한 범위의 값을 입력 해주세요.");
        }
    }
}


