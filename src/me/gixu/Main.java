

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("");
        final String s = path.toAbsolutePath().toString();
        System.out.println("Enter what do you want to do");
        String inp = scanner.next();
        if (inp.equalsIgnoreCase("add")){
            fileHandler.add();
            System.out.println();
        }
        else if (inp.equalsIgnoreCase("delete")) {
            fileHandler.delete(s+"\\TODO.list");
        }
        else if(inp.equalsIgnoreCase("list")){
            fileHandler.list(s+"\\TODO.list");
        }
        else {
            throw new RuntimeException("Wrong Input");
        }

    }
}
