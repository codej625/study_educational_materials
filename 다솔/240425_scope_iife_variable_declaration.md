# 스터디 주제 "Scope", "IIFE", "변수 선언(let, const, var)"

<br /><br />

* 스코프(Scope)
```
자바스크립트에서 "scope(스코프)"는 변수와 함수의 유효 범위를 나타낸다.
스코프는 코드에서 해당 변수 또는 함수가 접근 가능한지를 결정한다.
이는 변수 및 함수의 가시성과 생존 기간을 제어하고 변수 이름 충돌을 방지한다.
```

<br /><br />

1. 전역 스코프(Global Scope)
```javascript
/* 전역 스코프에서 선언된 변수 */
const globalVariable = 'I am in the global scope';

function globalFunction() {
  /* 전역 스코프에서 선언된 함수 */
  console.log('This is a function in the global scope');
}

/* 전역 스코프 내의 변수 및 함수에 접근 가능 */
console.log(globalVariable); /* 'I am in the global scope' */
globalFunction(); /* 'This is a function in the global scope' */
```

<br />

2. 지역 스코프(Local Scope)
```javascript
function localFunction() {
  /* { ... } 로컬 스코프 내에서만 유효한 변수 */
  const localVariable = 'I am in the local scope';

  console.log(localVariable); /* 'I am in the local scope' */
}

/* 함수 외부에서는 로컬 스코프 내의 변수에 접근할 수 없음 */
console.log(localVariable); /* error */

```

<br />

3. 블록 스코프(Block Scope)
```javascript
{
  /* 블록 내에서 선언된 변수 */
  let blockScopedVariable = 'I am in the block scope';
  const constantInBlockScope = 'I am a constant in the block scope';

  console.log(blockScopedVariable); /* 'I am in the block scope' */
  console.log(constantInBlockScope); /* 'I am a constant in the block scope' */
}

/* 블록 외부에서는 블록 스코프 내의 변수에 접근할 수 없음 */
console.log(blockScopedVariable); /* error */
console.log(constantInBlockScope); /* error */

```

<br /><br /><br />

* IIFE
```
IIFE(Immediately Invoked Function Expression)는 자바스크립트에서 사용되는 일종의 함수 패턴이다.
이 패턴은 함수를 정의하고 즉시 실행하는 것을 의미한다.
이를 통해 함수의 스코프를 제어하고 전역 네임스페이스를 깔끔하게 유지할 수 있다.

여기서 주의할 점은 IIFE 내부의 함수는 외부에서 접근할 수 없다는 것이다.
이는 IIFE가 즉시 실행되면서 해당 함수의 스코프가 사라지기 때문이다.
이러한 특성은 전역 스코프를 오염시키지 않고 임시 변수를 만들거나 프라이빗 변수를 만들 때 유용하다.
```

<br /><br />

1. 문법
```javascript
(function() {
  /* ... */
})();

or

(() => {
  /* ... */
})();
```

<br />

2. 예시
```javascript
const module = (function() {
  const privateVariable = 'I am private';

  function privateFunction() {
    console.log('This is a private function');
  }

  return {
    publicFunction: function() {
      console.log('This is a public function');
    },
    accessPrivate: function() {
      console.log(privateVariable);
      privateFunction();
    }
  };
})();

module.publicFunction(); /* This is a public function */
module.accessPrivate(); /* I am private */
                        /* This is a private function */
```

<br /><br /><br />

* 변수 선언 키워드
```
`let`, `const`, `var`는 모두 변수를 선언하는 데 사용되는 키워드이지만 각각의 특징이 조금씩 다르다.

1) var
- 함수 스코프(Function scope): 변수가 선언된 함수 내에서만 유효.
- 호이스팅(Hoisting): 변수 선언이 함수나 전역 스코프의 맨 위로 끌어올려진다.
- 중복 선언 가능: 동일한 이름의 변수를 여러 번 선언할 수 있다.
- 재할당 가능: 값을 다시 할당할 수 있다.
- 사용 지양: 호이스팅과 중복 선언 가능성으로 인해 사용을 지양하는 추세이다.

2) let
- 블록 스코프(Block scope): 변수가 선언된 블록 내에서만 유효.
- 호이스팅: 선언은 호이스팅되지만 초기화는 호이스팅되지 않는다. 즉, 변수가 선언되기 전에 접근하면 ReferenceError가 발생한다.
- 중복 선언 불가능: 동일한 이름의 변수를 한 번만 선언할 수 있다.
- 재할당 가능: 값을 다시 할당할 수 있다.

3) const
- 블록 스코프(Block scope): 변수가 선언된 블록 내에서만 유효.
- 호이스팅: 선언은 호이스팅되지만 초기화는 호이스팅되지 않는다. 즉, 변수가 선언되기 전에 접근하면 ReferenceError가 발생한다.
- 상수화(Constant): 한 번 선언되면 값을 다시 할당할 수 없다. 단, 객체와 배열 같은 참조 타입의 경우 변수가 가리키는 값의 내용은 변경할 수 있다.

* 세 줄 요약
`var`는 함수 스코프를 가지며 호이스팅에 취약하고 중복 선언 및 재할당이 가능
`let`과 `const`는 블록 스코프를 가지며 호이스팅은 하되 초기화가 호이스팅 X
`let`은 중복 선언이 불가능하고 재할당이 가능, `const`는 중복 선언과 재할당이 모두 불가능
```
