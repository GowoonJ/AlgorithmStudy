import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int size = numbers.length;
        String[] arr = new String[size];
        boolean zero = true;
        
				//    int 배열 String 배열로 변환
        for(int i = 0 ; i < size ; i++){
            arr[i] = Integer.toString(numbers[i]);
            zero = numbers[i] == 0 && zero ? true : false;
        }
        
				//    모두 0 이면 return "0";
        if(zero){
            answer = "0";
            return answer;
        }
        
				//    lambda 식으로 표현
				//    Arrays.sort(arr, (o1, o2) -> 
				//               (o2+o1).compareTo(o1+o2)
				//               );
				
				Arrays.sort(arr, new Comperator<String>(){
										@override
										public int compare(String o1, String o2){
											return (o2 + o1).compareTo(o1+o2);
										}
				});
        
        for(String num : arr){
            answer += num;
        }
        
        return answer;
    }
}