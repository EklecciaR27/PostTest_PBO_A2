package PostTest5_SpotifyApp;

public abstract class Artist {
    protected String nama_artis;
    protected String username;
    protected int total_lagu;

    protected abstract void outputArtist();

    protected abstract void outputAlbum();

    protected abstract void outputSongs();

    protected Artist(String nama_artis, String username, int total_lagu) {
        this.nama_artis = nama_artis;
        this.username = username;
        this.total_lagu = total_lagu;
    }

    protected String getNama_artis() {
        return nama_artis;
    }

    protected void setNama_artis(String nama_artis) {
        this.nama_artis = nama_artis;
    }

    protected String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected int getTotal_lagu() {
        return total_lagu;
    }

    protected void setTotal_lagu(int total_lagu) {
        this.total_lagu = total_lagu;
    }

    protected final void berhasil() {
        System.out.println("--------------------------------------------------");
        System.out.println("D A T A  K A M U  B E R H A S I L  D I T A M B A H");
        System.out.println("--------------------------------------------------\n");
    }
}
