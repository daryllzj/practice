package HeadFirstJava.chapter14;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MiniMusicPlayer3 {

    private MyDrawPanel panel;
    private static final Random random = new Random();

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGui(){
        JFrame jFrame = new JFrame("My first music video");
        panel = new MyDrawPanel();
        jFrame.setContentPane(panel);
        jFrame.setBounds(30,30,300,300);
        jFrame.setVisible(true);
    }

    public void go(){

        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequencer.addControllerEventListener(panel ,new int[]{127});

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int note;
            for (int i = 0; i < 60; i+=4) {
                note = random.nextInt(50)+1;
                track.add(makeEvent(ShortMessage.NOTE_ON, 1, note, 100, i));
                track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, 1));
                track.add(makeEvent(ShortMessage.NOTE_OFF, 1, note, 100, i +2));
            }

            sequencer.setSequence(sequence);
            sequencer.start();
            sequencer.setTempoInBPM(120);
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

    static class MyDrawPanel extends JPanel implements ControllerEventListener{

        private boolean msg = false;

        public void controlChange(ShortMessage event){
            msg = true;
            repaint();
        }
        public void paintComponent(Graphics g){

            if (msg){
                int red = random.nextInt(256);
                int blue = random.nextInt(256);
                int green = random.nextInt(256);
                g.setColor(new Color(red,green,blue));

                int h = random.nextInt(120) + 10;
                int w = random.nextInt(120) + 10;

                int x = random.nextInt(40) + 10;
                int y = random.nextInt(40) + 10;

                g.fillRect(x,y,w,h);
                msg = false;
                System.out.println("Control Change Event Received");
            }
        }
    }
}
