package Calculator;

class RomanDigits {
    String romeCalc(String s) {
        SplitContainsAR sCaR = new SplitContainsAR();
        sCaR.splitContainsArab(s);
        if (sCaR.part.length == 2) {
            int d = RomeEnum.valueOf(sCaR.part[0]).value;
            int e = RomeEnum.valueOf(sCaR.part[1]).value;
            int ro;
            if (d <= 10 && e <= 10 && d > 0 && e > 0) {
                ArabVichislenie rV = new ArabVichislenie();
                ro = rV.arabVichislenie(d, sCaR.c, e); // Принимает 2 int и один из знаков [+-*/] из класса SplitContains,
                // с ними делает соответствующее арифметическое действие и выдаёт результат int

// Берёт int ro, определяет диапазон, в зависимости от диапазона
// переводит в ENUM или в массив строк или в ENUM + массив строк и печатает в виде римских чисел
                String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                if (ro >= 1 && ro <= 10) {
                    return (i[ro]);
                } else if (ro > 10 && ro <= 20) {
                    return (RomeEnum.X + i[ro - 10]);
                } else if (ro > 20 && ro <= 30) {
                    return (RomeEnum.XX + i[ro - 20]);
                } else if (ro > 30 && ro < 40) {
                    return (RomeEnum.XXX + i[ro - 30]);
                } else if (ro >= 40 && ro < 50) {
                    return (RomeEnum.XL + i[ro - 40]);
                } else if (ro == 50) {
                    return (RomeEnum.L + "");
                } else if (ro > 50 && ro <= 60) {
                    return (RomeEnum.L + i[ro - 50]);
                } else if (ro > 60 && ro <= 70) {
                    return (RomeEnum.LX + i[ro - 60]);
                } else if (ro > 70 && ro <= 80) {
                    return (RomeEnum.LXX + i[ro - 70]);
                } else if (ro > 80 && ro < 90) {
                    return (RomeEnum.LXXX + i[ro - 80]);
                } else if (ro >= 90 && ro < 100) {
                    return (RomeEnum.XD + i[ro - 90]);
                } else if (ro == 100) {
                    return (RomeEnum.D + "");
                } else throw new RuntimeException();
            } else throw new RuntimeException();
        } else throw new RuntimeException();
    }
}
