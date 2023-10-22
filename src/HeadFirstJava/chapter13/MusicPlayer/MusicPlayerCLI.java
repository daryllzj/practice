package HeadFirstJava.chapter13.MusicPlayer;

import javax.sound.midi.*;

public class MusicPlayerCLI {

    public static void main(String[] args) {
        MusicPlayerCLI musicPlayer = new MusicPlayerCLI();

        System.out.println("starting music");

        if (args.length < 2){
            System.out.println("add args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            musicPlayer.play(instrument, note);
        }

        System.out.println("ending music");
    }

    public  void play(int instrument, int note){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ,4);
            Track track = sequence.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(ShortMessage.PROGRAM_CHANGE, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(msg1,1);
            track.add(changeInstrument);

            ShortMessage msg2 = new ShortMessage();
            msg1.setMessage(ShortMessage.NOTE_OFF, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(msg2,1);
            track.add(noteOn);

            ShortMessage msg3 = new ShortMessage();
            msg1.setMessage(ShortMessage.NOTE_OFF, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(msg3,16);
            track.add(noteOff);

            sequencer.setSequence(sequence);
            sequencer.start();


        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
