import java.time.LocalDate;

class Homework {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = LocalDate.now().getYear();
        calcAndPrintLeapYear(year);
        /////////////////////
        /////////////////////
        System.out.println("Задача 2");
        String osName = "Android";
        int clientOS = getClientOS(osName);
        int actualYear = getDeviceYear(year);
        printVersionOfTheApp(clientOS, actualYear);
        /////////////////////
        /////////////////////
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        distanceMeasure(deliveryDistance);
    }

    //Задача 1 - Метод для расчёта того, является ли год високосным
    public static void calcAndPrintLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    //Задача 2 - Проверка iOS и Android (какое приложение установить)
    public static int getClientOS(String osName) {
        if (osName.equals("Android")) {
            return 1;
        }
        return 0;
    }

    public static int getDeviceYear(int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            return 1;
        }
        return 0;
    }

    public static void printVersionOfTheApp(int clientOS, int actualYear) {
        if (clientOS == 1 && actualYear == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && actualYear != 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS != 1 && actualYear == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS != 1 && actualYear != 1) {
            System.out.println("Установите облегченную приложения для iOS по ссылке");
        }
    }

    //Задача 3 - Проверка расстояния
    //Написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.

    public static void distanceMeasure(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }

}