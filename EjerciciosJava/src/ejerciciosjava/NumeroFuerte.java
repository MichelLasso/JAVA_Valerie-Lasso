/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 24
public class NumeroFuerte {
    public static void main(String[] args) {
        String num= "A2C";
        double suma= 0;
        for (int i = 0; i < num.length(); i++) {
            double a= Math.pow(16, i);
            suma=suma+a;
        }
        System.out.println(suma);
    }
}
