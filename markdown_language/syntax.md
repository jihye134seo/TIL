# 마크다운 문법 정리
[참고자료1](https://heropy.blog/2017/09/30/markdown/)<br>
[참고자료2](https://www.whatwant.com/entry/GitHub-LaTex)<br>
[참고자료3](https://ansohxxn.github.io/blog/markdown/)<br>
[참고자료4](https://velog.io/@chelmini/MarkDown-%EB%A7%88%ED%81%AC%EB%8B%A4%EC%9A%B4-%EC%82%AC%EC%9A%A9%EB%B2%95)
[참고자료5](https://inpa.tistory.com/entry/MarkDown-%F0%9F%93%9A-Emoji-%EC%9D%B4%EB%AA%A8%ED%8B%B0%EC%BD%98-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0)

---
## 제목
\<h1> ~ \<h6>까지 사용가능
# h1 ( # )
## h2 ( ## )
### h3 ( ### )
#### h4 ( #### )
##### h5 ( ##### )
###### h6 ( ###### )
h1 (===)
===
h2 (---)
---
---
## 강조
두껍게, 기울임체, 밑줄, 취소선

**\**두껍게\**** 
__\__두껍게\____

*\*기울임체\**
_\_기울임체\__

<u>\<u>밑줄\</u></u>

~~\~~취소선\~~~~

---


## 목록 
순서있는 목록(1. , 2., 3. ...), 순서없는 목록(-, +, *)

1. 목록1
    - 목록1 - 서브1
    - 목록1 - 서브2
2. 목록2
    1. 목록2 - 서브1
    2. 목록2 - 서브2
---


## 링크
소괄호 사용(직접 링크 입력), 대괄호 사용(참조 링크 입력)

\[링크이름\]\(링크\) : [소괄호](https://www.google.co.kr/)

\[링크이름\]\[간접 링크 이름\] : [대괄호][link]

\[간접 링크 이름\]: 링크

[link]: https://www.google.co.kr/

---

## 이미지
소괄호 사용(직접 이미지 경로), 대괄호 사용(참조 이미지 경로)

\[이미지 대체 텍스트\]\(경로\) : ![text](https://cdn.pixabay.com/photo/2014/05/20/21/25/bird-349035_1280.jpg)

\[이미지 대체 텍스트\]\[간접 경로 이름\] : ![text][image_link]

\[간접 경로 이름\]: 경로

[image_link]: https://cdn.pixabay.com/photo/2014/05/20/21/20/bird-349026_1280.jpg

---

## 이미지 링크
\[ ![이미지 대체 텍스트\]\(이미지 경로\) \]\(링크\)

[![이미지링크](https://cdn.pixabay.com/photo/2015/02/04/08/03/baby-623417_1280.jpg)](https://github.com/)

---

## 코드 강조
인라인 코드 강조( \` \` )

java의 변수 선언은 `int a = 10;`과 같은 방식도 이용할 수 있다.

블록 코드 강조 ( \``` 언어 이름 \n ...내용... \``` )

``` java
public static void main(String[] args){
    System.out.println("Hello World!");
}
```
---

## 표

헤더 셀 구분할 때 : ---

정렬 : :

가장 좌측과 가장 우측의 | 표시는 생략 가능

| 제목1(좌측 정렬) | 제목2(중앙 정렬) | 제목3(우측 정렬) |
|---|:---:|---:|
|-------데이터 1-------|-------데이터2-------|-------데이터3-------|
|데이터 4|데이터5|데이터6|
|데이터 7|데이터8|데이터9|

---

## 인용문
> 인용
>> 중첩인용
>>> 중중첩인용

--- 
## Raw HTML

 - HTML 문법

 - 마크다운에서 지원하지 않는 기능 사용 가능
---
## 수평선

---, ***, ___ 중에 사용

---
## 줄바꿈
- br태그 사용

안녕하세요 \<br\><br> 처음 뵙겠습니다.

---
## 수식표현
- LaTex문법 표현을 따른다.
- code block 방식 : 수식만 단독 출력 / $$ 사이에 수식 정의
- inline 방식 : 텍스트 중간에 수식 표현 / $ 사이에 수식 정의

inline 방식 : $ x+y = 1$<br>
code block 방식 : $$ x+y+z = 3 $$

[LaTex문법 참고](http://tomoyo.ivyro.net/123/wiki.php/TeX_%EB%B0%8F_LaTeX_%EC%88%98%EC%8B%9D_%EB%AC%B8%EB%B2%95)

---
## 토글 리스트
- details태그, summary태그, div태그를 사용한다.

<details>
<summary>토글상자</summary>
<div markdown="1">
토글 내용
</div>
</details>


---
## 버튼
- html a태그 사용
- class를 "btn-success"로 지정함<br>
<a href="https://github.com/jihye134seo" class="btn-success">BTN</a>

---
## 체크 박스

- [ ] 빈 체크박스
- [x] 체크된 체크박스

---
## 글자 색상
- html span태그를 사용한다.
- style 속성에서 color값을 지정한다.

<span style="color: blue">blue</span>

---
## 이모지
\: 이모지 이름 \:

:camel:

---
## UML 다이어그램

[플로우 차트](http://flowchart.js.org/)

[시퀀스 다이어그램](https://bramp.github.io/js-sequence-diagrams/)
