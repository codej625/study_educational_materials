# 스터디 주제 "웹 퍼블리싱"

<br /><br />

* 웹 퍼블리싱이란?
```
웹 퍼블리싱이란 웹 페이지를 만들기 위해 디자인을 코드로 변환하는 과정을 말한다.
이는 HTML, CSS, JavaScript 등을 사용하여 디자인된 웹 페이지를 구현하는 작업을 포함한다.
웹 디자이너와 웹 개발자 간의 중간 역할을 수행하기도 한다.
디자인된 웹 페이지를 웹 브라우저에서 올바르게 표시되도록 만들고,
사용자 경험을 최적화하기 위해 노력하는 것이 주요 목표이다.
```

<br /><br />


* 웹 퍼블리싱의 사용되는 기술

<br />

1. 구조(HTML)
```
HTML을 사용하여 구조를 잡는다.
이 과정은 SEO와도 밀접한 관계가 있으며,
잘 설계된 HTML 구조는 추후 작업에 있어서도 수정요소가 적고 유지보수가 용이하다.
```

<br />

2. 디자인(CSS)
```
CSS는 HTML이나 XML 같은 마크업 언어로 작성된 문서의 표현 방법을 정의하는 스타일 시트 언어이다.
웹 페이지의 레이아웃, 색상, 글꼴, 크기, 간격 및 다양한 시각적 요소를 설정할 수 있다.
```

<br />

3. 동적인 요소(Javascript)
```
주로 정적인 표현을 하는 HTML과 CSS에 동적인 표현을 하기 위해서 사용되는 스크립트 언어이다.
웹 퍼블리셔는 주로 자바스크립트의 라이브러리인 jQuery를 많이 사용한다.
```

<br /><br /><br />

* 기본 구성
```html
<!DOCTYPE html>
<html lang="ko">
  <!- head ->
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Web Publishing</title>
    <!- CSS ->
    <link rel="stylesheet" href="./styles.css">
    <!- jQuery Library CDN ->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  </head>
  <!- head end ->

  <!- body ->
  <body>
    <!---------------------------------------------------------- header ->
    <header>
      <nav> ... </nav>
    </header>
    <!------------------------------------------------------------ main ->
    <main>
      <section> ... </section>
      <section> ... </section>
      <section> ... </section>
      <aside> ... </aside>
    </main>
    <!---------------------------------------------------------- footer ->
    <footer> ... </footer>
    <!- Script ->
    <script src="./script.js"></script>
  </body>
  <!- body end ->
</html>
```

<br /><br /><br />

* Positon에 대해 알아보자.

<br />

1. static
```
static은 요소의 기본 값이다.
top, right, bottom, left, z-index 속성은 static으로 지정된 요소에 영향을 주지 않는다.
```

<br />

2. relative
```
요소를 자기 자신을 기준으로 배치한다.
top, right, bottom, left 속성을 사용하여 이동할 거리를 지정할 수 있다.
```

<br />

3. absolute
```
부모(조상) 요소를 기준으로 배치한다.
만약 그런 조상이 없다면, 문서의 최상위 요소를 기준으로 한다.
top, right, bottom, left 속성을 사용하여 이동할 거리를 지정할 수 있다.
```

<br />

4. fixed
```
요소를 브라우저 창을 기준으로 위치시킵니다. 스크롤되더라도 요소는 항상 고정된다.
```

<br />

5. sticky
```
요소를 일반적인 문서 흐름에 따라 배치하지만,
스크롤되는 상황에서 특정 위치에 고정시킬 수 있습니다.
```

<br /><br /><br />

* 숙제
```
header 맨 윗부분 구현
```

<br />

<a href="https://github.com/codej625/study_educational_materials/blob/main/%EC%9E%AC%EC%9B%85%2C%20%EC%9A%A9%EC%88%98/240519_homework_image.png">이미지 확인</a>
