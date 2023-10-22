package HeadFirstJava.chapter13.MusicPlayer;

import javax.sound.midi.*;

public class MusicPlayer {

    public  void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ,4);

            Track track = sequence.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(ShortMessage.NOTE_ON, 1, 102, 100);
            MidiEvent noteOn = new MidiEvent(msg1,1);
            track.add(noteOn);

            ShortMessage msg2 = new ShortMessage();
            msg1.setMessage(ShortMessage.NOTE_OFF, 1, 30, 100);
            MidiEvent noteOff = new MidiEvent(msg2,16);
            track.add(noteOff);

            sequencer.setSequence(sequence);

            sequencer.start();


        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        System.out.println("starting music");
        musicPlayer.play();
    }
}
