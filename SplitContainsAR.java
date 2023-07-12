package Calculator;

class SplitContainsAR {
    String c;
    String[] part;

    void splitContainsArab(String s) {// Проверяет s на содержание [+-*/], запоминает знак, потом разделяет по знаку и удаляет знак
        if (s.contains("+")) { // Проверяет s на содержание [+-*/]
            c = "+";  // запоминает знак
            part = s.split("\\+"); // разделяет по знаку и удаляет знак
        } else if (s.contains("-")) {
            c = "-";
            part = s.split("-");
        } else if (s.contains("*")) {
            c = "*";
            part = s.split("\\*");
        } else if (s.contains("/")) {
            c = "/";
            part = s.split("/");
        } else throw new RuntimeException();
    }
}
