# 스터디 주제 "Array의 Method 친구들 🐶🐱🐰"

<br /><br />

* Array의 Method?
```
Javascript의 Array는 string, number, bigint, boolean, undefined, symbol, null과는 다르게
Primitive type(원시 타입)이 아닌 Referece type(참조 타입)으로 객체(Object)를 뜻한다.

객체(Array) 속에는 수많은 내장 함수들이 method로서 존재하는데,
이러한 method 들은 개발 과정을 간소화하고 코드를 더 간결하게 만들어 준다.
매우 유용하고 자주 쓰이는 map(), filter(), concat(), slice()등 여러 가지 Array method를 알아보자.
```

<br /><br />

1. map() 반복 -> 배열의 각 요소에 대해 주어진 함수를 호출하고, 그 함수가 반환하는 값을 모아서 새로운 배열을 생성한다. 
```javascript
/* 각 요소의 제곱을 계산하여 새로운 배열을 생성하는 예제 */
const numbers = [1, 2, 3, 4, 5];
const squaredNumbers = numbers.map(function(num) {
  return num * num;
});
console.log(squaredNumbers); /* [1, 4, 9, 16, 25] */

// 각 문자열의 길이를 계산하여 새로운 배열을 생성하는 예제
const words = ["apple", "banana", "orange", "strawberry", "kiwi"];
const wordLengths = words.map(function(word) {
  return word.length;
});
console.log(wordLengths); /* [5, 6, 6, 10, 4] */
```

<br />

2. filter() 걸러내기(삭제) -> 주어진 함수의 조건을 만족하는 요소들로 이루어진 새로운 배열을 생성한다.
```javascript
/* 숫자 배열에서 짝수만 필터링하는 예제 */
const numbers = [1, 2, 3, 4, 5, 6];
const evenNumbers = numbers.filter(function(num) {
  return num % 2 === 0;
});
console.log(evenNumbers); /* 2, 4, 6 */

/* 문자열 배열에서 길이가 5 이상인 문자열만 필터링하는 예제 */
const words = ["apple", "banana", "orange", "strawberry", "kiwi"];
const longWords = words.filter(function(word) {
  return word.length >= 5;
});
console.log(longWords); /* ["banana", "orange", "strawberry"] */
```

<br />

3. slice() 잘라내기 -> 추출을 시작할 인덱스와 종료할 인덱스를 넣어 배열을 잘라낸다. (종료 인덱스는 포함하지 않음.)
```javascript
const array = [1, 2, 3, 4, 5];
const newArray = array.slice(1, 4);
console.log(newArray); /* 2, 3, 4 */

const array = [1, 2, 3, 4, 5];
const newArray = array.slice(-3);
console.log(newArray); /* 3, 4, 5 */
```

<br />

4. concat() 추가 -> 배열의 요소를 결합하여 새로운 배열을 반환한다.
```javascript
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const result = arr1.concat(arr2);
console.log(result); /* [1, 2, 3, 4, 5, 6 */

/* 여러 개의 배열을 결합하는 예제 */
const arr3 = [7, 8, 9];
const result = arr1.concat(arr2, arr3);
console.log(result); /* 1, 2, 3, 4, 5, 6, 7, 8, 9 */
```

<br /><br /><br />

* 리액트에서 map 외에 다른 반복문을 사용하지 않는 이유?

<br /><br />

1. React의 Virtual DOM의 작동 방식
```
Virtual DOM은 이전 상태와 새로운 상태의 차이를 최소화하여 변경 사항만을 업데이트하는 방식으로 동작한다.
이를 위해 React는 각 요소에 고유한 key 값을 할당하여 변경되지 않은 요소는 이전의 상태를 그대로 유지하면서, 변경된 요소만 업데이트한다.

for 문은 반복하면서 생성되는 요소들에 대한 고유한 key 값을 가지지 않는다.
따라서 for 문을 사용하여 배열을 처리할 경우, Virtual DOM에서 요소를 업데이트할 때 올바르게 처리되지 않을 수 있다.

예를 들어, 배열 요소를 추가하거나 삭제할 때 발생하는 인덱스 변경 등으로 인해 변경 사항이 정확하게 반영되지 않을 수 있다.
반면에 map() 메서드는 배열의 각 요소에 대해 새로운 배열을 반환하며,
이 새로운 배열은 각 요소에 고유한 key 값을 부여할 수 있다.

이렇게 key 값이 할당되면 Virtual DOM에서 각 요소를 정확하게 추적할 수 있으며,
변경된 요소만을 업데이트하여 최적화된 렌더링을 할 수 있다.
```

<br />

2. React에서 key 값을 부여할 때, index를 사용하지 않도록 하자.
```
리액트에서 map() 메서드를 사용하여 반복 처리를 할 때,
보통 배열의 각 요소에 고유한 식별자를 부여하는 것이 좋다.

이유는 다음과 같다.

1) 성능 이슈
배열의 인덱스를 사용하면 동일한 인덱스에 대해 컴포넌트 키가 변경되지 않는다.
이는 리액트가 컴포넌트를 효율적으로 재사용하는 데 방해가 될 수 있다.

2) 컴포넌트 추적 문제
배열이 변경될 때 인덱스를 키로 사용하면 리액트가 컴포넌트를 제대로 추적하지 못할 수 있다.
예를 들어, 요소를 추가하거나 제거할 때 인덱스가 변경되는데, 이로 인해 리액트가 잘못된 컴포넌트를 업데이트할 수 있다.

3) 유지보수의 어려움
인덱스를 사용하여 키를 부여하면 코드를 이해하기 어려워질 수 있다.
특히 배열의 순서가 변경될 때 혼동을 야기할 수 있다.
```
