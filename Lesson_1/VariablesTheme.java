public class VariablesTheme {
    public static void main(String[] args) {

//Создание переменных и вывод их значений в консоль 

        System.out.println("Создание переменных и вывод их значений в консоль:");
        //Разделители для отображение отступов между задачами в консоли
        String cutLine1 = "";
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
        System.out.println(cutLine1);

//Расчёт стоимости товара со скидкой

        System.out.println("Расчёт стоимости товара со скидкой:");
        int productX = 100;
        int productY = 200;
        int saleValue = 11;
        int fullProcent = 100;
        int productSum = (productX + productY) * saleValue;
        int resultCoast = productSum / fullProcent;
        String cutLine2 = "";

        System.out.println("Сумма скидки:" + " " + resultCoast + " " + "рубля");
        System.out.println("Цена с учётом скидки:" + " " + ((productX+productY)-(resultCoast)) + " " + "рублей");
        System.out.println(cutLine2);

//Вывод на консоль слова JAVA

        System.out.println("Вывод на консоль слова JAVA");
        String cutLine3 = "";
        System.out.println("   " + "J" + "    " + "a" + "  " + "v" + "     " + "v" + "  " + "a" + "    ");
        System.out.println("   " + "J" + "   " + "a a" + "  " + "v" + "   " + "v" + "  " + "a a" + "   ");
        System.out.println("J  " + "J" + "  " + "aaaaa" + "  " + "V" + " " + "V" + "  " + "aaaaa" + "  ");
        System.out.println(" JJ"       + "  "+ "a     a" + "  " +      "V"      + "  " + "a     a" + " ");
        System.out.println(cutLine3);

//Отображение min и max значений числовых типов данных 

        System.out.println("Отображение min и max значений числовых типов данных:");
        byte byteInt = 127;
        byte byteInk = -- byteInt;
        byte byteDik = ++ byteInk;
        
        short shortInt = 32767;
        short shortInk = -- shortInt;
        short shortDik = ++ shortInk;

        int intInt = 2147483647;
        int intInk = -- intInt;
        int intDik = ++ intInk;

        long longInt = 9223372036854775807L;
        long longInk = -- longInt;
        long longDik = ++ longInk;
        String cutLine4 = "";

        System.out.println(byteInt);
        System.out.println(byteDik);
        System.out.println(shortInt);
        System.out.println(shortInk);
        System.out.println(intInt);
        System.out.println(intInk);
        System.out.println(longInt);
        System.out.println(longInk);
        System.out.println(cutLine4);

//Перестановка значений переменных

        System.out.println("Перестановка значений переменных:");
        double var1 = 57.19d;
        double var2 = 141.57;
        String cutLine5 = "";
        
        int var3 = (int) var1;
        var1 = (int) var2;
        var2 = var3;
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(cutLine5);

//Вывод символов и их кодов

        System.out.println("Вывод символов и их кодов:");
        byte symbol1 = 35;
        byte symbol2 = 38;
        byte symbol3 = 64;
        byte symbol4 = 94;
        byte symbol5 = 95;
        String cutLine6 = "";

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;

        System.out.println(symbol1 +" "+ ch1);
        System.out.println(symbol2 +" "+ ch2);
        System.out.println(symbol3 +" "+ ch3);
        System.out.println(symbol4 +" "+ ch4);
        System.out.println(symbol5 +" "+ ch5);
        System.out.println(cutLine6);

//Произведение и сумма цифр числа

        System.out.println("Произведение и сумма цифр числа:");
        int mainDigit = 345;
        int digitFive = mainDigit % 10; 
        int digitTre = mainDigit / 100;
        int digitSevenFour = mainDigit / 10;
        int four = digitSevenFour % 10;
        int rezult1 = digitTre * four * digitFive;
        int rezult2 = digitTre + four + digitFive;
        String cutLine7 = "";

        System.out.println("Произведение чисел:" + " " + rezult1);
        System.out.println("Сумма цифр числа:" + " " + rezult2);
        System.out.println(cutLine7);

//Вывод на консоль ASCII арт Дюка

        System.out.println("Вывод на консоль арт Дюка:");
        char cha1 = 47;
        char cha2 = 40;
        char cha3 = 41;
        char cha4 = 95;
        char cha5 = 92;
        String cutLine8 = "";

        System.out.println("     " + cha1 + "" + cha5                                                          );
        System.out.println("    " + cha1 + "  " + cha5                                                         );
        System.out.println("   " + cha1 + cha4 + cha2 + " " + cha3 + "" + cha5                                 );
        System.out.println("  " + cha1 + "      " + cha5                                                       );
        System.out.println(" " + cha1 + cha4 + cha4 + cha4 + cha4 + cha1 + cha5 + cha4 + cha4 + cha5           );
        System.out.println(cutLine8);

//Отображение количества сотен, десятков и единиц числа 

        System.out.println("Отображение количества сотен, десятков и единиц числа: 123");
        String cutLine9 = "";
        int digitMain = 123; 
        int digitUnit = digitMain / 100;
        int digitSot = digitMain % 100;
        int digitSot2 = digitSot / 10;
        int digitSot3 = digitSot % 10;

        double op = (double)digitSot2 / 10;
        double op2 = (double)digitSot3 / 100;

        System.out.println("Целое число:" + " " + digitUnit);
        System.out.println("Две десятые:" + " " + op);
        System.out.println("Три сотые:" + " " + op2);
        System.out.println(cutLine9);

//Преобразование секунд

        System.out.println("Преобразование секунд:");
        int seconds = 86399;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int minutes2 = minutes % 60;
        int seconds2 = seconds % 60;

        System.out.println("Время:" + " " + hours+ ":" + minutes2 + ":" + seconds2);
        }
}

// Ура :)





