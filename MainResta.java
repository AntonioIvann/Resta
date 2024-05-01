import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = re.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = re.nextInt();
        Resta re1 = new Resta();
        re1.n1 = n1;
        re1.n2 = n2;
        System.out.println("El resultado es: " + re1.mostrarResultado());

    }
}