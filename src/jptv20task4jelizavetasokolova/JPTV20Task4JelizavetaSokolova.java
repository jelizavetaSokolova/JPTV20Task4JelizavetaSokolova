/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task4jelizavetasokolova;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV20Task4JelizavetaSokolova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[100];
        Random rnd = new Random();
        for(int i = 0; i < 100; i++) {
            nums[i] = rnd.nextInt(100);
            while(nums[i] %2 !=1){
                nums[i] = rnd.nextInt(100);
            }
}
        int j=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-6d",nums[i]);
            j++;
            if (j==10){
                System.out.println();
                j=0;
            }
        }
        int summa = 0;
        for (int i = 0; i < nums.length; i++) {
            summa = summa + nums[i];
        }
        double sum=summa/100;
        System.out.println("Среднее арифметическое:"+sum);
   
    }
}