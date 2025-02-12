package Bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int[] themPhanTu(int[] arr, int k, int x) {
        if (k < 0 || k > arr.length) {
            throw new IndexOutOfBoundsException("Lỗi: Vị trí thêm không hợp lệ!");
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == k) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    static int[] xoaPhanTu(int[] arr, int k) {
        if (k < 0 || k >= arr.length) {
            throw new IndexOutOfBoundsException("Lỗi: Vị trí xóa không hợp lệ!");
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != k) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Try-with-resources

            System.out.print("Nhập số phần tử của mảng: ");
            int n;
            while (true) {
                try {
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.print("Số phần tử phải lớn hơn 0. Nhập lại: ");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Lỗi: Dữ liệu phải là số nguyên!");
                    sc.nextLine();
                }
            }

            int[] arr = new int[n];

            // Nhập mảng
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                while (true) {
                    try {
                        arr[i] = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.err.println("Lỗi: Dữ liệu phải là số nguyên! Nhập lại: ");
                        sc.nextLine();
                    }
                }
            }

            // Xuất mảng
            System.out.print("Mảng vừa nhập: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Thêm phần tử");
                System.out.println("2. Xóa phần tử");
                System.out.println("3. Thoát");
                System.out.print("Chọn thao tác: ");

                int choice;
                while (true) {
                    try {
                        choice = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.err.println("Lỗi: Dữ liệu phải là số nguyên! Nhập lại: ");
                        sc.nextLine();
                    }
                }

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Nhập vị trí cần thêm: ");
                            int kThem = sc.nextInt();
                            System.out.print("Nhập giá trị cần thêm: ");
                            int xThem = sc.nextInt();

                            arr = themPhanTu(arr, kThem, xThem);

                            System.out.print("Mảng sau khi thêm: ");
                            for (int num : arr) {
                                System.out.print(num + " ");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.err.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.err.println("Lỗi: Dữ liệu phải là số nguyên!");
                            sc.nextLine();
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Nhập vị trí cần xóa: ");
                            int kXoa = sc.nextInt();

                            arr = xoaPhanTu(arr, kXoa);

                            System.out.print("Mảng sau khi xóa: ");
                            for (int num : arr) {
                                System.out.print(num + " ");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.err.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.err.println("Lỗi: Dữ liệu phải là số nguyên!");
                            sc.nextLine();
                        }
                        break;

                    case 3:
                        System.out.println("Thoát chương trình...");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
                }
            }
        }
    }
}
