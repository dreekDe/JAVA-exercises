package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;


@ SuppressWarnings("unchecked")
public class SerializeArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));

        objectOutputStream.writeObject(numbers);
        objectOutputStream.close();


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"));
        ArrayList<Integer> numbersTwo = (ArrayList<Integer>) inputStream.readObject();

        for (int i = 0; i < numbersTwo.size(); i++) {
            System.out.println(numbersTwo.get(i));
        }
    }
}
