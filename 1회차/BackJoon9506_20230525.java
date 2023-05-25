import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon9506_20230525 {

    public static void main(String[] args) throws IOException, IOException {
        /* 이번엔 while문을 연습 할 겸 같이 사용을 해주었다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nList = new ArrayList<>();
        int sum = 0;
        int n = 0;
        while (n != -1){
            n = Integer.parseInt(br.readLine());
            if (n > 2 && n < 100000) {
                sum = 0;
                nList = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) nList.add(i);
                }
                for (int i = 0; i < nList.size(); i++) {
                    sum += nList.get(i);
                }System.out.println(sum);
                sum = sum - n;
                    if (sum == n) {
                        System.out.printf("%d = ", n);
                        for (int i = 0; i < nList.size() - 1; i++) {
                            System.out.printf("%d", nList.get(i));
                            if (i < nList.size() - 2) {
                                System.out.print(" + ");
                            }
                        }
                    }else{
                        System.out.printf("%d is NOT perfect", n);
                    }
            }else{
                System.out.println("범위에 맞는 값을 입력 해주세요.");
            }
        }

    }
}


