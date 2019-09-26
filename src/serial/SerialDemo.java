package serial;

import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Person p = (Person) ois.readObject();
        ois.close();
        System.out.println(p);

    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        Person p = new Person("小林", 30);
        oos.writeObject(p);
        oos.close();
    }
}
