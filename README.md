# Algorithm

- [알아둬야할 python 문법](https://github.com/Maker-H/Study-Algorithm-baekjun#%EC%95%8C%EC%95%84%EB%91%AC%EC%95%BC-%ED%95%A0-python-%EB%AC%B8%EB%B2%95)
- [오답노트](https://github.com/Maker-H/Study-Algorithm-baekjun#%EC%98%A4%EB%8B%B5%EB%85%B8%ED%8A%B8)
- [다시 풀어야할 문제](https://github.com/Maker-H/Study-Algorithm-baekjun#%EB%8B%A4%EC%8B%9C-%ED%92%80%EC%96%B4%EC%95%BC%ED%95%98%EB%8A%94-%EB%AC%B8%EC%A0%9C)

<br/>
<br/>

## 알아둬야 할 python 문법

소수 버리면서 정수만 가져오는 함수

```python
import math
math.trunc(1.53)
```


<br/>

올림하는 함수

```python
import math
math.ceil(1.2) # 2
```


<br/>

알파벳인지 숫자인지 확인하는 방법

```python
'a'.isalpha() # True
'1'.isdigit() # True
'1h'.isalnum() # True -> 문자or숫자이면 True
'1.h'.isalnum() # False
```

<br/>

제곱과 루트 하는 방법

```python
import math

# 둘 다 float 반환
math.pow(x, y) # x의 y 제곱
math.sqrt(4)
```

<br/>

소문자 -> 대문자, 대문자 -> 소문자

```python
's'.upper()
's'.lower()

's'.isupper()
's'.islower()
```

<br/>

리스트를 str로

```python
''.join.(리스트)
```

<br/>

문자 -> 아스키 정수, 아스키 정수 -> 문자

```python
chr(45) # 아스키 -> 문자
ord('a') # 문자 -> 아스키
```

<br/>

key가 딕셔너리 안에 있는지 조사하기 in
key로 value 얻기

```python
user1 = {'name': 홍길동, 'age':19}
print('name' in user1)

user1.get('age')

user1.add()
```

<br/>

최빈값 얻기
collections 모듈의 counter 클래스

```python
from collections import Counter
colors = ['red', 'blue', 'red', 'green', 'blue', 'blue']
cnt = Counter(colors)
cnt
# Counter({'blue': 3, 'red': 2, 'green': 1})

# [Counter 클래스의 most_common() 메쏘드는 등장한 횟수를 내림차순으로 정리]
cnt.most_common()
# [('blue', 3), ('red', 2), ('green', 1)]

# [상위 1개만 출력]
cnt.most_common(1)
```

<br/>

문자열 자르는 법 split

```python
# 1번만 자르기
'1234 56678 1234'.split(' ', 1)

# -> ["1234","56678 1234"]
```

<br/>

Deque 활용

```python
D.appendleft() D.append()
D.pop() D.popleft()
D.extend([]) D.extendleft([])
D.remove('') -> 해당 item 찾아서 삭제
D.rotate(숫자) -> 숫자번 만큼 회전, 양수 시계방향, 음수 반시계 방향
```

<br/>

힙 활용 -> 파이썬은 최소힙

```python
import heapq
heap = []
heapq.heappush(heap, 50)

heap2 = [10, 50, 30]
heapq.heapify(heap2)
# [10, 30, 50]
```

max heap 활용
```python
heap_items = [1, 3, 5, 7, 9]
max_heap = []
for item in heap_items:
    heapq.heappush(max_heap, (-item, item))

max_item = heapq.heappop(max_heap)[1]
```

nlargest nsmallest
``` python
nums = [1, 3, 5, 7, 9]
heapq.nlargest(1, nums) # 개수, 리스트
# [9]
```

<br/>

sort 활용

```python
# 앞의 인자로 정렬됨
b = sorted(a)
b = [(0, 1), (1, 2), (3, 0), (5, 1), (5, 2)]
# 
# 앞의 인자로 정렬
c = sorted(a, key = lambda x : x[0]) 
c = [(0, 1), (1, 2), (3, 0), (5, 1), (5, 2)]
# 
# 뒤의 인자로 정렬
d = sorted(a, key = lambda x : x[1]) 
d = [(3, 0), (5, 1), (0, 1), (1, 2), (5, 2)]
# 
# 앞의 인자로 정렬 후 같은 값에 대해서는 뒤의 인자 역순으로 정렬
**e = sorted(a, key = lambda x : (x[0], -x[1]))** 
e = [(0, 1), (1, 2), (3, 0), (5, 2), (5, 1)]
# 
# 앞의 인자를 역순으로 정렬
f = sorted(a, key = lambda x : -x[0]) 
f = [(5, 1), (5, 2), (3, 0), (1, 2), (0, 1)])

```
[람다 참조](https://gorokke.tistory.com/38)





<br/>
<br/>

## 오답노트

[프로그래머스] 직각삼각형 출력하기 [link](https://school.programmers.co.kr/learn/courses/30/lessons/120823)

- 0일때 char과 곱하면 빈 줄 생성되니 주의

<br/>

[프로그래머스] 최댓값 만들기(2) [link](https://school.programmers.co.kr/learn/courses/30/lessons/120862#)

- index를 활용하는 것과 ch값을 그대로 활용하는 것의 차이에 주의하자. 혹시 for문 안에서 생각한 대로 풀리지 않는다면 의심해볼것

<br/>

[프로그래머스] 최빈값 구하기 [link](https://school.programmers.co.kr/learn/courses/30/lessons/120812#)

- 카운팅을 최적화 하기 위해선 어떻게 하는게 좋을까? 생각하기

<br/>

[프로그래머스] 구슬을 나누는 경우의 수 [link](https://school.programmers.co.kr/learn/courses/30/lessons/120840)

- 4C3 = 4! / (4-3)! \* 3!

<br/>

[프로그래머스] 게임맵 최단거리 [link](https://school.programmers.co.kr/learn/courses/30/lessons/1844) 
- 파이썬에서 리스트는 공유되므로 최단 거리를 구할때 한 번 갔던 길은 두 번 갈 수 없음
- visited 체크를 언제하는게 좋을지 생각해봐야 할 문제, 이미 덱에 넣은 노드를 다시 넣게 되지 않을지 생각해야함 visitied를 언제 체크하는지에 따라 이미 덱에 넣은 노드를 또 넣게 된다

<br/>

[프로그래머스] 가장 큰 수 [link](https://school.programmers.co.kr/learn/courses/30/lessons/42746#) 
- 문자열 비교연산의 경우 문자열 첫번째 인덱스를 아스키 숫자로 바꿔서 비교하고, 같으면 그 다음 인덱스를 비교한다. (한 글자씩 아스키를 비교한다고 생각하면 됨)
- '3', '30'를 비교할 경우 빈칸 ''가 9로 잡히고 숫자 0은 아스키 48임으로 0가 더 크다

<br/>

[프로그래머스] 의상 [link](https://school.programmers.co.kr/learn/courses/30/lessons/42578) 
- 경우의 수 문제의 경우 '안입는다'도 옵션으로 포함하기 때문에 +1을 한 다음 모두 곱해준다

<br/>

<br/>

## 다시 풀어야하는 문제

### 프로그래머스 레빌 0 <기초>
1. [최빈값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120812#)
2. [구슬을 나누는 경우의 수](https://school.programmers.co.kr/learn/courses/30/lessons/120840)
3. [OX퀴즈](https://school.programmers.co.kr/learn/courses/30/lessons/120907)
4. [가장 먼 노드](https://school.programmers.co.kr/learn/courses/30/lessons/49189)

<br><br>

* dfs/bfs 많이 약함, 다 잊어버림 -> 우선순위 큐, dfs/bfs -> 트리 -> 최단거리 순으로 익혀나가기
* dfs/bfs는 백준으로 익히기

### dfs/bfs
1. [타겟넘버](https://school.programmers.co.kr/learn/courses/30/lessons/43165)
    - bfs, dfs로 풀어보기
2. [게임 맵 최단거리](https://school.programmers.co.kr/learn/courses/30/lessons/1844)
    - visited를 사용하지 않고 dfs, bfs로 풀어보기
3. !!![여행경로](https://school.programmers.co.kr/learn/courses/30/lessons/43164#)
    - 이해를 못한 문제, 재귀로 푸는 방법이 있고 stack으로 푸는 방법이 존재.. 
    - 참고 링크 [link](https://mjmjmj98.tistory.com/103)
3. [아이템 줍기](https://school.programmers.co.kr/learn/courses/30/lessons/87694)
    - 방법 특이 


<br><br>

### 정렬
1. [H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747)


<br><br>

### 완전탐색
1. [소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/42839#)
   - 순열 구할 때 itertools.permutations도 사용해보고 permutations를 구현도 해보자



<br><br><br>

# 알아둬야할 SQL 문법
* where in 사용할 때는 ```where ~ in ('')``` 이렇게 사용해야 한다
* 날짜 형식은 ```date_format(컬럼명, '%y-%m-%d') as 컬럼명``` 이런식으로 사용해야 한다
* order by를 여러개 걸고 싶으면 ```order by 컬럼 오/내, 컬럼 오/내``` 이런식으로 이어서 사용하면 된다
