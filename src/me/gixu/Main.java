package me.gixu;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what do you want to do");
        String inp = scanner.next();
        if (inp.equalsIgnoreCase("add")){
            fileHandler.add();
            System.out.println();
        }
        else if (inp.equalsIgnoreCase("delete")) {
            fileHandler.delete("C:\\Code_With_Meow\\TODO.list");
        }
        else if(inp.equalsIgnoreCase("list")){
            fileHandler.list("C:\\Code_With_Meow\\TODO.list");
        }
        else {
            throw new RuntimeException("Wrong Input");
        }

    }
}
