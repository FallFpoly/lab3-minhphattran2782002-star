/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
public class bai2 {
 
    public static void main(String[] args) {
        System.out.println("BẢNG CỬU CHƯƠNG");
        System.out.println("================");
        
        // Vòng lặp ngoài cho các bảng nhân từ 1 đến 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("\nBảng nhân " + i + ":");
            System.out.println("-------------");
            
            // Vòng lặp trong cho các phép nhân từ 1 đến 10
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}