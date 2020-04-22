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
import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa hanghoa){
        dshh.add(hanghoa);
    }
    
    public int tongTienHangHoa(){
        int tong = 0;
        for(int i =0;i<dshh.size();i++)
        {
            tong+=dshh.get(i).getGia();
        }
        return tong;
    }
    
    public int tienKhachHangPhaiTra(){
        return (int) hinhThucTT.thanhtoan(tongTienHangHoa());
    }
    
    public void hienthiGioHang(){
        for(int i =0;i<dshh.size();i++){
            dshh.get(i).hienThiHangHoa();
        }
    }
    
}