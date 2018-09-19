/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;

public class ChessSim {

    public static void main(String[] args) {
        Board board = new Board();
        Horse horse = new Horse(0,0, board);
        
        if(horse.solve())
        {
            System.out.println("Solução encontrada");
            board.printBoard();
        }
        else
            System.out.println("Não existe solução");        
    }   
}
