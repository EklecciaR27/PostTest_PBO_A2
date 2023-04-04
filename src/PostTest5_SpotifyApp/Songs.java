package PostTest5_SpotifyApp;

//penerapan final class
public final class Songs extends Album {
    private String judul_lagu;
    private double durasi;

    protected Songs(String judul_album, int tahun_album, String nama_artis, String username, int total_lagu,
            String judul_lagu, double durasi) {
        super(judul_album, tahun_album, nama_artis, username, total_lagu);
        this.judul_lagu = judul_lagu;
        this.durasi = durasi;
    }

    protected String getJudul_lagu() {
        return judul_lagu;
    }

    protected void setJudul_lagu(String judul_lagu) {
        this.judul_lagu = judul_lagu;
    }

    protected double getDurasi() {
        return durasi;
    }

    protected void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    protected final void berhasil(String judul_lagu) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("L A G U " + (judul_lagu) + " B E R H A S I L  D I T A M B A H ");
        System.out.println("-----------------------------------------------------------------\n");
    }

    protected final void berhasil(int idx) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("D A T A  N O M O R  " + (idx + 1) + "  B E R H A S I L  D I U B A H");
        System.out.println("---------------------------------------------------------------\n");
    }

}
