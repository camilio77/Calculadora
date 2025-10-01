public class Operaciones {
    public static double division(int dividendo, int divisor) {
        if (divisor == 0) {
            System.out.println("Error");
            return -1;
        }

        return (double) dividendo / divisor;
    }

    public static double raiz(double numero, double indice) {
        if (indice <= 0) {
            System.out.println("Error");
            return -1;
        }

        if (numero < 0 && indice % 2 == 0) {
            System.out.println("Error");
            return -1;
        }

        return Math.pow(numero, 1.0 / indice);
    }
}
