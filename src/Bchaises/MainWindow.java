package Bchaises;

import javax.swing.*;

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
    private Playlist playlist;

    MainWindow(){
        super();
        this.setContentPane(MainContent);
        this.pack();
    }

    //setter
    public void setPlaylist(Playlist p) { this.playlist = p; }

    //getter
    public Playlist getPlaylist() { return this.playlist; }


}
