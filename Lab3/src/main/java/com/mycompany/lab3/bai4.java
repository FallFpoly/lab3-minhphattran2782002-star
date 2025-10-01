/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa
        
        // Khai báo 2 mảng
        String[] names = new String[n];
        double[] scores = new double[n];
        
        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            names[i] = scanner.nextLine();
            System.out.print("Diem: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng thừa
        }
        
        // Xuất thông tin sinh viên với học lực (trước khi sắp xếp)
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            String rank = getRank(scores[i]);
            System.out.println("Ho ten: " + names[i]);
            System.out.println("Diem: " + scores[i]);
            System.out.println("Hoc luc: " + rank);
            System.out.println("------------------------");
        }
        
        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        sortStudents(names, scores);
        
        // Xuất danh sách sau khi sắp xếp
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP ===");
        for (int i = 0; i < n; i++) {
            String rank = getRank(scores[i]);
            System.out.println("Ho ten: " + names[i]);
            System.out.println("Diem: " + scores[i]);
            System.out.println("Hoc luc: " + rank);
            System.out.println("------------------------");
        }
        
        scanner.close();
    }
    
    // Phương thức xác định học lực
    public static String getRank(double score) {
        if (score < 5) {
            return "Yeu";
        } else if (score >= 5 && score < 6.5) {
            return "Trung binh";
        } else if (score >= 6.5 && score < 7.5) {
            return "Kha";
        } else if (score >= 7.5 && score < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    // Phương thức sắp xếp sinh viên tăng dần theo điểm (sử dụng Bubble Sort)
    public static void sortStudents(String[] names, double[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Hoán đổi điểm
                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;
                    
                    // Hoán đổi tên tương ứng
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}