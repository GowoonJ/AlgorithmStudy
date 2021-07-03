import java.util.*

data class Doc(val priority : Int, val i : Int)
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var queue : Queue<Doc> = LinkedList<Doc>()
        var answer = 0
        var value = priorities[location]
        priorities.forEachIndexed{index, v -> 
            queue.offer(Doc(v,index))
        }
        
        val items = priorities.sorted().toMutableList()
        items.sortDescending()
        if(items[0] == value) {
            return 1
        } else{
            while(true){
                var pivot = queue.poll()
                if (queue.any{pivot.priority < it.priority}){
                    queue.add(pivot)
                }
                else{
                    answer++
                    if (pivot.i == location)
                        break
                }                    
            }
        }
                
        return answer
    }
}