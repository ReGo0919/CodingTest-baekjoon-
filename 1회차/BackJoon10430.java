import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon10430 {
        public static void main(String[] args) throws IOException {
            /* 1. 가장 기본적인 방법, 사용자에게 값을 입력 받아 지문대로 호출하는 법.
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.printf("%d\n%d\n%d\n%d", (a + b) % c, ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c);
            */
//          BufferedReader를 활용하는법. 대신 이 방법은 연속된 숫자, 예를 들어 123을 입력할시 그 123자체가 하나의 토큰 값으로 간주 되어서 사용자가 입력한다면 1,2,3 혹은 1 2 3이렇게 구분해서 넣어줘야한다.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String Input = br.readLine();
            StringTokenizer st = new StringTokenizer(Input);
            int[] arr = new int[3];
            for(int i = 0; i< arr.length;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            System.out.printf("%d\n%d\n%d\n%d", (a + b) % c, ((a % c) + (b % c)) % c, (a * b) % c, ((a % c) * (b % c)) % c);
        }
    }
