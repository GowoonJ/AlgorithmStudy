# ๐ป์๊ณ ๋ฆฌ์ฆ ๊ณต๋ถ / ์ฝ๋ฉํ์คํธ ์ค๋น ๊ธฐ๋ก๐ป
## 1. HashMap
์๋๊ฐ ๋น ๋ฅธ ํด์ฌ๋งต ์ด์ฉํ๊ธฐ
- HashMap -> Key : Value๋ก ๊ตฌ์ฑ
- ๋ง์ ์์ ๋ฌธ์์ด ๋น๊ต
---
- getOrDefault(key, default) ์ด์ฉํ๊ธฐ
- key value ํ๋ ๋ฌถ์ == Entry

## 2. ์์ ํ์ (BruteForce Search)
๊ฐ๋ฅํ ๋ชจ๋  ๊ฒ์ ํ์ํ์!
- ์ฌ๊ทํจ์, ๋ฐ๋ณต๋ฌธ ์ฌ์ฉํ๊ธฐ
- ๋ฐํ์์๋ฌ ์ฃผ์
---
### 1. ๋ชจ์๊ณ ์ฌ
### 2. ์์์ฐพ๊ธฐ
  **ํ์ด๋ฐฉ๋ฒ**
1. numbers ๋ก ๋ง๋ค ์ ์๋ ์ ์ ์ฅํ๊ธฐ
 - ๋ง๋ค ์ ์๋ ์๋ค์ ์์ด ์๊ณ ๋ฆฌ์ฆ ์ ์ฉ *( ๋ค์ ์ ๋ฆฌ ํ์ )*
2. ๊ทธ ์๋ณด๋ค ์์ ์๋ก ๋๋๊ธฐ (n/2)๋ณด๋ค ์์ ์๋ก !
 - sqrt (์ ๊ณฑ๊ทผ ๋ณด๋ค ์์ ์๋ก๋ง ๋๋ ๋ ok)
 - ๋๋จธ์ง๊ฐ ์์ผ๋ฉด โ ์์๋ผ๊ณ  ์๊ฐ
 - ๋๋จธ์ง ์์ผ๋ฉด โ ๋๋์ด ๋จ์ด์ง๋๊น ์์์๋ !
 - for ๋ฌธ ๋๋ฌ์ ๋ true ๋ฉด ์ถ๋ ฅ๊ฐ++
> https://codevang.tistory.com/299?category=827588 ์ฐธ๊ณ ํ์ฌ ํ์ด ์์ฑ
> ์ดํด ํ ๋ค์ ํ์ด์ผ๊ฒ ๋ค....... :(

## 3. ์ ๋ ฌ (Sorting)
1. ์ ํ ์ ๋ ฌ(Selection Sort)
2. ์ฝ์ ์ ๋ ฌ(Insertion Sort)
3. ๋ฒ๋ธ ์ ๋ ฌ(Bubble Sort)
4. ํฉ๋ณ ์ ๋ ฌ(Merge Sort)
5. ํต ์ ๋ ฌ (Quick Sort)
- Collection ์ด์ฉ
- .sort() ์ด์ฉ
---
### 1. K๋ฒ์งธ ์
ํ๋ก๊ทธ๋๋จธ์ค ์ ๋ ฌ ๋ ๋ฒจ 1
2์ฐจ์ ๋ฐฐ์ด๋ก command๊ฐ ์ฃผ์ด์ก๊ธฐ ๋๋ฌธ์ ์ด์ค for๋ฌธ ์ฌ์ฉ



## 4. ์คํ / ํ

### ์คํ(Stack)

**LIFO** (ํ์์ ์ถ, Last-In-First-Out)

๋์ค์ ๋ค์ด์จ ๋จผ์  ์์ ์ํค๋ ์๋ฃ๊ตฌ์กฐ ํํ

- **ํน์ง**

  - ๊ตฌ์กฐ, ํฌ๊ธฐ ๊ฐ์ Data๋ง ์์ ์ ์์
  - **push** : 'top'์ ์ด์ฉํด์ IN
  - **pop** : 'top'์ ์ด์ฉํด์ OUT

  ๋น ์คํ์์ ์์ ์ถ์ถ : Stack underflow,  ๋์น  ๋ Stack overflow  



### ํ(Queue)

**FIFO** (์ ์์ ์ถ, First-In-First-Out)

ํ ์ชฝ**(ํ๋ก ํธ, front)**์์  ์ญ์ , ํ ์ชฝ์์ **(๋ฆฌ์ด, rear)** ์ฝ์์ฐ์ฐ๋ง ๋งก๋๋ค.

์ญ์ ์ฐ์ฐ == **๋ํ(dnQueue)**

- **ํน์ง**
  -  ์ ๊ทผ์ ์ฒซ ์์, ๋ ์์๋ก๋ง ๊ฐ๋ฅ

๊ฐ์ฅ ๋จผ์  ๋ค์ด์จ ์์ : front

๊ฐ์ฅ ๋ฆ๊ฒ ๋ค์ด์จ ์์ : rear

---

**์ฌ์ฉ ์ import java.util.* ํ์**

![img](https://blog.kakaocdn.net/dn/ccrIyV/btqAqhAl9yp/G8oVmTH2EM0xVKU3gfm3eK/img.png)

Queue init ๐ LinkedList

```kotlin
var queue: Queue<Int> = LinkedList<Int>()

data class Doc(val index : Int, val value : Int)
var docQueue: Queue<Doc> = LinkedList<Doc>()
```



#### ์์ฃผ ์ฐ๋ ๋ฉ์๋

**add element**

element๋ฅผ Queue์ ์ถ๊ฐ

- add(element : E)

  ์ฑ๊ณต ์ return true

  ์คํจ ์ IllegalStateException ๋ฐ์

- offer(e: E)

  ์ถ๊ฐ ์คํจํ์ ๋ Exception ๋ฐ์โ

  return True or False

  ์ฉ๋๋ด์ ๊ฐ๋ฅํ  ๋๋ง ์ฌ์ฉ

**return element**

head์ element Return

element REMOVE โ

- element()

- peek()

  queue๊ฐ ๋น์ด์์ผ๋ฉด **return null**

element **REMOVE** โญ 

- poll()

  head์ element return

  queue ๋น์ด์์ผ๋ฉด **return null**

- remove()

  Exception ๋ฐ์โ
