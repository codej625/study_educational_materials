# 스터디 주제 "HTML, CSS"

<br /><br />

* HTML
```
HTML(HyperText Markup Language)은 웹 페이지를 만들기 위한 표준 마크업 언어이다.
HTML은 웹 브라우저에게 문서의 구조를 설명하고 표시하는 방법을 지시한다.
이것은 웹 페이지의 텍스트, 이미지, 링크 등의 다양한 콘텐츠를 표시하는 데 사용된다.
```

<br /><br />

1. HTML의 구조는 크게 head 태그와 body 태그로 나뉜다.
```
<head> -> 웹 페이지의 메타 데이터와 외부 리소스를 정의하는 데 사용된다.
제목(title), 스타일 시트(style sheet), 스크립트(script), 문자 인코딩(charset), 뷰포트 설정(viewport),
검색 엔진 최적화(SEO)를 위한 메타 태그(meta tag) 등이 포함될 수 있다.

<body> -> HTML 문서의 실제 콘텐츠를 정의하는 데 사용된다.
즉, 웹 페이지의 시각적인 부분을 구성하는 요소들이 <body> 태그 안에 위치하게 된다.
이는 사용자가 브라우저에서 보이는 모든 것을 포함한다.
```

<br />

2. Semantic Tag
```
HTML 시맨틱 태그는 문서의 구조와 의미를 더 명확하게 표현하는 데 사용되는 태그이다.
이러한 시맨틱 태그를 사용하면 웹 페이지의 구조가 더 의미론적으로 명확해지고, 검색 엔진 및 접근성을 개선할 수 있다.

<header> -> 문서 또는 섹션의 머리말을 정의한다.
<nav> -> 내비게이션 링크를 정의한다.
<main> -> 문서의 주요 콘텐츠를 정의한다.
<article> -> 문서의 독립적인 콘텐츠를 정의한다.
<section> -> 문서의 섹션을 정의한다.
<aside> -> 사이드바 콘텐츠를 정의한다.
<footer> -> 문서 또는 섹션의 바닥글을 정의한다.

이러한 시맨틱 태그를 사용하면 웹 페이지의 구조를 더 명확하게 표현할 수 있으며,
검색 엔진이 페이지의 내용을 더 잘 이해할 수 있다.
또한 스크린 리더와 같은 보조 기술을 사용하는 사용자에게도 페이지를 이해하기 쉽게 만들어 준다.
```

<br />

3. HTML 구조 예시
```

기본 HTML 틀 위에 시멘틱 태그를 사용하여 구조를 잡은 모습이다.

```
```html
<!DOCTYPE html>
<html lang="ko">
  <!- head ->
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML</title>
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
  </body>
  <!- body end ->
</html>
```

<br /><br /><br />

* CSS
```
CSS는 Cascading Style Sheets의 약자로,
웹 페이지의 디자인과 레이아웃을 정의하기 위한 스타일 시트 언어이다.
HTML이 웹 페이지의 구조를 정의하는 데 사용되는 반면, CSS는 그 구조에 스타일을 적용하여 시각적인 디자인을 만든다.
CSS를 사용하면 텍스트의 색상, 폰트, 크기, 배치, 여백 등을 제어할 수 있다.
또한 CSS를 사용하여 배경 이미지, 그림자 효과, 애니메이션 등의 요소도 추가할 수 있다.
```

<br /><br />

* CSS 적용
```
HTML에 CSS를 적용하는 방법은 크게 3가지가 있다.
예시를 보면서 알아보자.
```

<br />

1. Inline CSS
```
HTML 태그에 Inline 방식으로 직접 적용하는 것을 말한다.
```
```html
<div style="color: red; font-size: 16px;">이 텍스트는 빨간색이고 글꼴 크기는 16px입니다.</div>
```

<br />

2. Internal CSS
```
HTML 문서 내에 <style> 태그를 사용하여 CSS를 포함시키는 것을 말한다.
```
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Internal CSS</title>
  <style>
    p {
      color: blue;
      font-size: 14px;
    }
  </style>
</head>
```

<br />

3. External CSS
```
외부 CSS 파일을 HTML 문서에 링크하여 사용하는 것을 말한다.
```
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>External CSS</title>
  <link rel="stylesheet" href="styles.css">
</head>
```
```css
/* styles.css */
p {
  color: green;
  font-size: 18px;
}
```

<br /><br /><br />

* 요청한 페이지를 렌더링하는 방법(IT 배경지식)
```
렌더링(Rendering)은 웹 애플리케이션에서 페이지를 화면에 표시하는 과정을 말한다.
이 과정은 크게 두 가지 방식으로 나눌 수 있다.
```

<br /><br />

1. Server-Side Rendering(SSR)
```
서버 측 렌더링은 서버에서 완전한 HTML 페이지를 생성하고 클라이언트에게 전송하는 방식이다.
서버에서는 요청된 페이지의 HTML을 동적으로 생성하고,
클라이언트는 받은 HTML을 브라우저에 렌더링하여 사용자에게 보여준다.
SSR은 초기 로딩 속도가 빠르고 검색 엔진 최적화(SEO)에 유리한 장점이 있다.
```

<br />

2. Client-Side Rendering(CSR)
```
클라이언트 측 렌더링은 클라이언트 측에서 JavaScript를 사용하여 페이지를 동적으로 렌더링하는 방식이다.
클라이언트는 초기에 HTML과 정적 자원을 다운로드하고,
이후에 JavaScript를 사용하여 데이터를 받아와서 페이지를 렌더링한다.
CSR은 사용자 경험을 향상시키고 SPA(Single Page Application)를 구축하는 데 유용하지만,
초기 로딩 속도와 SEO에 대한 고려가 필요하다.
```

<br /><br /><br />

* 숙제 1
```
1. HTML 파일을 만들어 두 개의 div 요소를 만든다.
2. CSS를 사용하여 첫번째 div는 solid, 1px, 색상은 red로 만들고
   두번째 div는 나머지는 같고 색상만 blue로 만든다.
   (CSS파일은 별도로 만들고 HTML에서 link태그를 사용해 불러온다.)
3. div 요소를 나란히 배치한다.

* 밑에는 정답 이미지이다.
```

<br />

<img src="" />
