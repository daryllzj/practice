package HeadFirstJava.chapter14;

import javax.sound.midi.*;

public class MiniMusicPlayer2 {

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();

    }

    public void go(){

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventIWant = {127};
            sequencer.addControllerEventListener(event -> System.out.println("la") ,eventIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 80; i+=4) {
                track.add(makeEvent(ShortMessage.NOTE_ON, 1, i, 100, i));
                track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, 1));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 1, i, 100, i +2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static MidiEvent makeEvent(int cmd, int channel, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(cmd, channel, one, two);
            event = new MidiEvent(message,tick);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return event;
    }
}
