/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author TH-VISTA
 */
public class ThanhtoanOnline implements IThanhToan{
       @Override
    public double thanhtoan(int tienHang) {
        if(tienHang<1000000) return (double)tienHang*0.95;
        return tienHang*0.93;
    }
 
}
