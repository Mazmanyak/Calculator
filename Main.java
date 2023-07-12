package Calculator;

public class Main {
    public static String calc(String input) {
        int ro;
        input = input.replaceAll(" ", "").toUpperCase(); // Убирает из строки пробелы и делает все символы заглавными
        if (Character.isDigit(input.charAt(0))) { // Первый символ цифра или нет
            ArabianDigits arabD = new ArabianDigits();
            ro = arabD.arabCalc(input);
            return Integer.toString(ro);
        } else {
            RomanDigits romeD = new RomanDigits();
            return romeD.romeCalc(input);
        }
    }
}
