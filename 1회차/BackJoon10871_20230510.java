import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon10871_20230510 {

    public static void main(String[] args) throws IOException, IOException {
    /* 이 문제는 첫째 줄에 정수의 N(개수) 와 특정 정수 X, 두번째 줄에는 수열(X)가 주어지고
    해당 특정 정수보다 낮은 값을 수열에서 찾아 프린팅 하는 문제이다.
    그럴려면 우선 배열이 두 개가 필요하다. 즉 원본의 수열을 가진 배열 하나, 특정 정수보다 낮은 값을 담고 있는 배열 하나.
    첫번째 배열은 N만큼의 길이를 담아야 하기에 일반 배열을 사용하나
    두번째는 가변적인 길이, 즉 정해지지 않은 배열을 생성해야 하기 때문에 ArrayList<Integer> 를 사용하여 두번째 배열을 생성한다.
    그리고 for문과 if문, foreach 문을 적절히 사용하면 된다.
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer first_st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(first_st.nextToken());
        int X = Integer.parseInt(first_st.nextToken());
//      첫번째 줄에 입력 되는 각각의 토큰 값들을 N과 X에 저장
        int[] first_array = new int[N];
//      N의 값을 first_array의 길이에 지정
        ArrayList<Integer> second_array = new ArrayList<Integer>();
//      다시 사용자가 입력한 X보다 작은 값들을 저장할 두번째 배열을 ArrayList를 사용하여 선언.
        StringTokenizer second_st = new StringTokenizer(br.readLine());
//      위의 first_st를 사용하려 했는데 알아보니 StringTokenizer는 단발성 입력 인 것 같아 다시 다른 이름의 입력 생성.
        for (int i = 0; i < N ; i++){
            first_array[i] = Integer.parseInt(second_st.nextToken());
//          for문을 돌려 second_st의 토큰 값들을 first_array의 i번째마다 각각 입력.
        }
        for (int i = 0; i < N ; i++){
            if (X > first_array[i]) second_array.add(first_array[i]);
//          두번째 포문, 만약 first 배열의 i번째의 값이 사용자가 지정한 X 값보다 작을 경우 ArrayList의 add 함수를 이용하여
//          first_array의 i번째의 값을 순차적으로 담아준다.
        }
        for (int result : second_array){
            System.out.print(result + " ");
//          위의 두 for 문이 끝났으면 foreach를 사용하여 출력을 해주는데 공백을 넣어 주어야 각각의 값들이 떨어져서 나오니 참고!
        }
    }
}


//          다시 foreach문을 돌려서 Answer의 배열 안의 n의 요소들을 첫번째부터 차례대로 프린트.
