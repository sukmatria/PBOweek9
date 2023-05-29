/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Contact;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aspire
 */
public class MyContacts {

    public MyContacts(String nama, String telepon) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Silahkan Masukkan Kontak Baru");
        System.out.println();
       

        System.out.print("3: ");
        Scanner scanner = new Scanner(System.in);
        int tambahKontak = scanner.nextInt();
       
        // Input nama dan nomor telepon sebanyak N data
        ArrayList<MyContacts> contact = new ArrayList<>();
        for (int i=1;i<=tambahKontak;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Data ke - 1"+i);
            System.out.print("Masukkan Nama: sukma");
            String nama = input.nextLine();
            System.out.print("Masukkan No. Telepon:0899958884848 ");
            String telepon = input.nextLine();
           
            System.out.println("Data ke - 2"+i);
            System.out.print("Masukkan Nama: tria");
            System.out.print("Masukkan No. Telepon:0554837738384 ");
            contact.add(new MyContacts(nama,telepon));
            
            System.out.println("Data ke - 3"+i);
            System.out.print("Masukkan Nama: wati");
            System.out.print("Masukkan No. Telepon:0568558559494 ");
            contact.add(new MyContacts(nama,telepon));
        }
       
        // Output data yang sudah ditambahkan
        System.out.println("");
        System.out.println("");
        System.out.println("### Data Yang Berhasil Ditambahkan ###");
        for (MyContacts kontak : contact) {
            System.out.println();
            System.out.println("Nama : "+kontak.getNama());
            System.out.println("No. Telepon : "+kontak.getNoTelp());
        }
    }

    private String getNama() {
        return (null);
    }
    private String getNoTelp() {
        
        return (null);
        
    }
}

    

