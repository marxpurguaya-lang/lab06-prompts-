import java.util.Random;

public class SimuladorTemperatura {

    static String[] opciones = {
        "BiblioTec",
        "LectoGo",
        "NubeDeTinta",
        "LibroNet",
        "LecturaPlus"
    };

    static double[] puntajes = {
        3.0,
        2.0,
        1.5,
        1.0,
        0.5
    };

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Uso: java SimuladorTemperatura <temperatura>");
            return;
        }

        double temperatura = Double.parseDouble(args[0]);

        double[] prob = calcularProbabilidades(temperatura);

        System.out.println("Temperatura: " + temperatura);
        System.out.println("\nProbabilidades:");

        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%-15s %.2f%%%n",
                    opciones[i], prob[i] * 100);
        }

        System.out.println("\n5 intentos:");

        Random azar = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.print(elegir(prob, azar)
                    + (i < 4 ? ", " : "\n"));
        }
    }

    static double[] calcularProbabilidades(double t) {

        double[] prob = new double[puntajes.length];

        if (t <= 0) {
            prob[0] = 1.0;
            return prob;
        }

        double suma = 0;

        for (int i = 0; i < puntajes.length; i++) {
            prob[i] = Math.exp(puntajes[i] / t);
            suma += prob[i];
        }

        for (int i = 0; i < prob.length; i++) {
            prob[i] = prob[i] / suma;
        }

        return prob;
    }

    static String elegir(double[] prob, Random azar) {

        double r = azar.nextDouble();
        double acumulado = 0;

        for (int i = 0; i < prob.length; i++) {
            acumulado += prob[i];

            if (r < acumulado) {
                return opciones[i];
            }
        }

        return opciones[opciones.length - 1];
    }
}