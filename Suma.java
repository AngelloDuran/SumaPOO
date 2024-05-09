public class Suma {
    private int a, b, r;

    public int sumar(int a, int b) {
        r = this.a + this.b;
        return r;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Suma [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
