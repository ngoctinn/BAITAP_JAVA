package Bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class NhanVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String gioiTinh;

    public NhanVien(String hoTen, LocalDate ngaySinh, String gioiTinh) {
        this.hoTen = kiemTraHoTen(hoTen);
        this.ngaySinh = ngaySinh;
        this.gioiTinh = kiemTraGioiTinh(gioiTinh);
    }

    static String kiemTraHoTen(String hoTen) {
        if (hoTen == null || hoTen.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: Họ và tên không được để trống!");
        }
        return hoTen.trim();
    }

    static String kiemTraGioiTinh(String gioiTinh) {
        if (gioiTinh == null || (!gioiTinh.equalsIgnoreCase("Nam") && !gioiTinh.equalsIgnoreCase("Nữ"))) {
            throw new IllegalArgumentException("Lỗi: Giới tính chỉ có thể là 'Nam' hoặc 'Nữ'!");
        }
        return gioiTinh.trim();
    }

    public void tinhThoiGianNghiHuu() {
        int tuoiNghiHuu = gioiTinh.equalsIgnoreCase("Nam") ? 62 : 60;
        LocalDate ngayNghiHuu = ngaySinh.plusYears(tuoiNghiHuu);
        System.out.println("Tháng/Năm nghỉ hưu của nhân viên: " +
                ngayNghiHuu.getMonthValue() + "/" + ngayNghiHuu.getYear());
    }

    public void hienThiThongTin() {
        System.out.println("\n===== Thông tin nhân viên =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Giới tính: " + gioiTinh);
        tinhThoiGianNghiHuu();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen, gioiTinh;
        LocalDate ngaySinh = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Nhập họ tên với kiểm tra ngoại lệ
        while (true) {
            try {
                System.out.print("Nhập họ và tên nhân viên: ");
                hoTen = sc.nextLine();
                hoTen = NhanVien.kiemTraHoTen(hoTen);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        // Nhập ngày sinh
        while (true) {
            try {
                System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
                String ngaySinhStr = sc.nextLine();
                ngaySinh = LocalDate.parse(ngaySinhStr, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.err.println("Lỗi: Ngày sinh không đúng định dạng! Hãy nhập lại.");
            }
        }

        // Nhập giới tính với kiểm tra ngoại lệ
        while (true) {
            try {
                System.out.print("Nhập giới tính (Nam/Nữ): ");
                gioiTinh = sc.nextLine();
                gioiTinh = NhanVien.kiemTraGioiTinh(gioiTinh);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        NhanVien nv = new NhanVien(hoTen, ngaySinh, gioiTinh);
        nv.hienThiThongTin();

        sc.close();
    }
}
