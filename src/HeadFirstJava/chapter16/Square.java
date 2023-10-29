package HeadFirstJava.chapter16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Square implements Serializable {

    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Square square = new Square(50,20);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("foo.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(square);
            objectOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
