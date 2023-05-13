import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon8393_20230505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      버퍼 선언
        int Input = Integer.parseInt(br.readLine());
        int ac = 0;
//      누적을 위한 int형 ac변수 생성
        for (int i = 0; i<Input+1 ; i++){
        /*만약 사용자가 2를 입력하면 1과 2를 더해야 하는데 i는 0부터 시작하므로 0,1,2 총 3번을 돌아야한다.
        그래서 첫번째에서는 i(0) 값을 ac에 누적(0)시키고 i값을 1로 증가 후 두번째를 돌게되고
        두번째에서는 i(1) 값을 ac에 누적(0+1)시키고 다시 i값을 2로 증가 후 세번째를 돌게 된다.
        세번째에서는 i(2) 값을 ac에 누적(0+1+2) 시키고 다시 i 값을 3으로 증가 시키면
        i(3)는 Input(2)에서 +1을 한 3과 비교했을때 작지 않으므로 종료를 하게 된다. 그래서 Input에 +1만큼 더해주는 것이다.
        그리고 만약 i를 0이 아닌 1로 설정하고 i<input 값만을 놓고 비교해 본다면 사용자가 2를 입력해도
        i의 첫번째 (1)를 실행 후 바로 2가 되는데, i(2)는 2보다 작지 않으므로 한번만 비교를 하고 바로 종료를 하게 된다.
        즉 for문을 2번 돌려야 하는데 한 번 밖에 돌리지 못하게 되므로 위의 코드처럼 짜놓은 것이다.
        */
            ac += i;
        }
        System.out.println(ac);


    }


}
