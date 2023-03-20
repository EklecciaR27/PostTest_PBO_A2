/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PostTest3_SpotifyApp;

/**
 *
 * @author ASUS
 */
public class Album extends Artist{
    private String judul_album;
    private int tahun_album;

    public Album(String judul_album, int tahun_album, String nama_artis, String username, int total_lagu) {
        super(nama_artis, username, total_lagu);
        this.judul_album = judul_album;
        this.tahun_album = tahun_album;
    }
    


    /**
     * @return the judul_album
     */
    public String getJudul_album() {
        return judul_album;
    }

    /**
     * @param judul_album the judul_album to set
     */
    public void setJudul_album(String judul_album) {
        this.judul_album = judul_album;
    }

    /**
     * @return the tahun_album
     */
    public int getTahun_album() {
        return tahun_album;
    }

    /**
     * @param tahun_album the tahun_album to set
     */
    public void setTahun_album(int tahun_album) {
        this.tahun_album = tahun_album;
    }
    
    
}
