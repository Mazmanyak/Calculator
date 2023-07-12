package Calculator;

class ArabVichislenie {
    int arabVichislenie(int a, String c, int b) { // Метод вычислений
        return switch (c) {
            case "-" -> a - b;
            case "+" -> a + b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new RuntimeException();
        };
    }
}
