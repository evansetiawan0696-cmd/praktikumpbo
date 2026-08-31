/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Buku {
    public int idBuku;
    public String judul;
    public int stok;

    public Buku(int idbuku, String judul, int stok){
        this.idBuku = idBuku;
        this.judul = judul;
        this.stok = stok;
        
    }
    
 public void tampilkanInfo(){
     System.out.println("ID Buku " + idBuku);
     System.out.println("Judul Buku " + stok);
 }
}
