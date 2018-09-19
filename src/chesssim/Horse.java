/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;

public class Horse {
    private int x_pos;
    private int y_pos;
    private int counter;
    private final Board board;
    private final int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
    private final int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
    
    
    Horse(int x, int y, Board board)
    {
        x_pos = x;
        y_pos = y;
        this.board = board;
        board.setCoord(x, y, 0);
    }
    
    private void moveFoward(int x, int y)
    {
        x_pos = x;
        y_pos = y;
        counter++;
        board.setCoord(x_pos, y_pos, counter);
    }
    
    private void moveBackwards(int new_x, int new_y, int old_x, int old_y)
    {
        board.setCoord(new_x, new_y, -1);
        x_pos = old_x;
        y_pos = old_y;
        counter--;
    }
    
    public boolean solve()
    {
        int i;
        
        if(counter == 63)
        {
            return true;
        }
        
        for(i = 0; i < 8; i++)
        {
            int old_x = x_pos;
            int old_y = y_pos;
            int new_x = x_pos + xMove[i];
            int new_y = y_pos + yMove[i];
            
            if(board.isSafe(new_x, new_y))
            {
                moveFoward(new_x, new_y);
//                board.printBoard();
//                System.out.println();
                if(solve())
                {
                    return true;
                }
                else
                {
                    moveBackwards(new_x, new_y, old_x, old_y);
//                    board.printBoard();
//                    System.out.println();
                }
            }
        }
        return false;
    }   
}
