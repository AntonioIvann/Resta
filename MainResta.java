import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainResta { // Declara una clase pública llamada MainResta
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner re = new Scanner(System.in); // Crea un objeto Scanner llamado 're' para leer la entrada del usuario

        System.out.println("Dame el primer valor: "); // Solicita al usuario que ingrese el primer valor
        int n1 = re.nextInt(); // Lee el primer valor proporcionado por el usuario

        System.out.println("Dame el segundo valor: "); // Solicita al usuario que ingrese el segundo valor
        int n2 = re.nextInt(); // Lee el segundo valor proporcionado por el usuario

        Resta re1 = new Resta(); // Crea un objeto de la clase Resta llamado 're1'

        // Establece los valores n1 y n2 en el objeto 're1' utilizando los métodos setN1() y setN2()
        re1.setN1(n1);
        re1.setN2(n2);

        // Llama al método mostrarResultado() del objeto 're1' para mostrar el resultado de la resta
        re1.mostrarResultado();

        // Imprime el resultado de la resta utilizando el método mostrarResultado() del objeto 're1'
        System.out.println("El resultado de la resta es: " + re1.mostrarResultado());

        // Imprime la representación de cadena del objeto 're1' utilizando el método toString()
        System.out.println(re1.toString());
    }
}
