package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Kata Academy!");
        System.out.println("====================");
        System.out.println("Введите выражение арабскими или римскими числами от 1 до 10 включительно");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Ввод строки
        System.out.println(Main.calc(s));
        sc.close(); // Заканчивает действие сканера
    }
}
