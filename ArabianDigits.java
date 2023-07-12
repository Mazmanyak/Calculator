package Calculator;


class ArabianDigits {
    int ro;

    int arabCalc(String s) {
        SplitContainsAR sCaR = new SplitContainsAR();
        sCaR.splitContainsArab(s); // Проверяет s на содержание [+-*/], потом разделяет по знаку и удаляет знак,
        // остальные символы помещает в массив строк
        if (sCaR.part.length == 2) {
            int a = Integer.parseInt(sCaR.part[0]); // Выводит первое число из массива строк
            int b = Integer.parseInt(sCaR.part[1]); // Выводит второе число из массива строк
            if (a <= 10 && b <= 10 && a > 0 && b > 0) { // Числа должны быть [1-10]
                ArabVichislenie rV = new ArabVichislenie();
                ro = rV.arabVichislenie(a, sCaR.c, b); // Принимает 2 int и
                // один из знаков [+-*/] из класса SplitContainsArab, с ними делает
                // соответствующее арифметическое действие и выдаёт результат int
            } else {
                throw new RuntimeException();
            }
        } else
            throw new RuntimeException();
        return ro;
    }
}