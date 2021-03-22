package StreamsFilesAndDirectories;


import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class GetFolderSize {
    public static void main(String[] args) {

        String path = "C:\\Users\\isk\\IdeaProjects\\Stack and Queues\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

//        Deque<File> deque = new ArrayDeque<>();
//
        File file = new File(path);
//        deque.offer(file);
//
        long sum = 0;
        for (File file1 : file.listFiles()) {
//        while (!deque.isEmpty()) {
//            File poll = deque.poll();
//            File[] files = poll.listFiles();
//            for (File file1 : files) {
            sum += file1.length();
//            }
        }
        System.out.println("Folder size: " + sum);
    }
}
