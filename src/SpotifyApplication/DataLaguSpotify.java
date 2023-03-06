/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpotifyApplication;

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
    String judul;
    String penyanyi;
    double durasi;
    int tahun;
    
    
    // constructor untuk menghubungkan obj dan arraylist
    public DataLaguSpotify(String judul, String penyanyi, double durasi, int tahun){
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
        this.tahun = tahun;
    }
   
    
}
