/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contact;

/**
 *
 * @author Aspire
 */
public class Contacts {
    String nama;
    String noTelp;
 
    /**
     * Constructor
     * @param nama
     * @param noTelp
     */
    public Contacts(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
    }
 
    /**
     * Method getter untuk mendapatkan Nama
     * @return 
     */
    public String getNama() {
        return nama;
    }
 
     /**
     * Method getter untuk mendapatkan Nomor Telepon
     * @return 
     */
    public String getNoTelp() {
        return noTelp;
    }
   
   
   

}
