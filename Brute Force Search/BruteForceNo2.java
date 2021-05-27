import java.util.*;

class Solution {
    
    public int count;
    public ArrayList<String> set = new ArrayList<>();
    
    public int solution(String numbers) {
        int size = numbers.length();
        
        ArrayList<Character> nums = new ArrayList<>();
        
        for(int i = 0 ; i < size ; i++){
            nums.add(numbers.charAt(i));
        }
        
        ArrayList<Character> results = new ArrayList<>();
        
        for(int i = 0 ; i < size; i++){
            permutation(nums, results, size, i+1);
        }
        
        return count;
    }
    
    static boolean isPrime(int n){
        if(n == 2) {
            return true;
        }
        if(n % 2 == 0 || n == 1){
            return false;
        }
        for(int i = 3; i<= n/2 ; i+=2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
   public void permutation(ArrayList<Character> arr, ArrayList<Character> result, int n, int r) {
        if(r == 0) {
            if (result.get(0) != '0') {
				String str = "";
				int size = result.size();          
				for (int i = 0; i < size; i++) {
					str += result.get(i);
				}

				int num = 0;
                
				if (!set.contains(str)) {
					num = Integer.parseInt(str);
					set.add(str);
                    
					if (isPrime(num)) {
						count++;
					}
				}
			}
            return;
        }
        
        for(int i = 0 ; i < n ; i++){
            result.add(arr.remove(i));
            permutation(arr, result, n-1, r-1);
            arr.add(i, result.remove(result.size()-1));
        }
    }
}