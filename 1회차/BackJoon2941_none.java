import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BackJoon2941_none {

        public static void main(String[] args) throws IOException {
        /* 일단 if문과 charAt을 사용하면 쉽게 풀 수 있으나 배열과 for문을 연습 할 겸 이들을 적극 활용했다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int strLength = str.length();
        char[] newStr = new char[strLength];
        for (int i = 0 ; i < strLength ; i++){
             newStr[i] = str.charAt(i);
        }

//      사용자 입력 값 받고
        String[] Alphabet = new String[34];
      /*각 알파벳이 들어있는 String형 배열을 생성하는데 그 이유는 문자 뿐만 아니라 크로아티아 알파벳(문자열)까지
      총 34개가 들어올거기 때문에 char과 String을 같이 저장 할 수 있는 String 배열을 해당 길이만큼 생성했다.*/
        int[] AlphabetNum = new int[34];
//      마찬가지로 Alphabet의 각 자리마다 스코어(1과2)를 저장할 배열 하나를 만들어준다.
        int result = 0;
        for (int i = 0; i < 26 ; i++){
                Alphabet[i] = String.valueOf((char)(97+i));
                AlphabetNum[i] = 1;
        }
        for (int j = 26 ;  j < 34 ; j++){
                AlphabetNum[j] = 2;
        }
        Alphabet[26] = "c=";
        Alphabet[27] = "c-";
        Alphabet[28] = "dz=";
        Alphabet[29] = "d-";
        Alphabet[30] = "lj";
        Alphabet[31] = "nj";
        Alphabet[32] = "s=";
        Alphabet[33] = "z=";
        for (int i = 0 ; i < str.length() ; i++){
                for (int j = 0 ; j < Alphabet.length ; j++){
                        if (Alphabet[j].equals(newStr[i])){
                                result += AlphabetNum[j];
                        }
                }
        }
        System.out.println(result);


    }

}