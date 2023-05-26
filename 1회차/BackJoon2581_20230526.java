import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BackJoon2581_20230526 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번엔 while문을 연습 할 겸 같이 사용을 해주었다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int range = N - M + 1;
        int startvalue = M+1;
        int[] numbers = new int[range];
        ArrayList<Integer> decimal = new ArrayList<>();
        for(int i = 0 ; i < range ; i++){
            numbers[i] = M+i;

        }
        int sum = 0;
        for (int i = 0 ; i < range - 1 ; i++) {
            int count = 0;
            for (int j = 1; i < numbers[i] + 1 ; j++) {
                if (numbers[i]%j == 0) count++;
            }
            if (count == 2) {
                decimal.add(numbers[i]);
            }
        }
        for (int i = 0 ; i < decimal.size() ; i++){
            sum += decimal.get(i);
        }
        System.out.println(sum);
        System.out.println(decimal.get(decimal.size()-1));

    }
}


