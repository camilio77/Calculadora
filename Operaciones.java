public class Operaciones {
    
    public  double potencia(double base, double exponente) {
        double resultado = 1;

        if (exponente < 0) {
            System.out.println("Este método solo admite exponentes enteros no negativos.");
            return -1;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public double division(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error");
            return -1;
        }

        return dividendo / divisor;
    }

    public double raiz(double numero, double indice) {
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
    
    public  double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }
}
