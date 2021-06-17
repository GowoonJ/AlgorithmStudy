class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        var nums = numbers.map{it -> it.toString()}
        var isZero = true
        
        for(value in nums){
            if(value == "0" && isZero) isZero = true
            else isZero = false
        }
        if(isZero) return "0"
        
        nums = nums.sortedWith(kotlin.Comparator{o1, o2 -> 
            (o2+o1).compareTo(o1+o2)
        });
        
        for(value in nums){
            answer += value;
        }
        
        return answer
    }
}