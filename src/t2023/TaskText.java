//https://javarush.com/groups/posts/mnogomernye-massivy#%D0%94%D0%B2%D1%83%D0%BC%D0%B5%D1%80%D0%BD%D1%8B%D0%B5-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D1%8B
//https://javarush.com/quests/lectures/questsyntaxpro.level23.lecture08

/*
compareTo(String anotherString) - лексиграфическое сравнение строк;
compareToIgnoreCase(String str) - лексиграфическое сравнение строк без учета регистра символов;
regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) - тест на идентичность участков строк, можно указать учет регистра символов;
regionMatches(int toffset, String other, int ooffset, int len) - тест на идентичность участков строк;
concat(String str) - возвращает соединение двух строк;
contains(CharSequence s) - проверяет, входит ли указанная последовательность символов в строку;
endsWith(String suffix) - проверяет завершается ли строка указанным суффиксом;
startsWith(String prefix) - проверяет, начинается ли строка с указанного префикса;
startsWith(String prefix, int toffset) - проверяет, начинается ли строка в указанной позиции с указанного префикса;
equals(Object anObject) - проверяет идентична ли строка указанному объекту;
getBytes() - возвращает байтовое представление строки;
getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) - возвращает символьное представление участка строки;
hashCode() - хеш код строки;
indexOf(int ch) - поиск первого вхождения символа в строке;
indexOf(int ch, int fromIndex) - поиск первого вхождения символа в строке с указанной позиции;
indexOf(String str) - поиск первого вхождения указанной подстроки;
indexOf(String str, int fromIndex) - поиск первого вхождения указанной подстроки с указанной позиции;
lastIndexOf(int ch) - поиск последнего входения символа;
lastIndexOf(int ch, int fromIndex) - поиск последнего входения символа с указанной позиции;
lastIndexOf(String str) - поиск последнего вхождения строки;
lastIndexOf(String str, int fromIndex) - поиск последнего вхождения строки с указанной позиции;
replace(char oldChar, char newChar) - замена в строке одного символа на другой;
replace(CharSequence target, CharSequence replacement) - замена одной подстроки другой;
substring(int beginIndex, int endIndex) - возвратить подстроку как строку;
toLowerCase() - преобразовать строку в нижний регистр;
toLowerCase(Locale locale) - преобразовать строку в нижний регистр, используя указанную локализацию;
toUpperCase() - преобразовать строку в верхний регистр;
toUpperCase(Locale locale) - преобразовать строку в верхний регистр, используя указанную локализацию;
trim() - отсечь на концах строки пустые символы;
valueOf(a) - статические методы преобразования различных типов в строку.


Методы поиска возвращают индекс вхождения или -1 если искомое не найдено. Методы преобразования как replace не изменяют саму строку а возвращают соответствующий новый объект строки.


    методы с регулярными выражениями


Строки также имеют ряд методов использующие регулярные выражения:

matches(String regex) - удовлетворяет ли строка указанному регулярному выражению;
replaceAll(String regex, String rplс) - заменяет все вхождения строк, удовлетворяющих регулярному выражению, указанной строкой;
replaceFirst(String regex, String rplс) - заменяет первое вхождение строки, удовлетворяющей регулярному выражению, указанной строкой;
split(String regex) - разбивает строку на части, границами разбиения являются вхождения строк, удовлетворяющих регулярному выражению;
split(String regex, int limit) - аналогично предыдущему, но с ограничением применения регулярного выражения к строке значением limit. Если limit>0, то и размер возвращаемого массива строк не будет больше limit. Если limit<=0, то регулярное выражение применяется к строке неограниченное число раз.
*/
