package feb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By think
 * Created At 2021/2/18 21:33
 */
public class FindRelativeRanks506 {

    public String[] findRelativeRanks(int[] score) {
        int N = score.length;
        String[] retArr = new String[N];
        if(N == 1){
            return new String[]{"Gold Medal"};
        } else  if(2 == N){
            if(score[0] > score[1]){
                retArr[0] = "Gold Medal";
                retArr[1] = "Silver Medal";
            } else {
                retArr[1] = "Gold Medal";
                retArr[0] = "Silver Medal";
            }
            return retArr;
        }
        int[] arr = new int[N];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <N ; i++) {
            arr[i] = score[i];
        }
        Arrays.sort(score);
        for (int i = 0; i <N ; i++) {
            map.put(score[i], N-i);
        }
        int first = score[N-1];
        int second = score[N-2];
        int third = score[N-3];
        for(int j=0;j<N;j++){
            if(arr[j] == first){
                retArr[j] = "Gold Medal";
            } else if(arr[j] == second){
                retArr[j] = "Silver Medal";
            } else if(arr[j] == third){
                retArr[j] = "Bronze Medal";
            } else {
                retArr[j] = map.get(arr[j]).toString();
            }
        }
        return retArr;
    }


}
