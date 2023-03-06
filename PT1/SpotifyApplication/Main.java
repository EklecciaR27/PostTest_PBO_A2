/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpotifyApplication;

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
    
    static ArrayList<DataLaguSpotify> ArrayLagu = new ArrayList<DataLaguSpotify>();
    
     // untuk menerima inputan 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {

        while (true){
            System.out.println("======= SPOTIFY DATABASE =======");
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
        System.out.print("Judul Lagu : ");
        String addjudul = br.readLine();

        System.out.print("Penyanyi : ");
        String addpenyanyi = br.readLine();

        System.out.print("Durasi : ");
        double addDurasi = Double.parseDouble(br.readLine());

        System.out.print("Tahun : ");
        int addtahun = Integer.parseInt(br.readLine());

        DataLaguSpotify data = new DataLaguSpotify(addjudul, addpenyanyi, addDurasi, addtahun);
        //add
        ArrayLagu.add(data);
}
    
    public static void readdata() throws IOException{
        System.out.println("================ DATA LAGU SPOTIFY =============");
        for (int i = 0; i < ArrayLagu.size(); i++) {
            System.out.println("[" + (i+1) + "]");
            System.out.println("Judul : " + ArrayLagu.get(i).judul);
            System.out.println("Penyanyi : " + ArrayLagu.get(i).penyanyi);
            System.out.println("Durasi : " + ArrayLagu.get(i).durasi);
            System.out.println("Tahun : " + ArrayLagu.get(i).tahun);
            System.out.print("\n");
        }
    }
    
    public static void updatedata() throws IOException{
        readdata();
        
        System.out.println("Update Data LAGU");
        System.out.print("Update Data Ke- : ");
        int idx = Integer.parseInt(br.readLine());
        
        System.out.print("Judul Lagu : ");
        String updatejudul = br.readLine();

        System.out.print("Penyanyi : ");
        String updatepenyanyi = br.readLine();

        System.out.print("Durasi : ");
        double updatedurasi = Double.parseDouble(br.readLine());

        System.out.print("Tahun : ");
        int updatetahun = Integer.parseInt(br.readLine());
        
        //masukan data update ke array
        ArrayLagu.get(idx-1).judul = updatejudul;
        ArrayLagu.get(idx-1).penyanyi = updatepenyanyi;
        ArrayLagu.get(idx-1).durasi = updatedurasi;
        ArrayLagu.get(idx-1).tahun = updatetahun;
        
        System.out.println("--------------------------");
        System.out.println("DATA KAMU BERHASIL DI UBAH");
        System.out.println("--------------------------\n");
        readdata();
        
    }
    
    
    public static void deletedata() throws IOException{
        readdata();
        
        System.out.println("Delete Data Lagu");
        System.out.print("Delete Data Ke- : ");
        int idx = Integer.parseInt(br.readLine());
        
        ArrayLagu.remove(idx-1);
        
        System.out.println("Data Lagu Ke-" + idx + " Berhasil di Hapus");
        readdata();
    
    
    
    }
}


