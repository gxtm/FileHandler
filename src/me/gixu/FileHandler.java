import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public void add() throws IOException {
        String fileName;
        Path path;
        String todo;
        path = Paths.get("");
        final String s = path.toAbsolutePath().toString();
        fileName = "TODO.list";
        FileWriter fileWriter = new FileWriter(s+"\\"+fileName.toString(),true);
        System.out.println("Enter your TODO");
        Scanner scanner = new Scanner(System.in);
        todo = scanner.nextLine();
        fileWriter.append("TODO:" + todo + "\n");
        fileWriter.close();
    }
    public void delete(String fileLocation) throws IOException {
            if (Files.exists(Path.of(fileLocation))){
                Files.deleteIfExists(Path.of(fileLocation));
                return;
            }
            else {
//                System.out.println("File does not exist");
                throw new FileNotFoundException("File not found");
            }
    }

    public void list(String fileLocation)throws FileNotFoundException,IOException {
        if (Files.exists(Path.of(fileLocation))) {
            FileReader fileReader = new FileReader(fileLocation);
            ArrayList<String> files = (ArrayList<String>) Files.readAllLines(Path.of(fileLocation), StandardCharsets.UTF_8);
            System.out.println(new String(String.valueOf(files)));
        } else if (Files.notExists(Path.of(fileLocation))) {
            throw new FileNotFoundException("File Not found");
        } else {
            throw new IOException("Wrong Input");
        }
    }

}
