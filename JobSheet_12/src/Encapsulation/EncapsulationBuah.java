/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package Encapsulation;
/**
 *
 * @author ASUS
 */

public class EncapsulationBuah {
    // Data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    // declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah) {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    // declaring setter for all fields
    public void setName(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public void setPrice(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }

    public void setColor(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }

    // Declaring Getter for all fields
    public String getName() {
        return namaBuah;
    }

    public String getPrice() {
        return hargaBuah;
    }

    public String getColor() {
        return warnaBuah;
    }
}
