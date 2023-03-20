/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PostTest3_SpotifyApp;

/**
 *
 * @author ASUS
 */
public class Songs extends Album{
    private String judul_lagu;
    private double durasi;

    public Songs(String judul_album, int tahun_album, String nama_artis, String username, int total_lagu, String judul_lagu, double durasi) {
        super(judul_album, tahun_album, nama_artis, username, total_lagu);
        this.judul_lagu = judul_lagu;
        this.durasi = durasi;
    }



    /**
     * @return the judul_lagu
     */
    public String getJudul_lagu() {
        return judul_lagu;
    }

    /**
     * @param judul_lagu the judul_lagu to set
     */
    public void setJudul_lagu(String judul_lagu) {
        this.judul_lagu = judul_lagu;
    }

    /**
     * @return the durasi
     */
    public double getDurasi() {
        return durasi;
    }

    /**
     * @param durasi the durasi to set
     */
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }
    
}
