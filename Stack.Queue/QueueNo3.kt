import java.util.*

// test case 3/14 통과
class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = bridge_length
        var truckQueue: Queue<Int> = LinkedList()
        var waitQueue : Queue<Int> = LinkedList()
        truck_weights.forEach{ e ->
            waitQueue.offer(e)
        }
         
        var cnt = 1
        
        truckQueue.offer(waitQueue.poll())
        while(true){
            if(truck_weights.size == 1){
                return answer+1
                break
            }
            var next = if (waitQueue.isEmpty()) 0 else waitQueue.poll()
            if(!truckQueue.isEmpty() && next != 0){
                var now = truckQueue.element()                
                if(weight >= now + next){
                    truckQueue.offer(next)
                } else {
                    truckQueue.remove()
                    truckQueue.offer(next)
                    cnt++
                }
                cnt++
            } else {
                answer = answer+cnt
                break
            }
        }
        
        return answer
    }
}