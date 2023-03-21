/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PostTest2_SpotifyApp;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ASUS
 */
class DataLaguSpotify {
  // property class
    private String judul;
    private String penyanyi;
    private double durasi;
    private int tahun;
    
    
    // constructor untuk menghubungkan obj dan arraylist
    public DataLaguSpotify(String judul, String penyanyi, double durasi, int tahun){
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
        this.tahun = tahun;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the penyanyi
     */
    public String getPenyanyi() {
        return penyanyi;
    }

    /**
     * @param penyanyi the penyanyi to set
     */
    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
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

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
   
    
}
