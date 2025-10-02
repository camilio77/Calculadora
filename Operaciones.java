public class Operaciones {
    
    public static int potencia(int base, int exponente) {
        int resultado = 1;

        if (exponente < 0) {
            System.out.println("Este método solo admite exponentes enteros no negativos.");
            return -1;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

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
    
    public double suma(double primero, double segundo) {
        return primero + segundo;
    }
}
