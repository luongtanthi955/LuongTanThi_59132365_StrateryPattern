/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author TH-VISTA
 */
public class Mainbt1 {
         ITinh tinhToan;

    public void setTinh(ITinh tinh) {
        this.tinhToan = tinh;
    }
  
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    
    }     
}
