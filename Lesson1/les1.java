package Lesson1;

import java.util.Scanner;

public class les1 {
    public static void main(String[] vma) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания:");
        int num = scan.nextInt();
        System.out.println();
        int a = 0; int b = 0; int c = 0;
        if (((num>0) & (num<5)) | ((num>5) & (num<8))) {
            System.out.println("Введите значение:");
            a = scan.nextInt();
        } else if (num == 5) {
            System.out.println("Введите 3 значения:");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        }
        switch (num){
            case (1):
                System.out.println("Ответ = " + a%10);
                break;
            case (2):
                System.out.println("Ответ = " + (a%10 + a/10%10 + a/100));
                break;
            case (3):
                if (a>0) {
                    System.out.println("Ответ = " + (a + 1));
                } else {
                    System.out.println("Ответ = " + a);
                }
                break;
            case (4):
                if (a>0) {
                    System.out.println("Ответ = " + (a + 1));
                } else if (a<0){
                    System.out.println("Ответ = " + (a - 2));
                } else {
                    System.out.println("Ответ = 10");
                }
                break;
            case (5):
                System.out.print("5. ");
                
                int max = a;
                if(b > max) {
                    max=b;
                } else if (c>max) {
                    max=c;
                } 
                System.out.println("Ответ = " + (max));
                break;
            case (6):
            if (a > 0){
                if (a % 2 == 1){
                    System.out.println("Положительное нечетное число");
                } else {
                    System.out.println("Положительное четное число");
                }
            } else if (a == 0) {
                System.out.println("нулевое число");
            } else {
                if (a % 2 == 1){
                    System.out.println("Отрицательное нечетное число");
                } else {
                    System.out.println("Отрицательное четное число");
                }
            }
                break;
            case (7):
                if (a == 905) {
                    System.out.println("Москва. Стоимость разговора: 41.5");
                } else if(a == 194) {
                    System.out.println("Ростов. Стоимость разговора: 19.8");
                } else if(a == 491) {
                    System.out.println("Краснодар. Стоимость разговора: 26.9");
                } else if(a == 800) {
                    System.out.println("Киров. Стоимость разговора: 50");
                } else {
                    System.out.println("Такого города нет");
                }
                break;
            case (8):
                int mas[] = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
                for (int i: mas){
                    System.out.print(i + " ");
                }
                int maxx=0;
                int sumplus=0;
                int sumotrn = 0;
                int kolpol = 0;
                int sumotr = 0;
                int kolotr = 0;
                for (int elem : mas) {
                    if (elem > maxx) {
                        maxx=elem;
                    }
                    if (elem > 0){
                        sumplus+=elem;
                        kolpol+=1;
                    }
                    if (elem < 0){
                        if( elem % 2 == 0){
                            sumotrn+=elem;
                        }
                        kolotr+=1;
                        sumotr+=elem;
                    }
                }
                System.out.println();
                System.out.println("Максимальное значение = " + maxx);
                System.out.println("Сумма положительных элемнтов = " + sumplus);
                System.out.println("Сумма четных отрицательных элементов = " + sumotrn);
                System.out.println("Кол-во положительных элементов = " + kolpol);
                System.out.println("Ср. ар. отрицательных элементов = " + (sumotr/kolotr));
                break;
            case (9):
                int mass[] = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
                for (int i: mass){
                    System.out.print(i + " ");
                }
                int newmas[] = new int[mass.length];
                for (int i = mass.length-1; i>=0; i--){
                    newmas[mass.length-i-1] = mass[i];
                }
                System.out.println();
                for (int i: newmas){
                    System.out.print(i + " ");
                }
                break;
            case (10):
            int masss[] = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
            for (int i: masss){
                System.out.print(i + " ");
            }
            int kolzero = 0;
            for (int i : masss){
                if (i == 0) {kolzero++;}
            }
            int maspos[] = new int[kolzero];
            int k = 0;
            for (int i = 0; i<masss.length; i++){
                if (masss[i]==0) {
                    maspos[k] = i-k;
                    k++;
                }
            }
            for (int i : maspos){
                for(int j = i; j<masss.length-1; j++){
                    masss[j]=masss[j+1];
                }
            }
            for (int i = masss.length-maspos.length; i<masss.length; i++){
                masss[i]=0;
            }
            System.out.println();
            for (int i: masss){
                System.out.print(i + " ");
            }
                break;

        }
    }
}