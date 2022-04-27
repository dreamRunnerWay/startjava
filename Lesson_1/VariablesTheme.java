public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений в консоль 
        System.out.println("\n1.Создание переменных и вывод их значений в консоль:");
        byte cores = 16;
        short name = 5950;
        int freqCpu = 4200;
        long freqBoost = 5150;
        float freqBase = 3400f;
        double voltage = 1.36;
        char version = 'X';
        boolean result = true;

        System.out.println("Cores:" + " " + cores);
        System.out.println("CPU:" + " " + name + "x");
        System.out.println("Frequency:" + " " + freqCpu);
        System.out.println("Boost mode:" + " " + freqBoost + "MHz");
        System.out.println("Base mode:" + " " + freqBase + "MHz");
        System.out.println("Voltage:" + " " + voltage + "v");
        System.out.println("Version:" + " " + version);
        System.out.println(result);

        //Расчёт стоимости товара со скидкой
        System.out.println("\n2.Расчёт стоимости товара со скидкой:");
        int productX = 100;
        int productY = 200;
        int saleValue = 11;
        int fullPercent = 100;
        int productSum = (productX + productY) * saleValue / fullPercent;

        System.out.println("Сумма скидки:" + " " + productSum + " " + "рубля");
        System.out.println("Цена с учётом скидки:" + " " + (productX + productY - productSum) + " " + "рублей");

        //Вывод на консоль слова JAVA
        System.out.println("\n3.Вывод на консоль слова JAVA:");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных 
        System.out.println("\n4.Отображение min и max значений числовых типов данных:");
        byte byteDigit = 127;
        short shortDigit = 32767;
        int intDigit = 2147483647;
        long longDigit = 9223372036854775807L;

        System.out.println(++byteDigit + " " + --byteDigit);
        System.out.println(++shortDigit + " " + --shortDigit);
        System.out.println(++intDigit + " " + --intDigit);
        System.out.println(++longDigit + " " + --longDigit);

        //Перестановка значений переменных
        System.out.println("\n5.Перестановка значений переменных:");
        double num1 = 57.19d;
        double num2 = 141.57;
        double buffer = num1;
        num1 = num2;
        num2 = buffer;

        System.out.println(num1);
        System.out.println(num2);

        //Вывод символов и их кодов
        System.out.println("\n6.Вывод символов и их кодов:");
        byte codeChar1 = 35;
        byte codeChar2 = 38;
        byte codeChar3 = 64;
        byte codeChar4 = 94;
        byte codeChar5 = 95;

        System.out.println("35" + (char) + codeChar1);
        System.out.println("38" + (char) + codeChar2);
        System.out.println("64" + (char) + codeChar3);
        System.out.println("94" + (char) + codeChar4);
        System.out.println("95" + (char) + codeChar5);

        //Произведение и сумма цифр числа
        System.out.println("\n7.Произведение и сумма цифр числа:");
        int srcNum = 345;
        int digit1 = srcNum % 10; 
        int digit2 = srcNum / 100;
        int digit3 = srcNum / 10 % 10;
        int productDigits = digit2 * digit3 * digit1;
        int sumDigits = digit2 + digit3 + digit1;

        System.out.println("Произведение чисел:" + " " + productDigits);
        System.out.println("Сумма цифр числа:" + " " + sumDigits);

        //Вывод на консоль ASCII арт Дюка
        System.out.println("\n8.Вывод на консоль арт Дюка:");
        String slash1 = "/";
        String slash2 = "\\";
        String lBreket = "(";
        String rBreket = ")";
        String space = " ";
        String underscore = "_";

        System.out.println(space + space + space + space + slash1 + slash2 + space + space + space + space);
        System.out.println(space + space + space + slash1 + space + space + slash2);
        System.out.println(space + space + slash1 + underscore + lBreket + space + rBreket + slash2);
        System.out.println(space + slash1 + space + space + space + space + space +  space + slash2);
        System.out.println(slash1 + underscore + underscore + underscore + underscore + slash1 + slash2 + underscore + underscore + slash2);

        //Отображение количества сотен, десятков и единиц числа 
        System.out.println("\n9.Отображение количества сотен, десятков и единиц числа: 123");
        int scrNum = 123; 
        int digitHundred = scrNum / 100;
        int digitTenth = scrNum / 10 % 10;
        int digitSingle = scrNum % 10;

        System.out.println(digitHundred + " " + "Сотня");
        System.out.println(digitTenth + " " + "Десятка");
        System.out.println(digitSingle + " " + "Единицы");

        //Преобразование секунд
        System.out.println("\n10.Преобразование секунд:");
        int seconds = 86399;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int minutes2 = minutes % 60;
        int seconds2 = seconds % 60;

        System.out.println("Время:" + hours + ":" + minutes2 + ":" + seconds2);
    }
}







