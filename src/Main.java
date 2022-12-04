public class Main {
    public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
      task6();
      task7();
      task8();
      task9();
      task10();
      task1_1();
      task1_2();
      task1_3();
      task1_4();
      task1_5();
      task1_6();
      task1_7();
      task1_8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i<17; i= i+2){
            System.out.println(i);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i>=-10; i--){
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i<2096 &&((i % 4 == 0 && i%100!=0)|| i% 400 == 0); i= i+4){
            System.out.println(i+" год является високосным");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <=12; i ++) {
            total = total + deposit;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей");
        } System.out.println("Итого " +total);
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <=12; i ++) {
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей");
        } System.out.println("Итого " +total);
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int firstNumber = 0;
        int secondNumber = 1;
        int total = 0;
        System.out.println("1");
        for (int i = 0; i <11; i ++) {
            total = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = total;

            System.out.println(total);
        }
    }
    public static void task1_1 () {
        System.out.println("Задача 1_1");
        int deposit = 15_000;
        int total = 0;
        int month = 0;
        while (total <= (2_459_000 - 15000)){
           total = total+total/100;
            total = total + deposit;
            month ++;
            System.out.println("Месяц "+month+" сумма накоплений равна "+total+" рублей");
        }System.out.println("Месяцев -  "+month+" сумма накоплений равна "+total+" рублей");
    }
    public static void task1_2 () {
        System.out.println("Задача 1_2");
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        int j;
        for (j=10; j>0;j--){
            System.out.print(j+" ");
        }
    }
    public static void task1_3 () {
        System.out.println("Задача 1_3");
        int population = 12_000_000;
        int natality = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + natality - deathRate;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
    public static void task1_4 () {
        System.out.println("Задача 1_4");
        int deposit = 15_000;
        int total = 0;
        int s = 0;
        while (total < 12000000) {
            total = total + total * 7 / 100;
            total = total + deposit;
            s++;
            System.out.println("Месяц "+s+" Сумма накоплений " + total);

        }System.out.println(s+" месяцев нужно копить");
    }
    public static void task1_5 () {
        System.out.println("Задача 1_5");
        int deposit = 15_000;
        int total = 0;
        int s = 0;
        while (total < 12000000) {
            total = total + total * 7 / 100;
            total = total + deposit;
            s++;
            if (s%6 == 0) {
                System.out.println("Месяц " + s + " Сумма накоплений " + total);
            }

        }System.out.println(s+" месяцев нужно копить");
    }
    public static void task1_6 () {
        System.out.println("Задача 1_6");
        int deposit = 15_000;
        int total = 0;
        int s = 0;
        while (s < 108) {
            total = total + total * 7 / 100;
            total = total + deposit;
            s++;
            if (s%6 == 0) {
                System.out.println("Месяц " + s + " Сумма накоплений " + total);
            }
        }
    }
    public static void task1_7 () {
        System.out.println("Задача 1_7");
        int friday = 5;
        while (friday < 31) {
            friday = friday+7;
            if (friday<=31){
            System.out.println("Сегодня пятница, "+friday+"-е число");
            }
        }
    }
    public static void task1_8 () {
        System.out.println("Задача 1_8");
        int startYear = 1822;
        int endYear = 2122;
        int startPoint = 0;
        while (startPoint < endYear) {
            startPoint = startPoint +79;
            if (startPoint>startYear && startPoint < endYear){
                System.out.println(startPoint);
            }
        }
    }
}