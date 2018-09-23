/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesssim;
import java.util.Random;
/**
 *
 * @author Vien
 */
public class IntGen {
    public static int genInt(int max)
    {
        Random r = new Random();
        return r.nextInt(max);
    }
}
