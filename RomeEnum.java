package Calculator;

enum RomeEnum {

    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10),
    XX(20),
    XXX(30),
    XL(40),
    L(50), // ";" обязательно, если после него надо код писать.
    LX(60),
    LXX(70),
    LXXX(80),
    XD(90),
    D(100);
    public final int value;

    RomeEnum(int d) {
        value = d;
    }
}

