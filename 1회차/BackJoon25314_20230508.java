import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class BackJoon25314_20230508 {

        public static void main(String[] args) throws IOException, IOException {
        /*
         변수는 총 4개, 총 금액(X), 물건의 종류 수(N), 물건의 가격(a)과 개수(b)
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      Buffer 생성
        int N = Integer.parseInt(br.readLine());
        int length = N/4;
        String[] String_Array = new String[length];
//      총 금액과 종류수 선언. 총 금액은 값이 좀 커서 int의 다음 크기를 가진 long을 선언
        if (N >= 4 || N<=1000 || N%4 ==0){
            for (int i = 0; i<length;i++){
                if (String_Array[i] == null){
                    String_Array[i] = "long";
                }
            }
        }
            for (String str : String_Array) {
                System.out.print(str + " ");
            }
            System.out.println("int");

    }
}