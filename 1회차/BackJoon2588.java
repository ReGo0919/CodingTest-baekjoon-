import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon2588 {

        public static void main(String[] args) throws IOException {
                /* Scanner를 이용하는 첫번째 방법
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                //첫번째는 385(b 값)에서 5를 추출해야 하는데 그럴려면 먼저 380으로 나누어서 나머지 5를 얻어내면 된다.
                int c = (b % 380) * a;
                // 두번째는 385에서 다시 8을 추출해야 하는데 그럴려면 일단 300으로 나누고 나머지 값인 85에서 10으로 나누면 8.5가 되는데 a는 int이므로 int와 곱하기 연산시 소수 -> 정수형으로 자동 형 변환되므로 0.5는 자연스럽게 떨어져나감.
                int d = ((b % 300) / 10) * a;
                // 마지막은 385에서 3을 얻어야 하는데 두번째 자리를 구했던 것과 마찬가지로 100으로 b를 나눌시 3.85가 되고 마찬가지로 연산시 자동 현변환 되므로 3이 출력됨.
                int e = (b / 100) * a;
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(a * b);
                */
//              배열을 활용하는 방법.
                //일단 지금 할 수 있는 최선의 선에서 Scanner도 활용 해줄거임.
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                String Input = String.valueOf(b);
                // 배열 arr에 사용자 입력값 Input의 길이(3) 만큼 메모리를 생성.
                int[] arr = new int[Input.length()];
                //
                for (int i = 0; i<Input.length();i++){
                    arr[i] = Input.charAt(i) - '0';
                }
                int c = arr[2] * a;
                int d = arr[1] * a;
                int e = arr[0] * a;
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(a * b);
        }

    }
