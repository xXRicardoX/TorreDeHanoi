package hanoi;

public class TorreSolucao {
    private int contador = 0; // Para rastrear a contagem de passos
    private Torre t;
    public TorreSolucao(Torre t){this.t = t;}

    /**
     * Lógica para mover n discos da torre fonte para a torre destino.
     * Se n for igual a 1,
     *      move o disco da fonte para o destino.
     * Caso contrário, para mais de um disco na torre fonte:
     *      1) Move n - 1 discos da fonte para a torre auxiliar.
     *      2) Move o último disco da fonte para o destino.
     *      3) Move n - 1 discos da torre auxiliar para o destino.
     * Para os passos 1 e 3, a mesma lógica é aplicada para n discos.
     * Além disso, os números das torres de origem, destino e auxiliar
     * devem mudar conforme necessário.
     *
     * @param altaTorre O número de discos a serem movidos.
     * @param fonte A torre de origem.
     * @param destino A torre de destino.
     * @param aux A torre auxiliar.
     */

    public void solucao(int altaTorre, int fonte,
                        int destino, int aux) {
        if (altaTorre == 1) {
            t.move(fonte, destino);
            System.out.println("PASSO " + (++contador));
            t.printTorres();
        } else {
            solucao(altaTorre - 1, fonte, aux, destino);
            t.move(fonte, destino);
            System.out.println("Passo " + (++contador));
            t.printTorres();
            solucao(altaTorre - 1, aux, destino, fonte);
        }
    }
}
