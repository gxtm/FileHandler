package me.gixu;

import me.gixu.utils.Add;
import me.gixu.utils.Delete;
import me.gixu.utils.Help;
import me.gixu.utils.List;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        String input = scanner.next();
        if (input.equalsIgnoreCase("delete")||input.equalsIgnoreCase("remove")){
            String currentDir = System.getProperty("user.dir");
            Delete delete = new Delete();
            delete.remove(currentDir+"\\TODO.list");
        }
        else if ((input.equalsIgnoreCase("add"))){
            Add add = new Add();
            add.add();
        }
        else if (input.equalsIgnoreCase("help")){
            Help help = new Help();
            help.help();
        } else if (input.equalsIgnoreCase("list")) {
            me.gixu.utils.List list = new List();
            list.listInCurrentDir();
        }
        else {
            throw new IOException("Command Not Found");
        }
    }
}
