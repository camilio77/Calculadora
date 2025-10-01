public class Operaciones {
    public static double division(int dividendo, int divisor) {
        if (divisor == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return -1;
        }

        return (double) dividendo / divisor;
    }

    public static double raiz(double numero, double indice) {
        if (indice <= 0) {
            System.out.println("El índice de la raíz debe ser mayor que cero.");
            return -1;
        }

        if (numero < 0 && indice % 2 == 0) {
            System.out.println("No se puede calcular la raíz par de un número negativo.");
            return -1;
        }

        return Math.pow(numero, 1.0 / indice);
    }
}
