/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package Abstraction_Interface;
/**
 *
 * @author ASUS
 */

class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari() {
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
