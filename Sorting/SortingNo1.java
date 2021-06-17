import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // command 개수 변수로 저장
        int size = commands.length;
        int[] answer = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            
            // i번째 부터 j번째 까지 자르고 ArrayList에 저장
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = commands[i][0]-1 ; j < commands[i][1] ; j++){
                arr.add(array[j]);
            }
            
            // 오름차순 정렬
            Collections.sort(arr);
            
            // k번째 추출 후 answer[]에 저장
            answer[i] = arr.get(commands[i][2]-1);
        }
        
        return answer;
    }
}