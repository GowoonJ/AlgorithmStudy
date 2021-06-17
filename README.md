# 💻알고리즘 공부 / 코딩테스트 준비 기록💻
## 1. HashMap
속도가 빠른 해쉬맵 이용하기
- HashMap -> Key : Value로 구성
- 많은 양의 문자열 비교
---
- getOrDefault(key, default) 이용하기
- key value 하나 묶음 == Entry

## 2. 완전탐색 (BruteForce Search)
가능한 모든 것을 탐색하자!
- 재귀함수, 반복문 사용하기
- 런타임에러 주의
---
### 1. 모의고사
### 2. 소수찾기
  **풀이방법**
1. numbers 로 만들 수 있는 수 저장하기
 - 만들 수 있는 수들은 순열 알고리즘 적용 *( 다시 정리 필요 )*
2. 그 수보다 작은 수로 나누기 (n/2)보다 작은 수로 !
 - sqrt (제곱근 보다 작은 수로만 나눠도 ok)
 - 나머지가 있으면 → 소수라고 생각
 - 나머지 없으면 → 나누어 떨어지니까 소수아님 !
 - for 문 끝났을 때 true 면 출력값++
> https://codevang.tistory.com/299?category=827588 참고하여 풀이 작성
> 이해 후 다시 풀어야겠다....... :(

## 3. 정렬 (Sorting)
1. 선택 정렬(Selection Sort)
2. 삽입 정렬(Insertion Sort)
3. 버블 정렬(Bubble Sort)
4. 합병 정렬(Merge Sort)
5. 퀵 정렬 (Quick Sort)
- Collection 이용
- .sort() 이용
---
### 1. K번째 수
프로그래머스 정렬 레벨 1
2차원 배열로 command가 주어졌기 때문에 이중 for문 사용
