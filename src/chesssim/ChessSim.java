/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;

public class ChessSim {

    public static void main(String[] args) {
        Board board = new Board();       
        int x = IntGen.genInt(8);
        int y = IntGen.genInt(8);
        
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
