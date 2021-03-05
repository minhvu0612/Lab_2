/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vungo
 */
public class Sort_array {
    private int array[];
    private int n;
    private int sum;
    private double average;
    public void set_size(int n){
        this.n = n;
        this.array = new int[n];
    }
    public void set_array(){
        for (int i = 0; i < this.n; i++){
            Scanner keyboard = new Scanner(System.in);
            this.array[i] = keyboard.nextInt();
        }
    }
    public void sort_array(){
        Arrays.sort(this.array);
    }
    public void get_array(){
        System.out.println(Arrays.toString(this.array));
    }
    public int sum_array(){
        int s = 0;
        for(int i = 0; i < this.n; i++){
            s += this.array[i];
        }
        this.sum = s;
        return this.sum;
    }
    public double average_array(){
        this.average = (double)this.sum / this.n;
        return this.average;
    }
}
