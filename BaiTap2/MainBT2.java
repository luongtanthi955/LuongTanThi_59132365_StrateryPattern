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
public class MainBT2 {
     public static void main(String[] args) {
      
        HangHoa hh1 = new HangHoa("Tom ",100000,"tom tuoi");
        HangHoa hh2 = new HangHoa("ga", 200000,"ga tuoi");
        HangHoa hh3 = new HangHoa("Vit", 300000,"vit beo");

        
        GioHang giohang1 = new GioHang();
       GioHang giohang2 = new GioHang();
       
       giohang1.setHinhThucTT(new ThanhToanOnline());
       giohang2.setHinhThucTT(new ThanhToanCOD());
       
       giohang1.themHH(hh1);
       
       giohang2.themHH(hh3);

        System.out.println("   Danh sach gio hang 1: " );
        giohang1.hienthiGioHang();
        System.out.println(" Tong tien hang hoa la:  "+giohang1.tongTienHangHoa());
        System.out.println("tien khach  tra la: "+giohang1.tienKhachHangPhaiTra());
        
 
       System.out.println("   Danh sach  gio hang 2 la: " );
        giohang2.hienthiGioHang();
        System.out.println("Tong tien hang hoa la:  "+giohang2.tongTienHangHoa());
        System.out.println(" tien khach tra la  : "+giohang2.tienKhachHangPhaiTra());
    }
}
