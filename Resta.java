public class Resta { // Declaración de la clase Resta
    private int n1, n2, res; // Declaración de tres variables privadas de tipo entero: n1, n2 y res (resultado)

    // Método para mostrar el resultado de la resta
    public int mostrarResultado() {
        res = n1 - n2; // Realiza la operación de resta entre n1 y n2 y guarda el resultado en la variable res
        return res; // Devuelve el resultado de la resta
    }

    // Métodos getter y setter para la variable n1
    public int getN1() {
        return n1; // Devuelve el valor de n1
    }

    public void setN1(int n1) {
        this.n1 = n1; // Establece el valor de n1
    }

    // Métodos getter y setter para la variable n2
    public int getN2() {
        return n2; // Devuelve el valor de n2
    }

    public void setN2(int n2) {
        this.n2 = n2; // Establece el valor de n2
    }

    // Métodos getter y setter para la variable res
    public int getRes() {
        return res; // Devuelve el valor de res
    }

    public void setRes(int res) {
        this.res = res; // Establece el valor de res
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Resta [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]"; // Devuelve una cadena que muestra los valores de n1, n2 y res
    }
}
