/* Homework_1 */

// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

public class HomeWorkOne {
    public static void main(String[] args) {
        System.out.println("Задание № 3");
        System.out.println(taskThree(1.11f, 2.22f, 3.33f, 4.44f));
        System.out.println("Задание № 4");
        System.out.println(taskFour(14, 7));
        System.out.println("Задание № 5");
        taskFive(-3);
        System.out.println("Задание № 6");
        System.out.println(taskSix(-7));
        System.out.println("Задание № 7");
        taskSeven("userName");
        System.out.println("Задание № 8");
        taskEight(25);
    }

// 2. Создать переменные всех пройденных типов данных и инициализировать их значения.

    static void taskTwo() {
        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;
        long num4 = 4;
        float num5 = 5.23f;
        double num6 = 6.23;
        char char1 = 'G';
        boolean bool1 = true;
    }

//3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.

    static float taskThree(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

//4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
// от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    static boolean taskFour(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    static void taskFive(int a) {
        if (a >= 0) {
            System.out.println("Положительное!");
        } else {
            System.out.println("Отрицательное!");
        }

    }

//6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное.

    static boolean taskSix(int a) {
        return a<0;
    }

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».


    static void taskSeven(String name){
        System.out.println("Привет, " + name + "!");
    }

//8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void taskEight(int year){
        if ((year % 4) == 0) {
            System.out.println(year + " год високосный.");
        } else if ((year % 400) == 0){
            System.out.println(year + " год високосный.");
        } else if ((year % 100) == 0){
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

}
