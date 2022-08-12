package me.gixu.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    private void delete(String fileLocation,String a) throws IOException {
        try{
            String currentDir = System.getProperty("user.dir")+"\\TODO.list";
            Scanner fileIn = new Scanner(new File(currentDir));
            while (fileIn.hasNextLine()){
                ArrayList editedString = new ArrayList<String>();
                editedString.add(fileIn.nextLine());
                if (editedString.contains(a)){
                    editedString.remove(editedString.indexOf(a));
                }
                else {
                    System.out.println("TODO not found");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void remove(String fileLocation,String a) throws IOException {
        delete(fileLocation,a);
    }

}
