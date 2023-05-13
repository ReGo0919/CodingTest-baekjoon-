import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2739_20230505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Input = Integer.parseInt(br.readLine());
//      문제는 1부터 10 사이의 정수를 입력하라고 했으니까 다음과 같은 조건식을 걸어주면 된다.
        if(Input >= 1 && Input <= 10){
//          조건에 맞은 수 일경우 for문을 돌려 printf를 이용해 출력.
            for(int i = 1 ; i < 10 ; i++)
                System.out.printf("%d * %d = %d\n", Input, i, Input*i);
        }else{
            System.out.println("1이상, 10이하의 숫자를 입력해주십시오.");
        }

    }


}
