# 연습문제

Stream API와 여러 개념들(함수형 인터페이스, 람다, 메서드 참조 등)을 실습해봅시다. for, while, for-each 반복문 사용 금지입니다.
정답은 answers 패키지에 있습니다.

<br>

## 문제 1

사칙 연산을 위한 Operator Enum을 만들려고 합니다. 다음과 같은 요구사항을 충족해보세요.

* 다음과 같은 메서드를 구현해야 하며, Operator별로 number1과 number2를 정상적으로 연산해야합니다.
    * ``public static Operator findOperator(String inputOperator)``
    * ``public int calculate(int number1, number2)``
* 입력받은 문자열이 연산자 기호 문자열(+ - * /)에 부합하지 않은 경우 IF 조건문을 사용하지 않고 IllegalArgumentException 호출하세요.  

<br>

## 문제 2

HairDresser의 ``public Map<HairColor, Long> countHumansByHairColor(List<Human> humans)`` 메서드는 입력받은 사람들 개개인에 대해 먼저 염색을 진행하여 머리 색상을 변경한 다음, 각 머리 색상별로 사람들의 개수를 세서 Map으로 반환하고자 합니다. 그런데 미용사가 다소 청개구리인데요.

결과 Map을 집계할 때 **검은 머리** Key에는 **노란색 머리 사람의 수** Value를 담고 **노란색 머리** Key에는 반대로 **검은색 머리 사람의 수** Value를 담아 반환하려고 합니다.

* 다음과 같은 요구사항을 준수해야합니다.
  * 결과로 반환되는 Map은 EnumMap을 사용해야 합니다.
  * 분류기는 복잡한 람다보다는 별도의 메서드 참조로 분리해보세요.
  * 특정 색상의 머리를 가진 사람이 없다면 해당 머리 색상의 Value는 0이 되어야합니다.

<br>

## 문제 3

CharacterParser의 ``public static String parseString(String target)``를 완성하세요.

* target 파라미터 문자열이 "숫자 문자"로만 이루어진 경우 "allDigit"을 반환합니다.
* target 파라미터 문자열이 "알파벳 문자"로만 이루어진 경우 "allAlphabetic"을 반환합니다.
* Stream API와 Java API만을 사용해서 코드를 작성해보세요. 특히 람다식이 없이 메서드 참조만으로도 가능!  
* 그 외의 경우는 예외 발생 혹은 null 반환 고우..!

<br>

## 문제 4

멀티레벵 그룹핑을 학습해봅시다. todo
