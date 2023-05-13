import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon14681_20230506 {

        public static void main(String[] args) throws IOException {
        /*
         이번 조건식은 네가지 경우다. (양수 && 양수) = 1, (음수 && 양수) = 2, (음수 && 음수) = 3, (양수 && 음수) = 4
         즉 사용자가 입력한 두 가지 수를 각각의 경우에 넣어 그 값에 맞는 사분면 수(정수값)을 반환 해주면 되는 것이다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int return_squar=0;
        if (A > 0 && B > 0){
            return_squar = 1;
//      그냥 System.out.println(1) 을 작성해도 되는데 좀 다른 것도 연습할겸 코드를 더 입력 해보았다.
        } else if (A < 0 && B > 0) {
            return_squar = 2;
        } else if (A < 0 && B < 0) {
            return_squar = 3;
        } else if (A > 0 && B < 0) {
            return_squar = 4;
        }
//      참고로 사용자 입력값이 0인 경우 그에 대해 트켓으로 예외의 처리를 해주지 않아서 모든 if문을 건너뛰고 return_squar이 초기값(0)이 출력.
        System.out.println(return_squar);
    }
}