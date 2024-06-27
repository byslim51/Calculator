import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class base {
    public static void main(String[] args) {


//        Информация по пунктам:
//      1) System.out.print/println.
//      2) Переменные, основные типы переменных.
//      3) Получение данных от пользователя (Scanner).
//      4) Условные конструкций (if, else, else-if, switch-case).
//      5) Циклы и операторы в них (For, While, Do while).
//      6) Обычные массивы, многомерный массивы.
//      6) Коллекций Java, основные коллекций.
//      8) ООП.
//      8.2) (ООП) Создание классов и объектов.
//      8.3) (ООП) Конструкторы класса.



// ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//      1)   System.out.print/println:
//         System.out.println(); - это метод для вывода текста или значения переменной на консоль с последующим переводом строки.
//         System.out.print(); - тоже самое как println но без перевода на следующую строку.
//

//   ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//      2)   Переменные, основные типы переменные:
//         Переменные - это как ячейки памяти в которую мы должны занести информацию что бы в дальнейшем ею пользоваться.
//         Основные типы переменных:
//        Целые числа:
//      byte - предназначен для хранения целых чисел. Диапазон чисел от -128 до 127, если число будет большим 127 или меньшим -128 , то выдастся ошибка;
//      short - предназначен для хранения целых чисел. Диапазон чисел от -32768 до 32767;
//      int - предназначен для хранения целых чисел. Диапазон чисел от -2147483648 до 2147483647;
//      long - предназначен для хранения целых чисел. Диапазон чисел от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807.
//        Числа с точкой:
//      float - для создания чисел с плавающей точкой. Диапазон чисел от от -3.4*1038 до 3.4*1038;
//      double - для создания чисел с плавающей точкой. Диапазон чисел от от ±4.9*10-324 до ±1.8*10308.
//        Прочие типы данных:
//      bool - логический тип данных. Предназначен для записи истинного (true) или ложного (false) значения;
//      char - тип данных для работы с символами. Позволяет поместить в одинарных кавычках какой-либо символ;
//      String - тип данных для текста. В двойных кавычках можно сохранить одно или множество слов.

//         Для создания переменной необходимо указать тип данных и её название. Также можно сразу же добавить к ней значение:
//       int a = 0; - Добавление значения сразу
//       byte c; - Создание переменной без значения
//       short b, y = 342; - Создание нескольких переменных

//        Пример:
        byte age = 24;
        byte age2 = 26
        System.out.println(age + age2);
        Вывод:
        50

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//       3)  Получение данных от пользователя (Scanner):
//        Scanner - Отвечает за ввод данных с клавиатуры. Для начало работы нужно его импортировать
//        Для того что бы импортировать Scanner, нужно прописать команду: import java.util.Scanner; либо при вводе Scanner нажать на Tab.
//        После импорта Scanner нужно создать (экземпляр) класса Scanner:
//        Scanner some_name = new Scanner(System.in); - Создаем объект с именем some_name
//        Далее что бы получить данные от пользователя мы используем метод класса:
//        int val = some_name.nextInt(); - Val название переменной в которой будет храниться данные связанные с типом переменной.
//        Если мы хотим получить не число, а строку или число с плавающей точкой, то необходимо использовать другие методы:
//      nextLine () - для ввода строки. Возвращаемый тип данных String;
//      nextInt () - для ввода целых чисел. Возвращаемый тип данных int;
//      nextFloat () - для ввода чисел с плавающей точкой. Возвращаемый тип данных float;
//      nextDouble () - для ввода больших чисел с плавающей точкой. Возвращаемый тип double.
//
//        Пример:
//       Мы хотим получить от пользователя его Имя и Возраст, далее вывести это все на экран:
       import java.util.Scanner  // Импортируем Сканер для его работы.
        Scanner scan = new Scanner(System.in); // Создаем новый экземпляр класса сканер под название "scan"
        System.out.print("Введите ваше имя:"); // Просим пользователя ввести его имя.
        String name = scan.nextLine(); // Закрепляем введенное имя за переменной name.
        System.out.print("Введите ваш возраст:"); // Повторяем тоже самое с возрастом.
        byte age = scan.nextByte();
        System.out.print("Ваше имя:" + name + "."); // Выводим имя и возраст пользователя на его экран:
        System.out.print("Ваш возраст: " + age + ".");

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//        4) Условные конструкций (if, else, else-if, switch-case):
//      За счёт if else можно проверить одно или несколько условий и в случае их успешной проверки будет выполнен один, иначе другой.

        Пример:
        int a = 2, b = 10;
        if (a == b) { // Если a будет равным b, тогда будет выполнен код
            // Здесь код который будет выполнен
            // Если только одна строка кода, то фигурные скобки {} можно не ставить
        } else if (a <= b) { // Если а будет меньшим или равным b
            // Если предыдущее условие не будет выполнено, а здесь условие окажется верным, то будет выполнен этот код
        } else {
            // Этот код сработает, если другие условия не будет выполнено
        }

//        Конструкция switch-case:
//       Конструкция case обладает более удобным форматом для проверки множественных условий на совпадение значения...
//       ... В конструкцию записывается переменная, что проверяется, а также значения на которые происходит проверка.
//       После case каждый раз пишеться команда "break;", что означает что это конец проверки.

//        Пример:
        Scanner scan = new Scanner(System.in); // Создаем новый класс сканера
        System.out.print("Введите первое число:"); // Просим пользователя ввести первое число
        int num1 = scan.nextInt(); // Введенное первое число закрепляем за переменной num1

        System.out.print("Введите второе число:"); // Просим ввести второе число
        int num2 = scan.nextInt(); // Аналогично закрепляем его за переменной num2

        int res; // Создаем новую переменную, в которую будет записываться результат сложений.

        System.out.print("Введите действие:"); // Просим пользователя ввести действие которое будет применено к цифрам (/,+,-,*)
        String action = scan.next(); // Закрепляем введенное действие пользователя за переменной action

        switch (action) { // Создаем switch которая будет проверять переменную action.
            case "+":  // Если введенное дейсвтие (символ) в переменной action будет "+", то выполниться этот код:
                res = num1 + num2; // Переменной res будет являться сложение между 1 цифрой и 2 цифрой введенной пользователем.
                System.out.print("Итог:" + res); // На экран ввыводиться итог сложений:
                break; // Заканчиваем действие при положительной проверке.

            case "-": // Если введенное дейсвтие (символ) в переменной action будет "-", то выполниться этот код:
                res = num1 - num2;
                System.out.print("Итог:" + res);
                break;

            case "*": // Если введенное дейсвтие (символ) в переменной action будет "*", то выполниться этот код:
                res = num1 * num2;
                System.out.print("Итог:" + res);
                break;

            case "/": // Если введенное дейсвтие (символ) в переменной action будет "/", то выполниться этот код:
                if (num2 == 0) // Добавляем исключение, так как пользователь может ввести цифру которая нарушает законы математики.
                    System.out.print("Error"); // Будет писаться если пользователь на 2 цифру выбрал 0.
                else { // Если пользователь выбрал правильное, не ошибочное число то код продолжается:
                    res = num1 / num2;
                    System.out.print("Итог:" + res);
                }
                break;
            default: // Если пользователь введет другие символы вместо цифор, то выведеться данная ошибка:
                System.out.print("Вы ввели что то неправильное.");

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//               5) Циклы и операторы в них (For, While, Do while):
//                Цикл — это конструкция, которая позволяет многократно выполнять один и тот же участок кода.
//                Виды цикл:
//              Цикл For:
//            В цикле for все условия записываются в одном месте, что очень удобно во многих случаях.
//
//            Пример:
                for (int i = 0; i < 10; i++) // Создаем цикл (For), 1) внутрий скобках создаем переменную i, далее указываем этой переменной нужное число.
                    // 2) Далее указываем условие, конкретнее до каких пор будет выполняться цикл. У нас цикл будет работать пока i меньше 10, если
                    // i станет больше или равно 10, например 11, то цикл прекращается и перестает работать. 3) Дальше указываем каким образом переменное
                    // будет изменяться, к примеру i++, увелечивает число i на еденицу до момента пока она не станет 10 или больше. Также можно писать
                    // i /= "число на которое будете делить", i*= "число на которое будете умножать" и тд.
                    System.out.println(i);

//                 Цикл While:
//                Суть цикла while не особо отличается от цикла for. Единственное отличие заключается в способе записи цикла.
//               В while необходимо прописать лишь условие, а все остальные параметры записываются вне цикла.
//
//               Пример:
                int i = 1; // Создание переменной
                while (i <= 10) { // Здесь только условие
                    System.out.println(i);
                    i++; // Увеличение переменной
                }

//               Цикл Do While:
//              Цикл схож с циклом while по форме написания, но при этом работает немного по-другому.
//              Цикл do..while будет выполнен один раз сто процентов, а дальше проверит условие и если оно верно, то цикл будет выполняться дальше.
//
//              Пример:
                int x = 13; // Указали значение переменной как 13.
                do
                { // Данный цикл выполниться 1 раз, так сам цикл неверный, но из за того что это Do While, он выполниться 1 раз.
                    x--;
                    System.out.println(x);
                } while (x > 10); // Значение переменной уже 13, и оно больше чем 10, а что бы цикл работал нужно что бы x была меньше 10,
                // и она работала бы пока цифра x не привысила или не была равна 10. Из за этого цикл не правильный

//             Как видно из примера, цикл изначально неверный, но это не мешает ему сработать один раз.

//             Операторы для работы в циклах:
//           Оператор break - служит для выхода/остановку из цикла полностью;
//           Оператор return - выполняет ту же функцию, что и оператор break, но  для циклов лучше использовать break;
//           Оператор continue - пропускает лишь одну итерацию и не выходит/останавливает из цикла.

//                ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//               6) Массивы данных. Одномерные и многомерные массивы:
//              Одномерный массив состоит из нескольких элементов, объединенных под одним именем. Что то типа переменных но они могут хранить больше информаций.
//              Чтобы создать массив необходимо указать тип данных, поставить квадратные скобки и назвать массив.
//              Это очень схоже с созданием обычных переменных, но здесь после типа данных идут еще квадратные скобки.

//              Пример:
//              Создание пустых массивов:
                char[] stroka; // Создание пустого массива
                int numbers[]; // Не будет считаться ошибкой

//              Создание массивов:
                int[] nums = new int[4]; // Выбираем тип массива (int,String,byte,double и тд), далее выбираем название массива и выделяем память данному массиву.
//               Дальше в последних скобках указываем сколько элементов будет храниться в массиве:

//               Добавление элементов в массив:
//               По очередно:
                int[] nums = new int[3];
                nums[0] = 1;
                nums[1] = 2;
                nums[2] = 3;

//               Все значение сразу в одной строке:
                int[] nums = new int[]{1, 2, 3, 4};

//             Для массивов существует несколько дополнительных методов, что позволяют проводить действия над массивом.
//             Рассмотрим несколько из них:
//             length - возвращает нам длину ВСЕГО массива. То есть, если в массиве есть 4 элемента и вы введете в цикл: название массива.length, то после
//            написсав команду System.out.print(название массива) выйдут на экран все элементы в массиве.
//             Arrays.copyOf - копирует один массив в другой.
//
//             Пример:
                int[] arr = new int[]{1, 2, 3, 5}; // Создаем первый массив.
                int[] some_new = Arrays.copyOf(arr, arr.length); // Перекидываем данные 1 массива во второй, другими словами копируем.

//               Работа с циклами и массивами:
//              Для удобного вывода информацией из массива используется циклы. Зачастую это цикл for (он самый удобный цикл для массива)

//               Пример:
                float[] nums2 = new float[]{5.0f, 6.45f, 89.984f}; // Создаем массив и указываем какие элементы будут в данном массиве
                for (int i = 0; i < nums2.length; i++) {   // Создаем цикл, с использованием допальнительного метода length (возврат длинный всего массива)
                    System.out.println("Element: " + nums2[i]); // Выводим на экран Element: название массива и цикла.
                }
//               Вывод:
//                 Element: 5.0
//                 Element: 6.45
//                 Element: 89.984

//               Практическое применение массиву:
                int[] arr = new int[4]; // Мы создаем массив, который может хранить 4 числа. Представьте себе коробку с 4 отделениями для чисел.
                Scanner scan = new Scanner(System.in); // Мы создаем инструмент (сканер), который будет считывать числа, введенные пользователем с клавиатуры.

                for (int i = 0; i < arr.length; i++) {    // Мы создаем цикл, который повторяется 4 раза (потому что наш массив длиной 4).
                    System.out.println("Введите число:"); // Каждый раз в цикле мы просим пользователя ввести число.
                    int value = scan.nextInt(); //  Пользователь вводит число
                    arr[i] = value; // И оно сохраняется в массив на текущую позицию.
                }

                int min = arr[0]; // Мы берем первое число из массива и говорим, что это пока наше минимальное число.
                for (int i = 0; i < arr.length; i++) {   // Мы снова проходим по всем числам в массиве.
                    if (arr[i] < min) // Если находим число, которое меньше текущего минимального значения, обновляем минимальное значение.
                        min = arr[i];
                }
                System.out.println("Minimal: " + min); // Мы выводим на экран самое маленькое число, которое ввел пользователь.
        }
        // В итоге мы получили код, который принимает от пользователя 4 элемента для массива, после высчитываем какой из них самый маленький
        //       и выводит его на экран.

//              Многомерный массив – массив, в котором каждый элемент является другим массивом.
//              Для создания двумерных массивов необходимо использовать двойные квадратные скобки после типа данных.
//              Выглядит такой массив как матрица, а записывается следующим образом:
        int[][] x = {{0, 34, 2}, {3, 4, 5}};
//               Мы видим, что элементы первого массива являются другими массивами.
//               Чтобы выбрать какой-либо объект используйте ту же структуру что и для одномерных массивов,
//               вот только теперь указывайте индекс как первого массива, так и второго:
        x[0][1] = 1; // Вместо 34 теперь будет 1

//      ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//                7) Коллекций Java, основные коллекций:
//                  Коллекций - помогают нам создавать что то в духе массив данных,только большем количеством функций.
//                  Или же коллекции можно использовать для хранения списков, множеств, словарей и других структур данных.
//                  Основные типы коллекций в Java:
//
//                  List (Список): Хранит элементы в определенном порядке и допускает дублирование элементов.
//                  Классы: ArrayList, LinkedList
//                  Пример: List<String> names = new ArrayList<>();

//                  Set (Множество): Хранит уникальные элементы, без дубликатов.
//                  Классы: HashSet, TreeSet
///                 Пример: Set<String> uniqueNames = new HashSet<>();

//                  Map (Карта или Словарь): Хранит пары "ключ-значение". Ключи (индексы) уникальны, а значения могут повторяться.
//                  Классы: HashMap, TreeMap
///                 Пример: Map<String, Integer> ages = new HashMap<>();

//                 При создании коллекции необходимо указать тип данных, имя, а также выделение памяти:
//                ArrayList<Float> numbers = new ArrayList<>(1);
//                LinkedList<String> names = new LinkedList<>();

//                Для работы с элементами существует  множество методов. Наиболее часто используемые представлены ниже:
//               add() - добавление элемента в конец массива;
//               remove() - удаление элемента из массива по его индексу;
//               clear() - очистка всего массива;
//               size() - получение размера массива (количество элементов);
//               addFirst() - добавление элемента в начало массива;
//               addLast() - добавление элемента в конец;
//               clone() - выполняет клонирование массива;
//               get() - возвращает элемент по индексу;
//               getFirst() - возвращает первый элемент в массиве;
//               getLast() - возвращает последний элемент в массиве;
//               set(index, element) - меняет значение элемента по индексу.

//               Пример:
        ArrayList<Integer> numbers = new ArrayList<>(); // Мы создаем новый список, который будет хранить целые числа...
        // ... Представьте себе список, в который можно добавлять числа.
        numbers.add(1); // Мы кладем число 1 в наш список. Теперь список содержит одно число: [1].
        numbers.add(50); // Мы кладем число 50 в наш список. Теперь список содержит два числа: [1, 50].
        numbers.add(1, 30); //  Мы кладем число 30 в наш список на второе место (индекс 1)...
        // ...Остальные числа смещаются вправо. Теперь список выглядит так: [1, 30, 50].

        System.out.println(numbers.get(1)); // Мы берем число, которое находится на втором месте в нашем списке, и выводим его на экран. В нашем случае это число 30.
//              Итог: На экран выводиться число "30".

//             ArrayList:
//            ArrayList похож на обычный массив, но его размер может изменяться...
//            ... Это как коробка с номерами ячеек, которая автоматически расширяется, когда в ней не хватает места.
//              Когда он хорош:
//           1) Быстрый доступ к элементам: Если нужно быстро получить элемент по его индексу (например, пятый элемент), это очень быстро.
//           2) Лучше подходит для чтения: Если нужно часто читать элементы, ArrayList будет работать быстрее.
//             Пример:
//              1) Быстро узнать имя пятого ученика.
//              2) Хорошо, если список учеников редко меняется.

//              LinkedList:
//             LinkedList - это цепочка элементов, где каждый элемент знает, где находится следующий и предыдущий...
//             ... Представьте себе цепочку из бумажных скрепок, где каждая скрепка (элемент) знает, к какой скрепке она прикреплена.
//               Когда он хорош:
//             1) Быстрое добавление и удаление элементов: Если нужно часто добавлять или удалять элементы в середине списка, это будет быстрее.
//             2) Лучше подходит для изменений: Если нужно часто менять структуру списка (добавлять или удалять элементы), LinkedList будет работать быстрее.
//              Пример:
//             1) Легко вставить нового ученика между вторым и третьим.
//             2) Хорошо, если список учеников часто меняется (новые приходят, старые уходят).


//             8) Функции в языке Джава:
//               Функция в программировании - это как специальная инструкция или задача, которую вы можете написать один раз, а потом использовать много раз. ...
//               ... Она выполняет определенную работу или действие, которое вам нужно повторять в разных частях программы.

//               Примеры из жизни:
//               Давайте представим, что у вас есть специальная машина, которая может делать разные виды работ: стричь траву, подстригать ветки и полоть землю. ...
//               ... Каждая работа - это отдельная функция. ...
//               ... Вы не хотите каждый раз самостоятельно делать эти задачи, поэтому просто запускаете машину с нужной функцией, и она делает работу за вас.

//               Создание ПРОСТОЙ функций:
        Public class Main {   // Класс.

            public static void main(String[] args) {  // Основной метод.
                info();  // Вызов функций "info"

            }

            public static void info() {     // Функция info, которая выводит на экран "Hello!"
                System.out.println("Hello!");
            }
        }
//        Итог: Hello!

//               Создание функций С ПАРАМЕТРОМ:
        public class Main {   // Класс.

            public static void main(String[] args) {  //  Это основной метод, с которого начинается выполнение программы.
                info("Hello");  // Вызываем метод info() и передаем ему строку "Hello" в качестве аргумента.
                String java = "Java";  // Создаем переменную java типа String и присваиваем ей значение "Java".
                info(java); // Вызываем метод info() и передаем ему значение переменной java в качестве аргумента.
                info(""); // Вызываем метод info() с пустой строкой в качестве аргумента.
                // Аргумент — это информация или данные, которые передаются в функцию или метод.

            }

            public static void info(String word) {   // Метод info, который принимает один аргумент типа String
                System.out.print(word); // Выводим аргумент word без перевода строки
                System.out.println("!"); // Выводим восклицательный знак с переводом строки
            }
        }
//           Итог: Hello!
//                 Java!
//                 !

//                Функция с подсчетом данных и использованием более 2 функций:
        public class Main {

            public static void main(String[] args) {
                short num1 = 4; // Объявляем переменную num1 типа short и присваиваем ей значение 4
                summa((short) 5, num1); // Вызываем метод summa с аргументами (5, num1)

                short num2 = 7; // Объявляем переменную num2 типа short и присваиваем ей значение 7
                summa((short) 3, num2); // Вызываем метод summa с аргументами (3, num2)
            }

            // Метод summa, который складывает два числа типа short и выводит результат
            public static void summa(short a, short b) {
                int res = a + b; // Складываем числа a и b и сохраняем результат в переменной res типа int
                String result = "Результат:" + res; // Создаем строку, содержащую текст "Результат: " и значение res
                info(result); // Вызываем метод info и передаем ему строку result в качестве аргумента
            }

            // Метод info, который выводит переданную ему строку на экран с восклицательным знаком
            public static void info(String word) {
                System.out.println(word); // Выводим строку word на экран
                System.out.println("!"); // Выводим восклицательный знак на следующей строке
            }
        }
//         Итог: Результат: 9
//               !
//               Результат: 10
//               !

//        Функция С ВОЗВРАЩЕНИЕМ ДАННЫХ:
        public class Main {

            public static void main(String[] args) {
                short num1 = 4; // Объявляем переменную num1 типа short и присваиваем ей значение 4
                int result1 = summa((short) 5, num1) // Вызываем метод summa с аргументами (5, num1) и сохраняем результат в result1

                short num2 = 7; // Объявляем переменную num2 типа short и присваиваем ей значение 7
                int result2 = summa((short) 3, num2); // Вызываем метод summa с аргументами (3, num2) и сохраняем результат в result2
                info(String.valueOf(result2)); // Этот код преобразует число result2 в строку.
            }
        }
        // Метод summa, который складывает два числа типа short, выводит результат и возвращает его
        public static int summa ( short a, short b){
            int res = a + b; // Складываем числа a и b типа short и сохраняем результат в переменной res типа int
            String result = "Результат:" + res; // Создаем строку, содержащую текст "Результат: " и значение res
            info(result); // Вызываем метод info и передаем ему строку result в качестве аргумента для вывода на экран
            return res; // Возвращаем результат res (Откуда был вызвана функция, туда и возвращается итог).
        }

        public static void info (String word){
            System.out.println(word);
            System.out.println("!");
        }
    }
//        Итог: Результат: 9
//              !
//              Результат: 10
//              !

    //         Пример с практическим применением функций/метода:
    public class Main {

        public static void main(String[] args) {

            byte[] nums1 = new byte[]{5, 6, 8}; // Создается массив nums1 типа byte и заполняется значениями 5, 6 и 8.
            int summ1 = summaArray(nums1); // Вызывается метод summaArray с аргументом nums1 для вычисления суммы элементов массива nums1, ...
            // ... результат сохраняется в переменной summ1.
            System.out.println("Сумма 1: " + summ1); // Выводится на экран строка "Сумма 1: " с добавленным к ней значением переменной summ1.

            byte[] nums2 = new byte[]{5, 6, 8}; // Создается массив nums2 типа byte и заполняется значениями 5, 6 и 8
            int summ2 = summaArray(nums2); // Вызывается метод summaArray с аргументом nums2 для вычисления суммы элементов массива nums2, ...
            //... результат сохраняется в переменной summ2.
            System.out.println("Сумма 2: " + summ2); // Выводится на экран строка "Сумма 2: " с добавленным к ней значением переменной summ2.
        }

        // Это метод summaArray, который принимает массив arr типа byte и возвращает сумму его элементов в виде целого числа (int).
        // массив arr это массив nums1 и nums2
        public static int summaArray(byte[] arr) {
            int summa = 0; // Создается переменная summa, в которой будет храниться сумма элементов массива.
            for (int i = 0; i < arr.length; i++) {   // Цикл for, который перебирает все элементы массива arr.
                summa += arr[i]; // Простыми словами, в методе summaArray каждый элемент массива arr последовательно добавляется к переменной summa
            }
            return summa; // В конце метода возвращается переменная summa, содержащая сумму элементов массива.
        }
    }
//            Итог: Сумма 1: 19
//                  Сумма 2: 19

//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//       8) ООП:
//      Объектно-ориентированное программирование (ООП) - это подход к программированию, который помогает организовывать код, делая его понятнее и проще для работы. ...
//      ... Основные понятия в ООП - это классы и объекты.
//     Пример из реальной жизни:
//     Представь, что ты играешь в видеоигру, где ты создаешь своего персонажа.
//     Класс - это как шаблон или чертеж для создания объектов. Например, в видеоигре у тебя есть класс "Персонаж". В этом классе можно описать, ...
//     ... что у каждого персонажа есть имя, возраст, уровень здоровья и действия, которые он может выполнять (например, бегать, прыгать, атаковать).
//     Объект - это конкретный экземпляр класса. Если класс - это чертеж, то объект - это то, что построено по этому чертежу. Например, ...
//     ... твой персонаж в игре по имени Алекс с 100 единицами здоровья и уровнем 1 - это объект класса "Персонаж".

//    ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//       8.2) (ООП) Создание классов и объектов:
//        Класс - чертеж, Объект - экзепляр созданный по чертежу

    //        Конструкция класса:
    public class Transport {  // В первую очередь при создание класса пишется модификатор доступа (public, private, protected), далее пишется class (обозначает...
//     ... что мы создаем именно класс), далее название класса с большой буквы.
    }

//      К примеру в класс мы можем описать какие либо характеристики которые будут соответствовать абсолютно любым транспортым средствам ...
//      ... К примеру у какого либо транспорта есть максимальная скорость, масса, общий цвет и в плане харакетеристик координаты.
//      И когда мы будем создавать несколько объектов транспорта (бмв, мерседес, тойота) мы будем просто брать код из класса и использовать его для объектов.
//      И для этого нам нужно в нашем классе написать 4 поле (Поле - тоже самое что переменное но оно пишеться в классе, не в функций)

//      Прежде чем создать какое либо поле, нам нужно указать модификаторы доступа:
//    public - данные будут видны повсюду, как в классе, так и вне его;
//    protected - данные будут видны только в классе, где они были созданы, а также в классах наследниках;
//    private - данные будут видны только в классе, где они были созданы.

    //      Создание класса и полей (Должен быть в отдельном проекте/файле):
    public class Transport {  // Создание класса Транспорт.

        public float speed; // Cоздание поле Speed типом float и тд. Оно будет обозначать скорость транспорта
        public int weight;
        public String color;
        public byte[] coordinate; // Создание массива байт для записей координат.
    }

    //     Создание объектов с использованием созданного класса и полями (Должен быть в отедельно от класса Transport проекте или в файле):
    public class Main {
        public static void main(String[] args) {
            Transport bmw = new Transport(); // Создание объекта под названием bmw по чертежу (классу) Transport
            bmw.speed = 250.1f; // Указываем скорость bmw, если бы не было бы нашего класса, программа не понимало бы что такое speed, далее пишем все остальные данные:
            bmw.weight = 2500;
            bmw.color = "white";
            bmw.coordinate = new byte[]{0, 0, 0}; // Указываем координаты в массив

            System.out.println("bmw speed:" + bmw.speed + "bmw weight:" + bmw.weight + "bmw color:" + bmw.color + "bmw coordinate:" + bmw.coordinate); // Вывод всех ...
//            ... данных автомобиля на консоль/экран.
        }
    }
//
//   В итоге мы создав один класс, можем применять его во множестве объектов, таких как Transport bmw. Это удобнее чем заного писать поля/переменные каждому объекту.
//   Если бы мы в классе Transport указали бы модификатор доступа private, объект bmw не работал бы, так как класс не виден другим методам в других классах.

//         Методы класса:
//        Также к объектам мы можем добавлять методы, которые будут выполнять другие обязанности, к примеру, мы выше создавали класс Transport...
//        ... мы можем добавить к нему метод, с помощью которого каждый объект созданный с помощью него будет ехать и останавливаться (разумеется в консоле текст просто).

    //        Пример:
    public class Transport {

        // Свойства транспортного средства
        public float speed; // Скорость
        public int weight; // Вес
        public String color; // Цвет
        public byte[] coordinate; // Координаты

        // Метод для установки значений свойств
        public void SetValue(float speed_, int weight_, String color_, byte[] coordinate_) {
            speed = speed_; // Устанавливаем скорость
            weight = weight_; // Устанавливаем вес
            color = color_; // Устанавливаем цвет
            coordinate = coordinate_;  // Устанавливаем координаты
        }

        // Метод для получения информации о транспортном средстве
        public String getValue() {
            String info = ("Object speed:" + speed + "weight:" + weight + "color+" + color); // Создаем строку info, которая содержит информацию о скорости, весе и цвете объекта.
            String infoCoordinate = "Coordinate:\n"; // Создаем строку infoCoordinate, которая начнется с "Coordinate:\n".

            for (int i = 0; i < coordinate.length; i++) // Используем цикл for, чтобы пройтись по всем элементам массива coordinate...
                // ... Для каждого элемента массива добавляем значение координаты и символ новой строки \n в строку infoCoordinate.
                infoCoordinate += coordinate[i] + "\n"; // Склеиваем строку info и строку infoCoordinate и возвращаем результат:

            return info + infoCoordinate;
        }
    }
//   Теперь перейдем к объектам:

    public class Main {
        public static void main(String[] args) {
            Transport bmw = new Transport();  // Создаем объект "bmw" класса "Transport"
            bmw.SetValue(250.1f, 2500, "White", new byte[]{0, 10, 100});  // Устанавливаем значения для "bmw"
            String res1 = bmw.getValue();  // Получаем информацию о "bmw" и выводим на экран:

            System.out.println(res1);
        }
    }
//
//    ----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //     8.3) (ООП) Конструкторы класса:
//    Конструктор класса очень удобен и по своему виду схож с обыкновенными функциями. За счёт конструктора мы можем установить значения для объекта сразу при его создании.
//    К примеру мы в прошлой работе транспорту bmw устанавливали его характеристики на разные строки, а с помощью конструтором могли бы установить на одной строке:
//    Transport bmw = new Transport(); в скобках указывались бы характеристики.
//    Конструктор должен иметь одинаковое название с классом.
//    Пример:
    class Book {
        private int pages; // Создается 3 поля с характеристиками книг, они с модификатором доступа private
        public String name;
        private float weight;

        public void getInfoBook() {
            System.out.print("В книге " + name + " находиться " + pages + " страниц. ");
            System.out.print("При этом она весит " + weight + "кг!");
            System.out.println("");
        }

        Book(int pages, float weight) { // Первый конструктор - используется что бы придать значению страниц и весу книге. Но у книги не будет название
            this.pages = pages;
            this.weight = weight;
        }

        Book(int pages, float weight, String name) { // Тоже самое как в первом конструкторе но книге можно дать название.
            this.pages = pages;
            this.weight = weight;
            this.name = name;
        }
    }

    //       Смысл конструктов в данном примере, в том что одной книге мы хотим только придать количество страниц и веса, без ее название, другой мы хотим придать и вес, и название,
//       и количество страниц.
//    Дополнительно создадим два объекта и выведем информацию:
    public class Main {
        public static void main(String[] args) {
            Book sherlock_holms = new Book(460, 1.7f); // Используем 1 конструктор
            sherlock_holms.name = "Шерлок Холмс"; // Устанавливаем вручную значение для name
            sherlock_holms.getInfoBook();

            Book green_mile = new Book(750, 2.8f, "Зеленая миля"); // Используем второй конструктор
            green_mile.getInfoBook();
        }
    }

//     В одном классе может быть сразу несколько конструкторов. Создав несколько конструкторов мы можем передавать разное количество параметров при создании объекта.
//     Джава сам определяет какой конструктор необходимо использовать в зависимости от передаваемых параметров и их типов данных.\\
//     В коде выше переменные идут с модификатором доступа private. Дело в том, что все переменные лучше делать либо private, либо protected.
//     Доступ к переменным должен осуществляться только за счёт методов и конструкторов. Доступ к полям напрямую должен быть закрыт.

//     Поскольку переменная name имеет public модификатор доступа, то мы можем ссылаться к ней отдельно. Лучше так не делать и для неё тоже установить модификатор private.


}