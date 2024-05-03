import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = re.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = re.nextInt();

        Resta re1 = new Resta();
        re1.setN1(n1);
        re1.setN2(n2);
        re1.mostrarResultado();
        System.out.println("El resultado de la resta es: " + re1.mostrarResultado());
        System.out.println(re1.toString());
    }
}
