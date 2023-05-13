import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJoon10926 {
    public static void main(String[] args) throws IOException {
/* 1. 가장 기본적인 방법
        Scanner Input = new Scanner(System.in);
        String str = Input.nextLine();
        if (str == "백준")
            System.out.print(str + "??!");
        else System.out.print(str + "??!");
        Input.close();

*/
        /*2. BufferedReader를 이용한 방법
        입력 받은 값은 문자열 값을 Integer로 변환 후 출력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int InputYear = Integer.parseInt(br.readLine());
        int m = 543;
        System.out.printf("%d",InputYear-m);
    }
}