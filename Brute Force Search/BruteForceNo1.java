package org.inu.practice;
import java.util.*;

public class BruteForceNo1 {
    public int[] solution(int[] answers) {
        ArrayList<Integer> ansList = new ArrayList<>();

        // 수포자 규칙
        int[] oneArray = {1,2,3,4,5};
        int[] twoArray = {2,1,2,3,2,4,2,5};
        int[] threeArray = {3,3,1,1,2,2,4,4,5,5};

        // 정답 수
       int[] result = new int[3];
        for(int i = 0 ; i < answers.length ; i++){
            // 수포자 1
            if(answers[i] == oneArray[i%oneArray.length]){
                result[0]++;
            }
            // 수포자 2
            if(answers[i] == twoArray[i%twoArray.length]){
                result[1]++;
            }
            // 수포자 3
            if(answers[i] == threeArray[i%threeArray.length]){
                result[2]++;
            }
        }

        // 제일 많이 맞은 수
        int high = 0;
        for (int i = 0; i < 3; i++) {
            if (result[i] > high) {
                high = result[i];
            }
        }

        if (high == 0) {
            return new int[] {};
        }

        // 하이스코어 수포자
        ArrayList<Integer> highList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (result[i] == high) {
                highList.add(i);
            }
        }

        int size = highList.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = highList.get(i) + 1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
