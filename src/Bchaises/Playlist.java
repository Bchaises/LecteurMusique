package Bchaises;

import java.util.ArrayList;

public class Playlist extends ArrayList<Chanson> {

    private int id;
    private String nom;

    public Playlist(){
        super();
        this.id = -1;
        this.nom = "unnamed";
    }

    public Playlist(int i, String n){
        super();
        this.id = i;
        this.nom = n;
    }

    //setter
    public void setId(int i) { this.id = i; }
    public void setNom(String n) { this.nom = n; }

    // getter
    public int getId() { return this.id; }
    public String getNom() { return this.nom; }
}
