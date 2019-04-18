import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BiggestAndSmallest {
    public String solution(String s) {

        //공백(" ")을 기준으로 잘라서 배열에 넣는다.
        int[] arr = slices(s);

        //최댓값 최솟값을 찾고, 공백(" ")으로 연결해준다.
        String answer = findMinMax(arr);

        return answer;
    }

    private String findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        String answer = "";

        for(int i=1; i<arr.length; i++){ // 최댓값 최솟값 찾기
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        answer = Integer.toString(min) + " " + Integer.toString(max); // 숫자 -> 문자열로 형변환하기

        return answer;
    }

    private int[] slices(String s) {

        String arr[] = s.split(" "); // " " 기준으로 문자열 자르기
        int arrInt[] = new int[arr.length]; // 변형된 정수 배열을 넣을 곳

        for(int i=0; i<arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]); // 문자열 -> 정수형으로 형변환
        }

        return arrInt;
    }

    @Test
    public void 최종_정답(){
        assertEquals("1 4", solution("1 2 3 4"));
        assertEquals("-4 -1", solution("-1 -2 -3 -4"));
    }

    @Test
    public void 배열_만들기(){
        assertArrayEquals( new int[]{1, 2, 3, 4} , slices("1 2 3 4"));
        assertArrayEquals( new int[]{3, 6, 1, 2} , slices("3 6 1 2"));
    }

    @Test
    public void 최대_최소_찾기(){
        assertEquals("1 5", findMinMax(new int[]{1, 4, 5, 2}));
        assertEquals("12 60", findMinMax(new int[]{12, 47, 24, 60}));
    }


}

