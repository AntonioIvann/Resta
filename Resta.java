public class Resta {
    private int n1, n2, res;

    public int mostrarResultado() {
        res = n1 - n2;
        return res;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Suma [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]";
    }
}
