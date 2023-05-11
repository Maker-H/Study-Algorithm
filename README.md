# Algorithm baekjoon/programmers
 * [알아둬야할 python 문법]()
 * [오답노트]() 

<br/>
<br/>

## 알아둬야 할 python 문법

소수 버리면서 정수만 가져오는 함수
``` python
import math
math.trunc(1.53)
```

<br/>

알파벳인지 숫자인지 확인하는 방법
``` python
'a'.isalpha() # True
'1'.isdigit() # True
'1h'.isalnum() # True
'1.h'.isalnum() # False
```

<br/>

제곱과 루트 하는 방법
``` python
import math

# 둘 다 float 반환
math.pow(x, y) # x의 y 제곱 
math.sqrt(4)
```

<br/>

소문자 -> 대문자, 대문자 -> 소문자
``` python
's'.upper()
's'.lower()

's'.isupper()
's'.islower()
```

<br/>

리스트를 str로
``` python
''.join.(리스트)
```

<br/>

문자 -> 아스키 정수, 아스키 정수 -> 문자
``` python
chr(45) # 아스키 -> 문자
ord('a') # 문자 -> 아스키
```


<br/>
<br/>

## 오답노트

[프로그래머스] 직각삼각형 출력하기 [link](https://school.programmers.co.kr/learn/courses/30/lessons/120823)
* 0일때 char과 곱하면 빈 줄 생성되니 주의

<br/>

[프로그래머스] 최댓값 만들기(2) [link](https://school.programmers.co.kr/learn/courses/30/lessons/120862#)
* index를 활용하는 것과 ch값을 그대로 활용하는 것의 차이에 주의하자. 혹시 for문 안에서 생각한 대로 풀리지 않는다면 의심해볼것

<br/>


