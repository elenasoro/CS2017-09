package by.it.sc02_morning.opanovich.lesson05;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) {

        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner rd = new Scanner(System.in);
        float pay = rd.nextInt();

        if (pay < 300 || pay > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int month = 0; month < 15; month++) {
                System.out.print("За ");
                switch(month) {
                    case 1:
                        System.out.print("январь начислено $" + pay * 1.5);
                        break;
                    case 2:
                        System.out.print("февраль начислено $" + pay * 1.5);
                        break;
                    case 3:
                        System.out.print("март начислено $" + pay * 1.5);
                        break;
                    case 4:
                        System.out.print("апрель начислено $" + pay * 1.5);
                        break;
                    case 5:
                        System.out.print("май начислено $" + pay * 1.5);
                        break;
                    case 6:
                        System.out.print("июнь начислено $" + pay);
                        break;
                    case 7:
                        System.out.print("июль начислено $" + pay);
                        break;
                    case 8:
                        System.out.print("август начислено $" + pay);
                        break;
                    case 9:
                        System.out.print("сентябрь начислено $" + pay * 1.5);
                        break;
                    case 10:
                        System.out.print("октябрь начислено $" + pay * 1.5);
                        break;
                    case 11:
                        System.out.print("ноябрь начислено $" + pay * 1.5);
                        break;
                    case 12:
                        System.out.print("декабрь начислено $" + pay * 1.5);
                        break;
                    default:
                        System.out.print("месяц " + month + " начислено $0.0");
                        break;
                }
                System.out.println();
                if ((month > 0 && month <= 5 || month >= 9 && month <= 12) && pay * 1.5 == 666
                        || month >= 6 && month <= 8 && pay == 666) {
                    break;
                }
            }
        }
    }
}