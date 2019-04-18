import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleMin {
    public int solution(int n){

        // min의 값 설정하기
        int min = n-1;
        int temp;

        // 약수 구하면서 반복문 돌기

        for(int i=2; i<n; i++){
            // 더 작은 값이 있으면 temp에 넣고 min과 비교하기
            if(n % i == 0 ){
                temp = (n/i > i) ?  ((n/i) - i) : (i - (n/i));
                if(temp < min ){
                    min = temp;
                }
            }
        }

        // 반복문이 끝나면 min 리턴해주기
        return min;
    }

    @Test
    public  void 최소값_정답() {
        assertEquals(3,  solution(10));
        assertEquals(0,  solution(16));
        assertEquals(96, solution(97));
        assertEquals(27, solution(124));
    }


}


