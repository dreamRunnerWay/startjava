public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("\n1.Перевод псевдокода на язык Java");
        int age = 33;

        if (age > 20) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещен");
        }

        int userGender = 1;
        boolean isUserGender = userGender % 2 == 0;
        if(isUserGender) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        double rise = 1.85;
        if(rise <= 1.80) {
            System.out.println("Размер L");
        } else {
            System.out.println("Размер XL");
        }

        String nameUser = "Валентина";
        char firstNameWord = nameUser.charAt(0);
        if(firstNameWord == 'М') {
            System.out.println("Первая буква имени:" + firstNameWord);
        } else if(firstNameWord == 'И') {
            System.out.println("Первая буква имени:" + firstNameWord);
        } else {
            System.out.println("Нет совпадений первой буквы");
        }

        //Поиск максимального и минимального числа
        System.out.println("\n2.Поиск максимального и минимального числа");
        int number1 = 27;
        int number2 = 501;
        
        if(number1 > number2) {
            System.out.println("Максимальное число" + " " + number1);
        } else {
            System.out.println("Минимальное число" + " " + number1);
        }

        if(number1 < number2) {
            System.out.println("Максимальное число" + " " + number2);
        } else {
            System.out.println("Минимальное число" + " " + number2);
        }

        //Работа с числом
        System.out.println("\n3.Работа с числом");
        int digit = 8;
        boolean isEvenDigit = digit % 4 == 0;

        if(isEvenDigit) {
            System.out.println("Число" + " " + digit + " " + "является чётным");
        } else { 
            System.out.println("Число" + " " + digit + " " + "является нечётным");
        }

        if(digit > 0) {
            System.out.println("Число" + " " + digit + " " + "является положительным");
        } else {
            System.out.println("Число" + " " + digit + " " + "является отрицательным");
        }

        boolean isEvenDigit2 = digit == 0;
        if(isEvenDigit2 == false) {
            System.out.println("Число" + " " + digit + " " + "не равно ноль");
        }

        //Поиск одинаковых цифр в числах
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num1 = 456;
        int num2 = 159;
        String num1String = String.valueOf(num1);
        String num2String = String.valueOf(num2);

        char dischargingHundreds = num1String.charAt(0);
        char dischargingTens = num1String.charAt(1);
        char dischargingUnits = num1String.charAt(2);
        char dischargingHundreds2 = num2String.charAt(0);
        char dischargingTens2 = num2String.charAt(1);
        char dischargingUnits2 = num2String.charAt(2);

        if(dischargingHundreds == dischargingHundreds2) {
            System.out.println("В разряде сотен есть одинаковые цифры:" + " " + dischargingHundreds);
        } else {
            System.out.println("В разряде сотен одинаковых цифр нет");
        }

        if(dischargingTens == dischargingTens2) {
            System.out.println("В разряде десятков есть одинаковые цифры:" + " " + dischargingTens);
        } else {
            System.out.println("В разряде десятков одинаковых чисел нет");
        }

        if(dischargingUnits == dischargingUnits2) {
            System.out.println("В разряде единиц есть одинаковые цифры:" + " " + dischargingUnits);
        } else {
            System.out.println("В разряде единиц одинаковых чисел нет");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        int digitCheсk = 1;
        char char1 = '\u0057';
        char lowerCase = 'w';

        System.out.println(char1);
        boolean isCharUpperCase = char1 == lowerCase;
        if(isCharUpperCase == false) {
            System.out.println(char1 + " " + "является большой буквой");
        }

        if(char1 == digitCheсk) {
            System.out.println(char1 + " " + "является числом");
        } else {
            System.out.println(char1 + " " + "не является числом");
        }

        if(char1 != lowerCase && char1 != digitCheсk) {
            System.out.println(char1 + " " + "не маленькая буква и не число");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int deposit = 764000;
        int depositMin = 100000;
        int depositMax = 300000;
        int percentMin = 5;
        int percentMidle = 7;
        int percentMax = 10;

        if(deposit < depositMin) {
            int percentSum = deposit * percentMin / 100;
            System.out.println("Сумма вклада" + " " + deposit + " " + "начисленный %" + " " + 
                    percentMin + " " + "итоговая сумма" + " " + (deposit + percentSum));
        } else if (deposit > depositMin && deposit < depositMax) {
            int percentSum = deposit * percentMidle / 100;
            System.out.println("Сумма вклада" + " " + deposit + " " + "начисленный %" + " " + 
                    percentMidle + " " + "итоговая сумма" + " " + (deposit + percentSum));
        } else {
            int percentSum = deposit * percentMax / 100;
            System.out.println("Сумма вклада" + " " + deposit + " " + "начисленный %" + " " + 
                    percentMax + " " + "итоговая сумма" + " " + (deposit + percentSum));
        }

        //Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        int hystoryPercent = 59;
        int programmingPercent = 91;
        int scoreA = 2;
        int scoreB = 3;
        int scoreC = 4;
        int scoreD = 5;

        if(hystoryPercent <= 60) {
            System.out.println("История" + " " + scoreA);
        } else if(hystoryPercent < 73) {
            System.out.println("История" + " " + scoreB);
        } else if(hystoryPercent < 91) {
            System.out.println("История" + " " + scoreC);
        } else if(hystoryPercent >= 91 && hystoryPercent < 100) {
            System.out.println("История" + " " + scoreD);
        } else {
            System.out.println("Вводимое значение должно быть от 0 до 100");
        }

        if(programmingPercent <= 60) {
            System.out.println("Программирование" + " " + scoreA);
        } else if(programmingPercent < 73) {
            System.out.println("Программирование" + " " + scoreB);
        } else if(programmingPercent < 91) {
            System.out.println("Программирование" + " " + scoreC);
        } else if(programmingPercent >= 91 && programmingPercent < 100) {
            System.out.println("Программирование" + " " + scoreD);
        } else {
            System.out.println("Вводимое значение должно быть от 0 до 100");
        }

        float avarageScore = ((float)scoreA + (float)scoreD) / 2;
        int avaragePercent = (hystoryPercent + programmingPercent) / 2;
        System.out.println("Средняя оценка:" + " " + avarageScore);
        System.out.println("Средний процент:" + " " + avaragePercent + "% оценок по предметам");

        //Расчёт прибыли
        System.out.println("\n8.Расчёт прибыли");
        int monthSum = 12;
        int monthRentSum = 5000;
        int monthProfit = 13000;
        int monthCoastProduct = 9000;

        int rentYearCoast = monthSum * monthRentSum;
        int yearBlackProfit = monthProfit * monthSum;
        int yesrCoastProduct = monthCoastProduct * monthSum;
        int yearAverage = rentYearCoast + yesrCoastProduct - yearBlackProfit;

        System.out.println("Прибыль за год:" + " " + yearAverage);

        //Определение существования треугольника
        System.out.println("\n9.Определение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int angle = 90;

        boolean isTriangleExist = sideA < sideB + sideC & sideB < sideA + sideC & sideC < sideA + sideB;
        if (isTriangleExist) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }

        boolean isItCatet = sideA < sideC & sideB < sideC;
        if(isItCatet) {
            System.out.println("Катеты = " + sideA + " " + sideB);
        } else {
            System.out.println("Не катет");
        }

        boolean isItHypotenuse = sideA > sideC & sideB > sideC;
        if(isItHypotenuse == false) {
            System.out.println("Гипотенуза = " + sideC);
        } else {
            System.out.println("Не гипотенуза");
        }

        int triangleArea = sideA * sideB / 2;

        System.out.println("Площадь треугольника:" + triangleArea);
        System.out.println("|\\");
        System.out.println("| \\");
        System.out.println("|  \\");
        System.out.println("|___\\");

        //Подсчет количества банкнот
        System.out.println("\n10.Подсчет количества банкнот");
        int scrNum = 567;
        int digitBanknote = 1;
        int numberBanknote = 10;
        int numberBanknote2 = 50;
        char currency = '$';

        int sum1 = scrNum % 10 / digitBanknote;
        int sum2 = scrNum - sum1;
        int sum3 = sum2 % 100 / numberBanknote;
        int sum4 = (sum2 - sum2 % 100) / numberBanknote2;
        int sum5 = numberBanknote2 * sum4 + numberBanknote * sum3 + digitBanknote * sum1;

        System.out.println("Номиналы банкнот:" + digitBanknote + currency + "," + numberBanknote + 
                currency + "," + numberBanknote2 + currency);
        System.out.println("Требуемое их количество:" + digitBanknote + currency + "=" + sum1 + "," + 
                numberBanknote + currency + "=" + sum3 + "," + numberBanknote2 + currency + "=" + sum4);
        System.out.println("Итоговая сумма:" + sum5 + currency);
    }
}