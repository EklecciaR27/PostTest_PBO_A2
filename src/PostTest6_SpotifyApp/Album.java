package PostTest5_SpotifyApp;

public class Album extends Artist {
    private String judul_album;
    private int tahun_album;

    protected Album(String judul_album, int tahun_album, String nama_artis, String username, int total_lagu) {
        super(nama_artis, username, total_lagu);
        this.judul_album = judul_album;
        this.tahun_album = tahun_album;
    }

    @Override
    protected final void outputArtist() {
        System.out.println("== ARTIST DATA ==");
    }

    @Override
    protected final void outputAlbum() {
        System.out.println("== ALBUM DATA ==");
    }

    @Override
    protected final void outputSongs() {
        System.out.println("== SONGS DATA ==");
    }

    protected String getJudul_album() {
        return judul_album;
    }

    protected void setJudul_album(String judul_album) {
        this.judul_album = judul_album;
    }

    protected int getTahun_album() {
        return tahun_album;
    }

    protected void setTahun_album(int tahun_album) {
        this.tahun_album = tahun_album;
    }

}
