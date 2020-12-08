package Bchaises;

public class Chanson {
    private int id;
    private String titre;
    private String artiste;
    private String album;
    private String genre;
    private int duree;

    public Chanson(){
        this.id = -1;
        this.titre = "unnamed";
        this.artiste = "unknown";
        this.album = "unnamed";
        this.genre = "unknown";
        this.duree = -1;
    }

    public Chanson(int i, String t, String art, String alb, String g, int d){
        this.id = i;
        this.titre = t;
        this.artiste = art;
        this.album = alb;
        this.genre = g;
        this.duree = d;
    }

    // setter
    public void setId(int i) { this.id = i; }
    public void setTitre(String t) { this.titre = t; }
    public void setArtiste(String art) { this.artiste = art; }
    public void setAlbum(String alb) { this.album = alb; }
    public void setGenre(String g) { this.genre = g; }
    public void setDuree(int d) { this.duree = d; }

    // getter
    public int getId() { return this.id; }
    public String getTitre() { return this.titre; }
    public String getArtiste() { return this.artiste; }
    public String getAlbum() { return this.album; }
    public String getGenre() { return this.genre; }
    public int getDuree() { return this.duree; }
}
