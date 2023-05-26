import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon11653_20230526_miss {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번엔 while문을 연습 할 겸 같이 사용을 해주었다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N != 0){
            if ((N&2) == 0 && N != 0){
                N = N/2;
                System.out.println(2);
            }else if((N&2) == 1){
                N = N/3;
                System.out.println(3);
            }
        }
    }
}


