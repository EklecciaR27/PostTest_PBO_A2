/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PostTest3_SpotifyApp;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

/**
 *
 * @author ASUS
 */
public class Main {
    static ArrayList<Songs> songs = new ArrayList<Songs>();
    
     // untuk menerima inputan 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {

        while (true){
            System.out.println("======= SPOTIFY DATABASE INHERITANCE =======");
            System.out.println("[1] Create");
            System.out.println("[2] Read");
            System.out.println("[3] Update");
            System.out.println("[4] Delete");
            System.out.println("[5] EXIT");
            System.out.println("================================");
            System.out.print("Masukan Pilihan Menu : ");
            int pilihan = Integer.parseInt(br.readLine());

            if (pilihan == 1){
               createdata();
            }  
            if (pilihan == 2){
                readdata();
            }
            if (pilihan == 3){
                updatedata();
            }
            if (pilihan == 4){
                deletedata();
            }
            if (pilihan == 5){
                System.exit(0);
            }
        }
    }
    
    public static void createdata() throws IOException {
        System.out.println("--------------CREATE DATA------------");
        System.out.println("== ARTIST DATA ==");
        System.out.print("Nama Artist : ");
        String nama_artis = br.readLine();

        System.out.print("Username : ");
        String username = br.readLine();
        
        System.out.print("Total Lagu : ");
        int total_lagu= Integer.parseInt(br.readLine());

        System.out.println("== ALBUM DATA ==");
        System.out.print("Judul Album : ");
        String judul_album = br.readLine();

        System.out.print("Tahun Album : ");
        int tahun_album= Integer.parseInt(br.readLine());
        
        System.out.println("== SONGS DATA ==");
        System.out.print("Judul Lagu : ");
        String judul_lagu= br.readLine();
        
        System.out.print("Durasi : ");
        double durasi = Double.parseDouble(br.readLine());
        
        Songs newsongs = new Songs(judul_album, tahun_album, nama_artis, username, total_lagu, judul_lagu, durasi);
        songs.add(newsongs); 
}
    
    public static void readdata() throws IOException{
        System.out.println("================ DATA LAGU SPOTIFY =============");
        if (songs.isEmpty()){
                System.out.println("DATA WAS NOT AVAILABLE BABE...\n");
        }
        else{
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("[" + (i+1) + "]");
            System.out.println("Nama Artis : " + songs.get(i).getNama_artis());
            System.out.println("Username : " + songs.get(i).getUsername());
            System.out.println("Total Lagu : " + songs.get(i).getTotal_lagu());
            System.out.println("------------------------------------------");
            System.out.println("Judul Album : " + songs.get(i).getJudul_album());
            System.out.println("Tahun Album : " + songs.get(i).getTahun_album());
            System.out.println("------------------------------------------");
            System.out.println("JudulLagu : " + songs.get(i).getJudul_lagu());
            System.out.println("Durasi : " + songs.get(i).getDurasi());
            System.out.print("\n");
        }
      }
        
    }
    
    
        public static void readdataupdate() throws IOException{
        System.out.println("================ DATA LAGU SPOTIFY AFTER UPDATING =============");
        if (songs.isEmpty()){
                System.out.println("DATA WAS NOT AVAILABLE BABE...\n");
        }
        else{
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("[" + (i+1) + "]");
            System.out.println("Nama Artis : " + songs.get(i).getNama_artis());
            System.out.println("Username : " + songs.get(i).getUsername());
            System.out.println("Total Lagu : " + songs.get(i).getTotal_lagu());
            System.out.println("------------------------------------------");
            System.out.println("Judul Album : " + songs.get(i).getJudul_album());
            System.out.println("Tahun Album : " + songs.get(i).getTahun_album());
            System.out.println("------------------------------------------");
            System.out.println("JudulLagu : " + songs.get(i).getJudul_lagu());
            System.out.println("Durasi : " + songs.get(i).getDurasi());
            System.out.print("\n");
        }
      }
        
    }
    
    public static void updatedata() throws IOException{
        readdata();
        
        System.out.println("Update Data LAGU");
        System.out.print("Update Data Ke- : ");
        int idx = Integer.parseInt(br.readLine());
        idx--;
        
        System.out.println("== UPDATE ARTIST DATA ==");
        System.out.print("Update Nama Artis : ");
        songs.get(idx).setNama_artis(br.readLine());
        System.out.print("Update Username Artist : ");
        songs.get(idx).setUsername(br.readLine());
        System.out.print("Update Total Lagu  : ");
        songs.get(idx).setTotal_lagu(Integer.parseInt(br.readLine()));
        
        System.out.println("== UPDATE ALBUM DATA ==");
        System.out.print("Update Judul Album : ");
        songs.get(idx).setJudul_album(br.readLine());
        System.out.print("Update Tahun Album : ");
        songs.get(idx).setTahun_album(Integer.parseInt(br.readLine()));
        
        System.out.println("== UPDATE SONGS DATA ==");
        System.out.print("Update Judul Lagu : ");
        songs.get(idx).setJudul_lagu(br.readLine());
        System.out.print("Update Durasi Lagu : ");
        songs.get(idx).setDurasi(Double.parseDouble(br.readLine()));
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("D A T A  K A M U  B E R H A S I L  D I U B A H");
        System.out.println("--------------------------------------------------\n");
        readdataupdate();
        
    }
    
    
    public static void deletedata() throws IOException{
        readdata();
        
        System.out.println("Delete Data Lagu");
        System.out.print("Delete Data Ke- : ");
        int idx = Integer.parseInt(br.readLine());
        
        songs.remove(idx-1);
        
        System.out.println("Data Lagu Ke-" + (idx-1) + " Berhasil di Hapus\n");
        readdataupdate();
    
    }
}


