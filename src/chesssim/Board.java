/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;

/**
 *
 * @author Vien
 */
public class Board {
    private final int board[][] = new int[8][8];  
    
    public void setCoord(int x, int y, int n)
    {
        board[y][x] = n;
    }
    
    public boolean isSafe(int x, int y)
    {
        return (x < 8 && y < 8 && x >=0 && y >=0 && board[y][x] == 0);
    }
       
    public void printBoard()
    {
        int i, j;
        for(i = 7; i >= 0; i--)
        {
            for(j = 0; j < 8; j++)
            {
                System.out.print(board[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
