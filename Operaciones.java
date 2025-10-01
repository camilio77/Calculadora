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
            System.out.println("Error: no se puede dividir entre cero.");
            return -1; // Valor especial para indicar error
        }

        return (double) dividendo / divisor;
    }
}
