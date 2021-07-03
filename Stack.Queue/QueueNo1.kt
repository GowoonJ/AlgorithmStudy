import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        // 앞에 있는 기능이 왼성되어야 배포 가능
        // 큐 형식 자료구조
        var queue : Queue<Int> = LinkedList()
        var result = mutableListOf<Int>()
        
        for(i in progresses.indices){
            var cnt = 0
            cnt = (100-progresses[i]) / speeds[i]
            cnt = if ((100-progresses[i]) % speeds[i] > 0) cnt + 1 else cnt
            queue.offer(cnt)
        }
        
        var prev = queue.poll()
        var cnt = 1
        while(!queue.isEmpty()){
            val now = queue.poll()
            if(prev >= now)  cnt++
            else{
                result.add(cnt)
                cnt = 1
                prev = now
           }
        }
        result.add(cnt)
        return result.toIntArray()
    }
}