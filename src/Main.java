public class Main {
    public static void main(String[] args) {

        int clientOs = 0;


        if (clientOs == 0) {
            System.out.println("Установите версию для IOS по ссылке ");

        } else if (clientOs == 1) {
            System.out.println("Установите версию для Android по ссылке");

        }


        int clientOsOne = 1;
        int clineDeviseYear = 2016;

        if (clientOsOne == 0) {
            if (clineDeviseYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке  ");
            } else {
                System.out.println("Установите версию приложения для ios по ссылке");
            }
        }else if (clientOsOne == 1) {
            if (clineDeviseYear < 2015) {
                System.out.println("Установите облегченую версию для Android по ссылке");

            } else {
                System.out.println("Установите версию для Android по ссылке");
            }

            }


        int year =1450;

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");

        }

        int deliveryDistance = 30;
        int deliveryDays=1;
        if (deliveryDistance>100) {
            System.out.println("Доставка не осуществляеться");
        }else{
            if (deliveryDistance>60) {
                deliveryDays += 2;
            }else if (deliveryDistance>20){
                deliveryDays +=1;
            }
            System.out.println("Потребуеться дней " + deliveryDays);
        }



        int monthNumber =13;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}






