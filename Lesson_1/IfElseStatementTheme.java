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

        boolean isMaleGender = true;
        if(isMaleGender) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        double height = 1.85;
        if(height <= 1.80) {
            System.out.println("Размер L");
        } else {
            System.out.println("Размер XL");
        }

        char firstNameLetter = "Bob".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Первая буква имени:" + firstNameLetter);
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква имени:" + firstNameLetter);
        } else {
            System.out.println("Нет совпадений первой буквы в имени");
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
        int digit = 3;

        if(digit != 0) {
            System.out.println("Число не равно нулю");
            if(digit % 2 == 0) {
                System.out.println("Число" + " " + digit + " " + "является чётным");
            } else {
                System.out.println("Нечетное");
            }
            if(digit > 0) {
                System.out.println("Число" + " " + digit + " " + "является положительным");
            } else {
                System.out.println("Отрицательное");
            }
        } else {
            System.out.println("Число является 0");
        }

        //Поиск одинаковых цифр в числах
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num1 = 456;
        int num2 = 159;

        int hundredNum = num1 / 100;
        int tensNum = num1 / 10 % 10;
        int oneNum = num1 % 10;
        int hundredNum2 = num2 / 100;
        int tensNum2 = num2 / 10 % 10;
        int oneNum2 = num2 % 10;

        if(hundredNum == hundredNum2) {
            System.out.println("В разряде сотен есть одинаковые цифры:" + " " + hundredNum);
        } else {
            System.out.println("В разряде сотен одинаковых цифр нет");
        }

        if(tensNum == tensNum2) {
            System.out.println("В разряде десятков есть одинаковые цифры:" + " " + tensNum);
        } else {
            System.out.println("В разряде десятков одинаковых чисел нет");
        }

        if(oneNum == oneNum2) {
            System.out.println("В разряде единиц есть одинаковые цифры:" + " " + oneNum);
        } else {
            System.out.println("В разряде единиц одинаковых чисел нет");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char unknownChar = '\u0057';

        if(unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println(unknownChar + " " + "Является большой буквой");
        } else if(unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println(unknownChar + " " + "Является маленькой буквой");
        } else if(unknownChar >= '0' && unknownChar <= '9') {
            System.out.println(unknownChar + " " + "Является числом");
        } else {
            System.out.println("Не буква и не число");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int profit;

        if(deposit < 100000) {
            profit = deposit * 5 / 100;
        } else if (deposit >= 100000 && deposit <= 300000) {
            profit = deposit * 7 / 100;
        } else {
            profit = deposit * 10 / 100;
        }

        System.out.println("Сумма вклада" + " " + deposit + " " + "начисленный %" + " " + 10 + " " + "итоговая сумма" + " " + (deposit + profit));

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

        float avarageScore = ((float) scoreA + (float) scoreD) / 2;
        int avaragePercent = (hystoryPercent + programmingPercent) / 2;
        System.out.println("Средняя оценка:" + " " + avarageScore);
        System.out.println("Средний процент:" + " " + avaragePercent + "% оценок по предметам");

        //Расчёт прибыли
        System.out.println("\n8.Расчёт прибыли");
        int monthSum = 12;
        int monthRentSum = 5000;
        int monthProfit = 13000;
        int monthCoastProduct = 9000;

        int yearAverage = (monthCoastProduct + monthRentSum - monthProfit) * monthSum;

        if(yearAverage >= 0) {
            System.out.println("Прибыль за год:" + "+" + yearAverage + " " + "руб.");
        } else {
            System.out.println("Прибыль за год:" + "-" + yearAverage + " " + "руб.");
        }

        //Определение существования треугольника
        System.out.println("\n9.Определение существования треугольника");
        int a = 3;
        int b = 4;
        int c = 5;

        if(a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
            if(a > b && a > c) {
                System.out.println("Гипотенуза:" + "a");
            }
            if(b > a && b > c) {
                System.out.println("Гипотенуза:" + "b");
            }
            if(c > a && c > b) {
                System.out.println("Гипотенуза:" + "c");
            }
            if(a < c && b < c) {
                System.out.println("Катет:" + "a,b");
            }
            int triangleArea = a * b / 2;
            System.out.println("Площадь треугольника:" + triangleArea);
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
        } else {
            System.out.println("Треугольник не существует");
        }

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