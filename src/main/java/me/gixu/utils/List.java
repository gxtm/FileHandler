package me.gixu.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class List {
    public void listInCurrentDir() throws IOException {
        try {
            String currentDir = System.getProperty("user.dir")+"\\TODO.list";
            Scanner fileIn = new Scanner(new File(currentDir));
            while (fileIn.hasNextLine()){
                System.out.println(fileIn.nextLine().replace("TODO: ",""));
            }
            fileIn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
