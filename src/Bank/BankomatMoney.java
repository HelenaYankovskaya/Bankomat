package Bank;

import java.util.Scanner;

public class BankomatMoney {

    private static int m100 = 0;
    private static int m50 = 0;
    private static int m20 = 0;
    private static int allmoney;


    public static void addMoney(int addnote20, int addnote50, int addnote100) {

        m100 = addnote100;
        m50 = addnote50;
        m20 = addnote20;
        allmoney = addnote100 * 100 + addnote50 * 50 + addnote20 * 20;
    }

    static void askSumma() {
        System.out.println("Введите сумму для выдачи:");
        Scanner input = new Scanner(System.in);
        int summa = input.nextInt();
        boolean answer = false;
        for (int i = 1; i <= 10; i++) {
            if (answer == true)
                break;
            if (summa % 20 != 0 && summa % 50 !=0) {
                System.out.println("Некорректная сумма, сделайте запрос еще раз (сумма должна быть кратной 20 или 50)");
                answer = false;
                summa = input.nextInt();
            } else {
                if (summa > allmoney) {
                    answer = false;
                    System.out.println("В банкомате недостаточно средств: максимальная сумма = " + allmoney + " рублей");
                    summa = input.nextInt();
                } else {
                    if (allmoney >= summa) {
                        answer = true;
                        int[] nominal = {20, 50, 100}; //массив имеющихся номиналов
                        int[] noteCount = {m20, m50, m100}; // массив количества номиналов в банкомате
                        int[] countInput = new int[nominal.length]; //кол-во купюр выдано
                        int index;
                        System.out.println("Операция выполнена успешно ");

                        for (index = nominal.length - 1; index >= 0; index--) {

                            countInput[index] = summa / nominal[index];
                            if (countInput[index] > noteCount[index]) {
                                countInput[index] = noteCount[index];
                            } else
                                countInput[index] = summa / nominal[index];
                                { if (summa>0) {
                                summa = summa - (countInput[index] * nominal[index]);
                            }}}
                            for (int i1 = nominal.length-1; i1 >=0 ; i1--)
                                System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i1], countInput[i1]);
                        }


                    }
                }
            }
        }
    }




