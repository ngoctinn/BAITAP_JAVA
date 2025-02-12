package Bai4;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double diem;
    private String xepLoai;


    public SinhVien(String maSinhVien, String hoTen, double diem) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diem = diem;
        tinhXepLoai();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
        tinhXepLoai();
    }

    public String getXepLoai() {
        return xepLoai;
    }

    private void tinhXepLoai() {
        if(diem >= 8) {
            xepLoai = "Giỏi";
        } else if (diem >= 7){
            xepLoai = "Khá";
        } else if (diem >= 5) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Kém";
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                ", xepLoai='" + xepLoai + '\'' +
                '}';
    }
}
