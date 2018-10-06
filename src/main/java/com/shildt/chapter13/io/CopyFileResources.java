package com.shildt.chapter13.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class CopyFileResources {
    public static void main(String[] args) throws IOException{
        int i;
        File f = new File("src\\main\\java\\com\\shildt\\chapter13\\io\\newFileCopy.txt");
        try (FileInputStream fin = new FileInputStream(ShowFileResources.f);
             FileOutputStream fout = new FileOutputStream(f)) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
