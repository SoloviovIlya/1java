package ru.geekbrains.lesson1;
import java.util.Scanner;
public class java1{
    private static Scanner sc;
    public static void main(String[] args){
        int i, n;
        long Sum = 0;
        long Fctl = 1;
        sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = sc.nextInt();
        for (i = 1; i<=n; i++) {
            Sum = Sum + i;
            Fctl = Fctl*i;
        }
        System.out.format("\nСумма = %d, Факториал = %d", Sum, Fctl);
    }
}