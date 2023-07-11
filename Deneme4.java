/* iki sayıyı topluyor
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deneme4;
import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Birinci sayıyı girin: ");
            int sayi1 = scanner.nextInt();
            
            System.out.print("İkinci sayıyı girin: ");
            int sayi2 = scanner.nextInt();
            
            int toplam = sayi1 + sayi2;
            System.out.println("Toplam: " + toplam);
        }
    }
}
