/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author vungo
 */
public class n_stars {
    private int n;
    public void set_n(int n){
        this.n = n;
    }
    public int get_n(){
        return this.n;
    }
    public void draw_stars(){
        int i,j;
        for (i = 0; i < n ; i++){
            for (j = 0; j <= n-i; j++) System.out.print(" ");
            for (j = n+i; j < n; j++) System.out.print(" ");
            for (j = n-i; j <= n+i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
