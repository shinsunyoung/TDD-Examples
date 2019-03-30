import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
 *
 * 1. 배열에서 중복된 값이 있는지 체크한다.
 * 2. 맨 끝의 스펠링과 맨 앞의 스펠링이 같은지 비교한다.
 * 3. 같으면 넘어가고, 다르면 틀린사람(배열 길이%n). 틀린순서(배열 길이/n)를 구한다.
 * 4. return 해준다.
 *
 * */

public class English_EndToEnd {
    public int[] solution(int n, String[] words) {

        int[] answer = compareSpell(n, words);

        return answer;
    }


    private int[] compareSpell(int n, String[] words) {

        int[] temp = {0,0};

        int len = 0;
        int min = words.length;
        // 1. 중복값 찾아서 있으면 위치 리턴하기
        for (int i = 0; i < words.length-1; i++) {
            len = words[i].length();

            if (words[i].substring(len - 1, len).equals(words[i + 1].substring(0, 1))) {
            }
            else {
                if(i+1 < min) {
                    min = i+1;
                    temp[0] = (i + 2) % n;
                    temp[1] = ((i + 1) / n) + 1;
                    if (temp[0] == 0) {
                        temp[0] = n;
                    }
                }
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if(j < min) {
                        min = j;
                        temp[0] = (j + 1) % n; // 어떤 사람이
                        temp[1] = (j / n) + 1; // 어디에서
                        if (temp[0] == 0) {
                            temp[0] = n;
                        }
                    }
                }
            }
        }
        return temp;
    }


    @Test
    public void 끝말잇기_최종정답() {
        assertArrayEquals(new int[]{1, 2}, solution(3, new String[]{"tank", "kick", "know", "heel", "land", "dream", "mother", "robot", "tank"}));
        assertArrayEquals(new int[]{4, 1}, solution(5, new String[]{"tank", "kick", "know", "heel", "land", "dream", "mother", "ra", "ank"}));
        assertArrayEquals(new int[]{1, 2}, solution(2, new String[]{"hello", "one", "hello", "never", "now", "world", "draw"}));
        assertArrayEquals(new int[]{3, 2}, solution(5, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "kick"}));
        assertArrayEquals(new int[]{1, 3}, solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
    }


}


