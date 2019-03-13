import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringtoNumber {

    /*
    *
    * 1. String형을 int형으로 형변환 해준다.
    * 2. return 해준다.
    *
    * */


    public int solution(String num){

        // 변환하기
       int answer = tonumber(num);

        // 리턴하기
       return answer;
    }

    private int tonumber(String num) {

        int answer = Integer.parseInt(num);

        return answer;
    }

    @Test
    public void tonumber_확인하기() {
        assertEquals(77, tonumber("77"));
    }

    @Test
    public void 양수() {
        assertEquals(5, solution("5"));
        assertEquals(124, solution("124"));
    }

    @Test
    public  void 음수() {
        assertEquals(-15,  solution("-15"));
        assertEquals(-123,  solution("-123"));
    }




}
