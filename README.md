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
<br/>

## 다시 풀어야하는 문제

1. [최빈값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/120812#)
2. [구슬을 나누는 경우의 수](https://school.programmers.co.kr/learn/courses/30/lessons/120840)
3. [OX퀴즈](https://school.programmers.co.kr/learn/courses/30/lessons/120907)
