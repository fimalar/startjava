public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void calc() {
        int result = 1;
        switch (getSign()) {
            case '+':
                result = getA() + getB();
                break;
            case '-':
                result = getA() - getB();
                break;
            case '*':
                result = getA() * getB();
                break;
            case '/':
                if (b != 0) {
                    result = getA() / getB();
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            case '^':
                for (int i = 0; i < getB(); i++) {
                    result *= getA() ;
                }
                break;
            case '%':
                result = getA() % getB();
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
        }
        System.out.println(getA() + " " + getSign() + " " + getB() + " = " + result);
    }
}