import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese base y exponente: ");
            
            int base = scanner.nextInt();
            int exponente = scanner.nextInt();
            int resultado = Operaciones.potencia(base, exponente);
            System.out.println("Resultado: " + resultado);
        }
        Operaciones operacion=new Operaciones();
    }
}
