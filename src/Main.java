public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        int clientOS = 1;
        if(clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");
    }

    public static void task2(){
        int clientOS = 1, clientDeviceYear = 2013;
        if(clientOS == 1) {
            if(clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите lite версию приложения для Android по ссылке");
        }
        else if(clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите lite версию приложения для iOS по ссылке");
    }

    public static void task3(){
        int currentYear = 2022;
        System.out.println(currentYear % 4 == 0 && currentYear % 100 != 0 ? currentYear + " год является високосным" : currentYear + " год не является високосным");
    }

    public static void task4(){
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 20){
            deliveryTime += 1;
        } else if (deliveryDistance <= 60){
            deliveryTime += 2;
        } else if (deliveryDistance <= 100){
            deliveryTime += 3;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
    }

    public static void task5(){
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }

    // усложненные задания

    public static void task6(){
        int age = 19, salary = 58_000, credit = salary;

        if (age >= 23) credit *= 3;
        else credit *= 2;

        if (salary >= 50_000 && salary < 80_000) credit *= 1.2;
        else if(salary >= 80_000) credit *= 1.5;

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");
    }

    public static void task7() {
        int age = 25, salary = 60_000, wantedSum = 330_000;
        double monthPayment, percent = 1.1;

        if (age < 23) percent += 0.01;
        else if(age < 30) percent += 0.005;

        if(salary >= 80_000) percent -= 0.007;

        monthPayment = wantedSum * percent / 12;
        if (salary * 0.5 >= monthPayment) System.out.printf("Максимальный платеж при ЗП %d равен %.0f рублей.\nПлатеж по кредиту %.0f рублей.\nОдобрено", salary, salary * 0.5, monthPayment);
        else System.out.printf("Максимальный платеж при ЗП %d равен %.0f рублей.\nПлатеж по кредиту %.0f рублей.\nОтказано", salary, salary*0.5, monthPayment);
    }
}