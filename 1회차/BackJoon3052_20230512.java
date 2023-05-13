import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon3052_20230512 {

    public static void main(String[] args) throws IOException {
        /*이번엔 HashSet이라는 함수를 이용해보고자 한다. 이 HashSet은 순서대로 입력되지 않고 중복을 허용하지 않는,
        한마디로 비선형 비중복 배열 함수라는대에 그 의의를 두고 있는데
        이 해시셋을 이해하기 전에 배열 문제이므로 배열을 통해 푸는 것부터 시작하고 그 뒤에 hashset을 익히기로 했다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //HashSet<Integer> h = new HashSet<Integer>();//
        /*참고로 배열 길이를 10이 아닌 42로 하는 이유는 42로 딱 맞아 떨어지지 않고 1부터 41중 하나의 숫자가 나올수 있기 때문에
        42를 길이로 정했다 또한 해시셋은 중복값을 허용하지 않기 때문에 이 42라는 숫자 안에 중복되지 않은 값을 넣을 수 있어
        이 또한 가능한 연산이 되는 것이다..
        */
        boolean List[] = new boolean[42];

        for(int i = 0 ; i < 10 ; i++) {
            /*문제는 사용자 입력값 중에 나머지 값이 나오는 횟수의 합을 구하는 문제이다.
            즉 불리언을 이용해 배열의 특정 자리가 1이상, 41이하인 자리까지는 true(1)를 넣게 된다.
            예를들어 42를 넣는다면 42%43 = 나머지는 42가 되기에 배열의 42번 자리에 1을 집어넣는 것이다.

            */
            List[Integer.parseInt(br.readLine()) % 42] = true;

        }
        /*
        for (int i = 0; i < 10; i++) {
        h.add(Integer.parseInt(br.readLine()) % 42);
        }
         */
        /*이후 1이 나오는 배열이 있다면 count(횟수)를 1씩 증가시켜준다.*/
        int count = 0;
        for(boolean value : List) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        //System.out.print(h.size());//
        System.out.print(count);
    }
}



