package HeadFirstJava.chapter16;

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {

        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword"});
        GameCharacter two = new GameCharacter(70, "Orc", new String[] {"bow", "sword"});
        GameCharacter three = new GameCharacter(100, "Hero", new String[] {"bow", "sword"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("foo.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("foo.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("one type: " + oneRestore.getType());
            System.out.println("two type: " + twoRestore.getType());
            System.out.println("three type: " + threeRestore.getType());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class GameCharacter implements Serializable {

        private final int power;
        private final String type;
        private final String[] weapons;

        public GameCharacter(int power, String type, String[] weapons) {
            this.power = power;
            this.type = type;
            this.weapons = weapons;
        }

        public int getPower() {
            return power;
        }

        public String getType() {
            return type;
        }

        public String[] getWeapons() {
            return weapons;
        }
    }
}
