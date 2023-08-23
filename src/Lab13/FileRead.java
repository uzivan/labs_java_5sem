package Lab13;

import java.io.*;
import java.util.Scanner;

public class FileRead {

    public static void FileRead() {
        try(FileReader fileReader = new FileReader("/home/ivan/Рабочий стол/hello"); Scanner in = new Scanner(fileReader);){
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
