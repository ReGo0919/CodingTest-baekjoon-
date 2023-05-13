import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BackJoon18108 {

        public static void main(String[] args) throws IOException {
            /*1. 가장 기본적인 방법
            문제에서 주어지는 입력값 2541 불기 연도를 입력시 1998 서기 연도가 출력 되는데,
            즉 2541-1998인 543값을 minus 값으로 설정 후 사용자 입력 값에서 차감 해준 결과값을 출력하면 됨.

            Scanner sc = new Scanner(System.in);

            int InputYear = sc.nextInt();
            int m = 543;

            System.out.println(InputYear - m);
            */
            /*2. BufferedReader를 이용한 방법
            BufferedReader 생성자 생성 후 InputStreamReader 생성자 순서대로 기입*/
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // String형 str 객체에 사용자에게 입력 받을 re.readLine() 함수 적용(위의 Input.nextLine과 동일)
            String str = br.readLine();
            // str 출력
            System.out.println(str);
//          데이터를 계속 입력 받고 싶다면 do-while문을 활용.



        }
    }
