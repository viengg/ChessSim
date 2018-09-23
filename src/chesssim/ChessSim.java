/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;
import java.util.Random;

public class ChessSim {

    public static void main(String[] args) {
        Board board = new Board();       
        Random r = new Random();
        int x = r.nextInt(8);
        int y = r.nextInt(8);
        
        System.out.println("Cavalo iniciado com posições x = "+ x +
                " e y = " + y);
        Horse horse = new Horse(x, y, board);
        
        if(horse.solve())
        {
            System.out.println("Solução encontrada");
            board.printBoard();
        }
        else
            System.out.println("Não existe solução");        
    }   
}
