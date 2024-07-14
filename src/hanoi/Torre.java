package hanoi;

import javax.swing.*;

public class Torre {
    /**
     * This class is responsible for the following,
     * 1. Creates the towers when the ring count is given
     * 2. Moving a ring when source and destination
     *    tower numers are provided.
     * 3. Prints all towers when requested
     */

    private int alturaMaxima; // Total ring count
    private int []altura; /* Will store the number of rings
                            with resperct to each tower index*/
    private int [][] torres; /* Will store the sizes of rings in each tower. */
    public Torre(int alturaMaxima){
        this.alturaMaxima = alturaMaxima;
        altura = new int[3];
        torres = new int[3][alturaMaxima]; /* Any tower should be able to
                                            store all the rings*/
        altura[0] = alturaMaxima; /* Initially the first tower has all the rings.
                                    The other two get 0 by default. */
        for(int i = 0; i < alturaMaxima; i++){
            torres[0][i] = alturaMaxima - i;
            /* Assignis the sizes of the rings
            * for tower 1 whose index is 0
            * towers[0][0] gives bottom ring size
            * towers[0][alturaMaxima - 1] gives top ring size
            */
        }
    }

    public void move(int fonte, int destino){
        /* This function will move a ring from the
        source tower to the destinatio tower*/
        int fontIndex = fonte -1;
        int destinoIndex = destino - 1;
        int destinoTopoAnelIndex =
                altura[destinoIndex] - 1;
        int fonteTopoAnelIndex = altura[fontIndex] - 1;
        // Copy ring from source to destination
        torres[destinoIndex][destinoTopoAnelIndex + 1]
                = torres[fontIndex][fonteTopoAnelIndex];
        // Remove ring from source
        torres[fontIndex][fonteTopoAnelIndex] = 0;
        // Reduce source tower height by one
        altura[fontIndex]--;
        // Increase destination tower height by one
        altura[destinoIndex] ++;
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

    private void print(char c, int n){
        // Print the char 'c',a 'n' number of times
        for (int i = 0; i < n; i++)
            System.out.println(c);
    }

    public  void printTorres(){
        int h1 = altura[0], h2 = altura[1], h3 = altura[2];
        int[][] anelTamanho = torres;
        /* To keep track*/
    }
}
