/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package Polymorphism_Static;
/**
 *
 * @author ASUS
 */

class polymorphismStatic {
    public static void main(String[] args) {
        // memanggil metode perimeter dengan satu argumen
        System.out.println(
                "Sisi Persegi adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");
        // memanggil metode perimeter dengan dua argumen
        System.out.println(
                "Sisi Persegi Panjang adalah : 10,13 \nKeliling Persegi Panjang adalah : "
                        + CompileTime.keliling(10, 13));
    }
}
