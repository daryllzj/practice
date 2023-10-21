package MusicPlayer;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class MusicPlayer {

    public  void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("got sequencer");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play();
    }
}
