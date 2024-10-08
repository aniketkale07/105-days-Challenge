import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        
    // Create a new file 

File file = new File("myfile.txt"); 

// try {
//     file.createNewFile();
// } catch (Exception e) {
//     // TODO: handle exception
//     System.out.println("unable to create  new file");
// }

// Write a file

// FileWriter fileWriter = new FileWriter("myfile.txt");
//     fileWriter.write("THis is file created with file Writer in Day 9 ");
//         fileWriter.close();
//


        FileReader fileReader = new FileReader("myfile.txt");
        fileReader.read();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        fileReader.close();

        file.delete();
}

}
