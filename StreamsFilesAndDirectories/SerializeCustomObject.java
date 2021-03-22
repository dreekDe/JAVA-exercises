package StreamsFilesAndDirectories;

import java.io.*;

public class SerializeCustomObject {

    public static class Course implements Serializable{
        private String name;
        private int students;

        public Course(String name, int students) {
            this.name = name;
            this.students = students;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Course course = new Course("JAVA- Advanced", 10000);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
        objectOutputStream.writeObject(course);


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"));

       Course courseTwo = (Course) inputStream.readObject();

        System.out.println(courseTwo.name);
        System.out.println(courseTwo.students);

        objectOutputStream.close();
    }
}
