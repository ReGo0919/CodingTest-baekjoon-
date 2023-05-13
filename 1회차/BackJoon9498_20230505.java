import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon9498_20230505 {

        public static void main(String[] args) throws IOException {
                /* Scanner를 이용한 방법
//               Scanner sc = new Scanner(System.in);
                 int score = sc.nextInt();
                 sc.close();
                 if(score >= 0 && score <= 100){
                     if(score >= 90 && score <= 100) System.out.println("A");
                     else if (score >= 80 && score <= 89) System.out.println("B");
                     else if (score >= 70 && score <= 79) System.out.println("C");
                     else if (score >= 60 && score <= 69) System.out.println("D");
                     else if(score >= 0 && score <= 59)
                         System.out.println("F");
                 }else{
                     System.out.println("올바른 값을 입력하세요.");
                  }
                */
//              2. BufferedReader를 이용한 방법
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //버퍼 생성
                int Input = Integer.parseInt(br.readLine());
                // 각각의 토큰을 a와 b에 담고 아래와 같이 비교
                if(Input >= 0 && Input <= 100){
                    if(Input >= 90 && Input <= 100) System.out.println("A");
                    else if (Input >= 80 && Input <= 89) System.out.println("B");
                    else if (Input >= 70 && Input <= 79) System.out.println("C");
                    else if (Input >= 60 && Input <= 69) System.out.println("D");
                    else if(Input >= 0 && Input <= 59)
                        System.out.println("F");
                }else{
                    //여기서 else를 입력한 이유는 사용자가 임의의 음수나 100의 값을 벗어난 수를 입력 할 수 있기 때문이다.
                    System.out.println("올바른 값을 입력하세요.");
                }


        }

    }