package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng Scanner sau khi sử dụng
        try (Scanner scanner = new Scanner(System.in)) {
            String maSinhVien = "";
            String hoTen = "";
            double diem = 0.0;

            // Chỉ sử dụng 1 vòng lặp while(true) để nhập và kiểm tra tất cả các thông tin
            while (true) {
                // Nhập mã sinh viên
                System.out.print("Nhập mã sinh viên: ");
                maSinhVien = scanner.nextLine().trim();
                if (maSinhVien.isEmpty()) {
                    System.out.println("Mã sinh viên không được để trống. Vui lòng nhập lại!");
                    continue; // Nếu không hợp lệ, quay lại vòng lặp để nhập lại từ đầu
                }

                // Nhập họ tên
                System.out.print("Nhập họ tên: ");
                hoTen = scanner.nextLine().trim();
                if (hoTen.isEmpty()) {
                    System.out.println("Họ tên không được để trống. Vui lòng nhập lại!");
                    continue; // Nếu không hợp lệ, quay lại vòng lặp để nhập lại từ đầu
                }

                // Nhập điểm và kiểm tra kiểu dữ liệu
                System.out.print("Nhập điểm: ");
                String diemInput = scanner.nextLine().trim();
                try {
                    diem = Double.parseDouble(diemInput);
                } catch (NumberFormatException e) {
                    System.out.println("Bạn phải nhập dữ liệu là kiểu số. Vui lòng nhập lại!");
                    continue; // Nếu điểm không hợp lệ, quay lại vòng lặp để nhập lại từ đầu
                }

                // Nếu tất cả thông tin đều hợp lệ thì thoát vòng lặp
                break;
            }

            // Tạo đối tượng SinhVien và hiển thị thông tin
            SinhVien sv = new SinhVien(maSinhVien,hoTen,diem);
            System.out.println("Thông tin sinh viên: " + sv);
        }
    }
}
