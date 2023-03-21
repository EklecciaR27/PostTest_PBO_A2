/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PostTest3_SpotifyApp;

/**
 *
 * @author ASUS
 */
public class Artist {
    protected String nama_artis;
    protected String username;
    protected int total_lagu;
    
    public Artist(String nama_artis, String username, int total_lagu){
        this.nama_artis = nama_artis;
        this.username = username;
        this.total_lagu = total_lagu;
    }

    /**
     * @return the nama_artis
     */
    public String getNama_artis() {
        return nama_artis;
    }

    /**
     * @param nama_artis the nama_artis to set
     */
    public void setNama_artis(String nama_artis) {
        this.nama_artis = nama_artis;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the total_lagu
     */
    public int getTotal_lagu() {
        return total_lagu;
    }

    /**
     * @param total_lagu the total_lagu to set
     */
    public void setTotal_lagu(int total_lagu) {
        this.total_lagu = total_lagu;
    }
    
}
