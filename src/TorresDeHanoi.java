import hanoi.Torre;
import hanoi.TorreSolucao;

import java.util.Scanner;

public class TorresDeHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrada de valor para a quantidades de aneis: ");
        int altura;
        altura = sc.nextInt();
        Torre t;
        t = new Torre(altura);
        // Cria torres com a quantidade de anéis especificada
        t.printTorres();
        // Exibe todas as 3 torres

        TorreSolucao solucao;
        solucao = new TorreSolucao(t);

        solucao.solucao(altura, 1, 2, 3);

        /**
         * solucao.solucao(
         * int alturaTorreOrigem,
         * int numeroTorreOrigem,
         * int numeroTorreDestino,
         * int numeroTorreAuxiliar
         * )
         */
    }
}