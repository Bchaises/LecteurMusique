package Bchaises;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Chanson c = new Chanson();
        Playlist p = new Playlist();

        p.add(c);

        JFrame laFenetre = new MainWindow();
        laFenetre.setVisible(true);

        laFenetre.getPlaylist().add(c);
    }
}
