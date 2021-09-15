/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)Math.floor(Math.random()*(10-0+1)+0);
        }
        int sum = 0;
        
        for (int i = 1; i < array.length-2; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
        
        
        
        
        
        int RANDINT = (int)Math.floor(Math.random()*(10-0+1)+0);
        System.out.print(RANDINT);
        
    }
    
}
