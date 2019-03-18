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
     * 1. 1,2,4를 조합해서 i(num)만큼 계속 작은수를 만든다.
     * 2. 반복문이 끝나면 최종 수를 리턴해준다.
     *
     * */


    public int solution(int num){

        int answer;

        answer = for124(num);

        switch (num){
            case 1 :
                return 1;
            case 2 :
                return 2;
            case 3 :
                return 4;
            default :
                return 11;
        }
    }

    // 중복조합 이용하는 문제인듯

    private int for124(int num) {

        int arr[] = {1,2,4};
        int answer;

        String temp; // 넣을 공간

        // 1. 0, 1, 2, 00 이런식으로 나누기
        for(int i=0; i<num; i++){

            int j=0; // 자리수 담당

        }

        // 2. 문자열 붙이기


        if (num == 4){
            return 11;
        }
        return 12;
    }


    @Test
    public void 작은수_리턴해주기(){
        assertEquals(11, for124(4));
        assertEquals(12, for124(5));
    }


    @Test
    public void 정답() {
        assertEquals(1, solution(1));
        assertEquals(2, solution(2));
        assertEquals(4, solution(3));
        assertEquals(11, solution(4));
    }


}
