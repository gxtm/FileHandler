package me.gixu.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Add {
    public void add() throws IOException {
//            String todo = scanner.nextLine();
            String currentDir = System.getProperty("user.dir");
            FileWriter fileWriter = new FileWriter(currentDir+"\\TODO.list",true);
//            FileReader fileReader = new FileReader("C:\\Code_With_Meow\\TODO.list");
            System.out.println("Enter your TODO");
            Scanner scanner =new Scanner(System.in);
            String todo = scanner.nextLine();
            fileWriter.append("TODO: "+todo+ "\n");
            fileWriter.close();
//            System.out.println(fileReader.read());
        }

    }
