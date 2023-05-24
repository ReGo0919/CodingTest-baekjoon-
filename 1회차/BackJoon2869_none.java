import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BackJoon2869_none {

        public static void main(String[] args) throws IOException {
        /* 일단 if문과 charAt을 사용하면 쉽게 풀 수 있으나 배열과 for문을 연습 할 겸 이들을 적극 활용했다.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int noon_A = Integer.parseInt(st.nextToken());
        int night_B = Integer.parseInt(st.nextToken());
        int height_V = Integer.parseInt(st.nextToken());
        int result = 0;
        long days = 0;
        int day = 0;
        while (height_V > result){
            result += noon_A - night_B;
            days++;
        }
        if (result >= height_V){
            days--;
        }
        System.out.println(days);


    }

}