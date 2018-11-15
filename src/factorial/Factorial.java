package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numeroParaFactorizar;
        int numeroFactorial;

        numeroParaFactorizar = 8;

        int i;
        if (numeroParaFactorizar == 0) {
            numeroFactorial = 1;
        } else {
            numeroFactorial = 1;
            for (i = numeroParaFactorizar; i >= 1; i--) {
                numeroFactorial = numeroFactorial * i;
            }
        }

        System.out.println(numeroFactorial);

    }

}
