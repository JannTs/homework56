package our_interfaces;
/**
 *  Используя наши интерфейсы написать такие лямбда-выражения:
 *     1. Конкатенировать числа  a  и  b
 *            пример  1 и 2 -> 12
 *      2. Если длина строки  = 3  вернуть true  иначе false
 *      3. Если длина строки четная  вернуть true  иначе false
 *      4. Вернуть строку в верхнем регистре
 *      5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
 *      6. Распечатать строку в виде !строка!
 *      7. возвращает  "Hello World"
 */

public class Main {

    public static void main(String[] args) {
        Printable toConsole = Utils.toConsole();
        String strDelimiter = Utils.delimiterLine();
        String task = Utils.task();
        Incrementable incrementable = Utils.incrementable();

        // 1. Конкатенировaть числа a  и  b
    // пример 1 и 2 -> 12

    Concatable concatNums = (a, b) -> Integer.toString(a) + b;

    toConsole.print("1 и 2 => " + concatNums.concat(1,2));

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

     // 2. Если длина строки  = 3  вернуть true  иначе false
    Checkable boolCheck2 = str -> str.length() == 3;

    String strABC2 = "abc";
    boolean boolResult2 = boolCheck2.check(strABC2);
    toConsole.print("\""+strABC2+"\"" + " => " + boolResult2);
    String strABC2_ = "able";
    boolean boolResult2_ = boolCheck2.check(strABC2_);
    toConsole.print("\""+strABC2_+"\"" + " => " + boolResult2_);

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    // 3. Если длина строки четная  вернуть true  иначе false
    Checkable isEven = str -> str.length() % 2 == 0;

    boolean boolResult3 = isEven.check("hello");
    boolean boolResult3_ = isEven.check("Hello  World");
    toConsole.print("\"hello\" => " + boolResult3);
    toConsole.print("\"Hello  World\" => "+ boolResult3_);

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    // 4. Вернуть строку в верхнем регистре
    Transformable strToUpperCase = str -> str.toUpperCase();

    String strResult4 = strToUpperCase.modify("world");
    toConsole.print("\"world\" => " + strResult4);

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    // 5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
    Transformable ifLenght4SwapWithAsterisks = str ->  (str.length() == 4) ? "****" : str;

    String strResult5 = ifLenght4SwapWithAsterisks.modify("Hello");
    String strResult5_ = ifLenght4SwapWithAsterisks.modify("Hell");
    toConsole.print("\"Hello\" => "+ strResult5);
    toConsole.print("\"Hell\" => "+ strResult5_);

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    //6. Распечатать строку в виде !строка!
    Transformable wrapItUpInAnExclamation  = str -> "!".concat(str).concat("!");

    String strString6 = "string";
    toConsole.print(strString6 + " => " + wrapItUpInAnExclamation.modify(strString6));

        toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    //7. возвращает  "Hello World"
    Productable strHelloWorld = () -> "Hello World";
    toConsole.print("Hello World => " + strHelloWorld.produce());

    toConsole.print(strDelimiter + "End of "+ task + incrementable.inc());

    }
}