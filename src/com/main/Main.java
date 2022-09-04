package com.main;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  // Case Menggunakan statement if & else
  // memasukan nilai user
//   Scanner inputUser;
//   float a,b,hasil;
//   char operator;
// inputUser = new Scanner(System.in);
// System.out.println("input nilai a = ");
// a = inputUser.nextFloat();
// System.out.println("input operator = ");
// operator = inputUser.next().charAt(0);
// System.out.println("input nilai b = ");
// b = inputUser.nextFloat();
// System.out.println("Input Rumus Berupa " + a + " " + operator + " " + b);

// //Menentukan nilai user pada operator & rumus

// if ( operator == '+') {
//   hasil = a + b;
//  System.out.println("Hasilnya adalah " + hasil);
  
// } else if ( operator == '-' ){
//   hasil = a - b;
//  System.out.println("Hasilnya adalah " + hasil);

// } else if ( operator == '*' ){
//   hasil = a * b;
//  System.out.println("Hasilnya adalah " + hasil);

// } else if ( operator == '/' ){
// if ( a == 0 ) {
//   System.out.println("Tidak boleh ada angka 0");
// } else if ( b == 0 ) {
//   System.out.println("Tidak boleh ada angka 0");
// } else {
//  hasil = a/b;
//  System.out.println("Hasilnya adalah " + hasil);
// }
//  } else {
//   System.out.println("Operator Tidak ada");
// }
      // Menggunakan Statement Switch Case

      Scanner inputUser;
  float a,b,hasil;
  String operator;
inputUser = new Scanner(System.in);
System.out.println("input nilai a = ");
a = inputUser.nextFloat();
System.out.println("input operator = ");
operator = inputUser.next();
System.out.println("input nilai b = ");
b = inputUser.nextFloat();
System.out.println("Input Rumus Berupa " + a + " " + operator + " " + b);

// Rumus dengan Switch Case

switch (operator) {
  case "+":
    hasil = a + b;
    System.out.println("Hasil" + hasil);
    break;
    case "-":
    hasil = a - b;
    System.out.println("Hasil" + hasil);
    break;
    case "*":
    hasil = a * b;
    System.out.println("Hasil" + hasil);
    break;
    case "/":
    hasil = a / b;
    System.out.println("Hasil" + hasil);
    break;
  default:
  System.out.println("Tidak ada rumusnya maaf");
    break;
}
 }
}
  


