import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon15894_20230527 {

    public static void main(String[] args) throws IOException, IOException {
        /* 일단 문제를 누가 냈는지는 모르겠지만 이 문제는 실선으로 이루어진 도형의 둘레를 구하는게 아니라
        그냥 위 꼭대기 1부터 n층까지 쌓인 상자의 전체 겉면의 둘레를 구하는 것이다.
        즉 실선이고 나발이고 그냥 전체 피라미드의 겉면 울레만 구하면 되는 식이다.
        그래서 상자가 하나라면 그에 대한 전체 둘레가,
        두개라면 맨 위 사각형의 밑변을 제외한 나머지 둘레 3과 그 바로 아래 있는 상자2개의 밑변과 옆변 4, 반 윗변을 합친 1
        을 더하면 8이 되는 것이고 이와 같이 다른 상자들의 개수를 더해본다면
        층이 늘어날수록 4배가 된다는 것을 알 수 있다. (문제를 누가 냈는진 모르겠는데 진짜 줫같이 냈 ㄴ...)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N*4);
    }
}


