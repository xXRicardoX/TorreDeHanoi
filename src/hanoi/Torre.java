package hanoi;

public class Torre {
    /**
     * Esta classe é responsável por:
     * 1. Criar as torres quando a quantidade de anéis é fornecida.
     * 2. Mover um anel quando os números da torre de origem e de destino são fornecidos.
     * 3. Imprimir todas as torres quando solicitado.
     */

    private int alturaMaxima; // Quantidade total de anéis
    private int[] altura; /* Irá armazenar o número de anéis
                           com respeito a cada índice da torre */
    private int[][] torres; /* Irá armazenar os tamanhos dos anéis em cada torre. */

    public Torre(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        altura = new int[3];
        torres = new int[3][alturaMaxima]; /* Qualquer torre deve ser capaz de
                                             armazenar todos os anéis */
        altura[0] = alturaMaxima; /* Inicialmente, a primeira torre tem todos os anéis.
                                    As outras duas recebem 0 por padrão. */
        for (int i = 0; i < alturaMaxima; i++) {
            torres[0][i] = alturaMaxima - i;

            /* Atribui os tamanhos dos anéis
             * para a torre 1 cujo índice é 0
             * torres[0][0] dá o tamanho do anel inferior
             * torres[0][alturaMaxima - 1] dá o tamanho do anel superior
             */
        }
    }

    public void move(int fonte, int destino) {
        /* Esta função moverá um anel da torre de origem
           para a torre de destino */
        int fontIndex = fonte - 1;
        int destinoIndex = destino - 1;
        int destinoTopoAnelIndex = altura[destinoIndex] - 1;
        int fonteTopoAnelIndex = altura[fontIndex] - 1;
        // Copia o anel da origem para o destino
        torres[destinoIndex][destinoTopoAnelIndex + 1] = torres[fontIndex][fonteTopoAnelIndex];
        // Remove o anel da origem
        torres[fontIndex][fonteTopoAnelIndex] = 0;
        // Reduz a altura da torre de origem em um
        altura[fontIndex]--;
        // Aumenta a altura da torre de destino em um
        altura[destinoIndex]++;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int[] getAltura() {
        return altura;
    }

    public int[][] getTorres() {
        return torres;
    }

    private void print(char c, int n) {
        // Imprime o caractere 'c' um número 'n' de vezes
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public void printTorres() {
        int h1 = altura[0], h2 = altura[1], h3 = altura[2];
        int[][] anelTamanho = torres;
        /* Para acompanhar o número de espaços restantes para imprimir em cada torre */
        int[] spaces = {alturaMaxima - h1, alturaMaxima - h2, alturaMaxima - h3};
        /* Para acompanhar o número de anéis restantes para imprimir em cada torre */
        int[] aneis = {h1, h2, h3};

        for (int saida = 1; saida <= alturaMaxima; saida++) {
            for (int i = 0; i < 3; i++) {
                if (spaces[i] > 0) {
                    print(' ', alturaMaxima);
                    System.out.print('|');
                    print(' ', alturaMaxima);
                    spaces[i]--;
                } else {
                    // Imprime o anel com tamanho adequado para o índice da torre i
                    int anelIndex = aneis[i] - 1;
                    print(' ', alturaMaxima - anelTamanho[i][anelIndex]);
                    print('=', anelTamanho[i][anelIndex]);
                    System.out.print("|");
                    print('=', anelTamanho[i][anelIndex]);
                    print(' ', alturaMaxima - anelTamanho[i][anelIndex]);
                    aneis[i]--;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
