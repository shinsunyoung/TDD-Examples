import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

//1. 빈 배열일 경우 -1를 리턴한다.
// 2. 가장 작은 수(min)를 찾는다.
// 3. 작은수를 빼고 새 배열(answer)에 넣는다.


public class removeSmallest {
    public int[] solution(int[] arr){

        int[] one = {4,3,2};
        int[] two = {3,9,2,19};

        int[] answer = new int[arr.length-1];
        int[] onlyOne = {-1};
        int min = arr[0];

        // 빈 배열일 경우 -1을 리턴하기
        if(isEmptyfun(arr) == true){
            return onlyOne;
        }

        // 가장 작은 수 찾기
        min = minfun(arr);

        // 작은 수 빼고 배열에 넣기
        answer = makeNewArr(arr, min);

        return answer;

    }

    private int[] makeNewArr(int[] arr, int min) {

        int[] answer = new int[arr.length-1];
        int cnt = 0;

        for(int j=0; j<arr.length; j++) {

            if (arr[j] != min) {
                answer[cnt] = arr[j];
                cnt++;
            }
        }

        return answer;

    }

    private int minfun(int[] arr) {

        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }

    private boolean isEmptyfun(int[] arr) {

        if(arr.length == 1){ // 비어있을 때(배열 안의 요소가 1개밖에 없을 때)
            return true;
        }
        return false;

    }

    @Test
    public void 정답() {
        assertArrayEquals(new int[]{4, 3, 2}, solution(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{3, 9, 2 ,19}, solution(new int[]{3, 9, 1, 2 ,19}));
    }

    @Test
    public void 가장작은수(){
        assertEquals(1, minfun(new int[]{1,4,3,2}));
        assertEquals(3, minfun(new int[]{17,4,3,12}));
    }

    @Test
    public void 비어있는가(){
        assertEquals(true, isEmptyfun(new int[]{4}));
        assertEquals(false, isEmptyfun(new int[]{5,4}));
    }

    @Test
    public void 새배열(){
        assertArrayEquals(new int[]{4, 3, 2}, makeNewArr(new int[]{4,3,2,1}, 1));
        assertArrayEquals(new int[]{3, 9, 2 ,19}, makeNewArr(new int[]{3, 9, 1, 2 ,19}, 1));
    }


}


