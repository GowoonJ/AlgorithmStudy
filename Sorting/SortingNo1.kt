// 풀이 1회차
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        
        var n = 0
        for(command in commands){
            var i = command[0]-1
            var j = command[1]
            var arr = ArrayList<Int>()
            while(i<j){
                arr.add(array[i])
                i++;
            }
            arr.sort()
            var k = command[2] - 1
            answer.set(n, arr.get(k))
            n++
        }
        
        return answer
    }
}

// kotlin 장점 살린 풀이 
class Solution {
        fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
            return commands.map { command ->
                array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
            }
                .toIntArray()
        }
    }