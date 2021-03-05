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
public class Day_of_month {
    private int month_set;
    private int month[] = new int[20];
    private int year;
    public void set_year(int year){
        this.year = year;
    }
    public void set_month(int th){
        this.month_set = th;
    }
    public void set_day(){
        if (this.year % 400 == 0){
            this.month[1] = 30;
            this.month[2] = 29;
            this.month[3] = 31;
            this.month[4] = 30;
            this.month[5] = 31;
            this.month[6] = 30;
            this.month[7] = 31;
            this.month[8] = 31;
            this.month[9] = 30;
            this.month[10] = 31;
            this.month[11] = 30;
            this.month[12] = 31;
            return;
        }
        if (this.year % 400 != 0 && this.year % 100 == 0){
            this.month[1] = 31;
            this.month[2] = 28;
            this.month[3] = 31;
            this.month[4] = 30;
            this.month[5] = 31;
            this.month[6] = 30;
            this.month[7] = 31;
            this.month[8] = 31;
            this.month[9] = 30;
            this.month[10] = 31;
            this.month[11] = 30;
            this.month[12] = 31;
            return;
        }
        if (this.year % 4 == 0){
            this.month[1] = 31;
            this.month[2] = 29;
            this.month[3] = 31;
            this.month[4] = 30;
            this.month[5] = 31;
            this.month[6] = 30;
            this.month[7] = 31;
            this.month[8] = 31;
            this.month[9] = 30;
            this.month[10] = 31;
            this.month[11] = 30;
            this.month[12] = 31;
            return;
        }
        else{
            this.month[1] = 31;
            this.month[2] = 29;
            this.month[3] = 31;
            this.month[4] = 30;
            this.month[5] = 31;
            this.month[6] = 30;
            this.month[7] = 31;
            this.month[8] = 31;
            this.month[9] = 30;
            this.month[10] = 31;
            this.month[11] = 30;
            this.month[12] = 31;
        }
    }
    public int get_date(){
        return this.month[this.month_set];
    }
    public int get_year(){
        return this.year;
    }
    public int get_month(){
        return this.month_set;
    }
}
