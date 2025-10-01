/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng phần tử
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        
        // Khai báo mảng
        int[] arr = new int[n];
        
        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Sắp xếp và xuất mảng
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        
        // Tìm và xuất phần tử nhỏ nhất
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phan tu nho nhat: " + min);
        
        // Tính trung bình cộng các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + average);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3");
        }
        
        scanner.close();
    }
} 