package org.example;

public class Calc {
    public int summ(int a, int b){
        int summresult;
        summresult = a + b;
       /* System.out.println("Сумма " + a + " и " + b + " равна " + result);*/
       // System.out.printf("Сумма %d и %d равна %d", a, b, result);
        System.out.printf("Сумма %d и %d равна %d", a, b, summresult);
        System.out.println();
        return summresult;
    }
    public int subtraction(int a, int b){
        int subresult;
        subresult = a - b;
        System.out.printf("Разность %d и %d равна %d", a, b, subresult);
        System.out.println();
        return subresult;
    }
}
