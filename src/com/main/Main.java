package com.main;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  try (Scanner inputData = new Scanner(System.in)) {
    System.out.println("Panjang =");
      int inputPanjang = inputData.nextInt();
      System.out.println("Lebar =");
      int inputLebar = inputData.nextInt();
      gambar(inputPanjang,inputLebar);
    
      System.out.println("Luas =" + luas(inputPanjang,inputLebar));
      System.out.println("Keliling =" + keliling(inputPanjang,inputLebar));
    
      tampilKelilingDanLuas(inputPanjang, inputLebar);
}
 }

 private static void tampilKelilingDanLuas(int panjang, int lebar) {
    System.out.println("Luas =" + luas(panjang,lebar));
  System.out.println("Keliling =" + keliling(panjang,lebar));
 }

private static int keliling( int panjang, int lebar) {
    int hasil = (panjang+lebar)*2;
    return hasil;
}

 private static int luas(int panjang, int lebar) {
    int hasil = panjang*lebar;
    return hasil;
 }

 private static void gambar(int panjang, int lebar) {
    for (int i = 0; i < lebar; i++) {
        for (int j = 0; j < panjang; j++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
  }
}
  


