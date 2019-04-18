/**
 *
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 *
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class World124 {

    /*
     *
     * 1. 3으로 나눈 수의 몫과 나머지를 구한다.
     * 2. 나머지는 답(answer)에 더해준다. 다음 루프에서는 그 몫을 나눈다.
     * 3. 몫이 0보다 작아지면 멈춘다.
     * 4. answer을 한 번 뒤집는다.
     *
     * */


    public String solution(int num){

        String answer;

        // 1 to 3
        answer = for124(num);

        answer = reverseString(answer);

        return answer;
    }


    private String for124(int num) {

        String answer = "";

        int rem = 0; // 나머지

        while(num > 0){

            // 몫(quo)과 나머지(rem) 변수 초기화
            rem = num % 3;
            num = num / 3;


            // answer에 나머지를 붙여준다. 0은 4로 치환한다. 몫 -1을 해준다.
            if(rem == 0){
                num -= 1;
                rem = 4;
            }

            answer += Integer.toString(rem);

        }

        return answer;
    }

    public static String reverseString(String s) {
        return ( new StringBuffer(s) ).reverse().toString();
    }


    @Test
    public void 리턴받기_123단계(){
        assertEquals("14", for124(10));
        assertEquals("12", for124(7));
        assertEquals("42", for124(9));
    }


    @Test
    public void 정답() {
        assertEquals("1", solution(1));
        assertEquals("2", solution(2));
        assertEquals("24", solution(9));
        assertEquals("41", solution(10));
    }


}
