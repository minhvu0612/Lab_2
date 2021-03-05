/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.Scanner;

/**
 *
 * @author vungo
 */
public class Add_matrix {
    private int matrix_1[][];
    private int matrix_2[][];
    private int matrix[][];
    private int m;
    private int n;
    public void set_m(int m){
        this.m = m;
    }
    public void set_n(int n){
        this.n = n;
        this.matrix_1 = new int[this.m][n];
        this.matrix_2 = new int[this.m][n];
        this.matrix = new int[this.m][n];
    }
    public void set_matrix(){
        for (int i = 0; i < this.m; i++){
            for (int j = 0; j < this.n; j++){
                Scanner key_1 = new Scanner(System.in);
                this.matrix_1[i][j] = key_1.nextInt();
                Scanner key_2 = new Scanner(System.in);
                this.matrix_2[i][j] = key_2.nextInt();
            }
        }
    }
    public void add_matrix(){
        for (int i = 0; i < this.m; i++){
            for (int j = 0; j < this.n; j++){
                this.matrix[i][j] = this.matrix_1[i][j] + this.matrix_2[i][j];
            }
        }
    }
    public void get_matrix(){
        for (int i = 0; i < this.m; i++){
            for (int j = 0; j < this.n; j++){
                System.out.println(this.matrix[i][j]);
            }
        }
    }
}
