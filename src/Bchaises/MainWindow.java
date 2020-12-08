package Bchaises;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{

    private JButton playButton;
    private JPanel MainContent;
    private JButton prevButton;
    private JButton pauseButton;
    private JButton nextButton;
    private JLabel pauseLabel;
    private JLabel playLabel;
    private JLabel previousLabel;
    private JLabel nextLabel;
    private JSlider slider1;
    private JLabel titre;
    private JLabel album;
    private JLabel artiste;
    private JLabel genre;
    private Playlist playlist;
    private int cpt;

    MainWindow(){
        super();
        this.setContentPane(MainContent);
        this.pack();
        this.cpt = 0;
        this.playlist = new Playlist();

        Chanson c1 = new Chanson(1,"Danse dans la cagibi","patate douce","Lait entier","rock",180);
        Chanson c2 = new Chanson(2, "céréales dans tes chaussures", "pascal oubispou","Patrac","electro",180);
        Chanson c3 = new Chanson(3, "La danse de la chaise","BenjiLaChaise","Chaises","pop",180);

        this.playlist.add(c1);
        this.playlist.add(c2);
        this.playlist.add(c3);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpt--;
                init();
            }
        });


        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpt++;
                init();
            }
        });
    }

    //setter
    public void setPlaylist(Playlist p) { this.playlist = p; }

    //getter
    public Playlist getPlaylist() { return this.playlist; }

    public void init(){
        Chanson son = new Chanson();
        son = playlist.get(cpt);

        this.titre.setText(son.getTitre());
        this.album.setText(son.getAlbum());
        this.artiste.setText(son.getArtiste());
        this.genre.setText(son.getGenre());
    }

}
