import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1330_20230505 {

        public static void main(String[] args) throws IOException {
                /* Scanner와 배열을 이용하는 첫번째 방법
//              배열을 활용하는 방법.
                Scanner sc = new Scanner(System.in);
                String Input = sc.nextLine();
                String[] arr = Input.split(" ");
//              Input 값들을 split으로 공백을 제거하고 그 각각을 arr배열에 담기
                int[] newArr = new int[arr.length];
//              다시 담은 값들을 int형 배열에 넣어줄 newArr배열을 String arr형의 길이만큼 생성
                for(int i = 0 ; i < arr.length; i++){
                    newArr[i] = Integer.parseInt(arr[i]);
                }
//              for문을 도는 동안 String 객체가 담긴 arr의 요소들을 int로 형변환 후 newArr배열에 하나 하나 담기

                if(newArr[0]>newArr[1])
                    System.out.println(">");
                else if(newArr[0]<newArr[1])
                    System.out.println("<");
                else
                    System.out.println("==");
                */
//              2. BufferedReader와 StringTokenizer를 이용하는 방법 (2023-05-05)
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //버퍼 생성
                StringTokenizer st = new StringTokenizer(br.readLine());
                // 사용자 입력 값을 토큰형 st변수에 저장
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                // 각각의 토큰을 a와 b에 담고 아래와 같이 비교
                if (a > b){
                    System.out.println(">");
                }else if(a < b){
                    System.out.println("<");
                }else{
                    System.out.println("=");
                }


        }

    }