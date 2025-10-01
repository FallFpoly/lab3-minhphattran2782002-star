/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số từ bàn phím
        System.out.print("Nhap mot so nguyen: ");
        int N = scanner.nextInt();
        
        // Kiểm tra số nguyên tố
        boolean isPrime = true;
        
        if (N < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Hiển thị kết quả
        if (isPrime) {
            System.out.println(N + " la so nguyen to.");
        } else {
            System.out.println(N + " khong phai la so nguyen to.");
        }
        
        scanner.close();
    }
}