package com.shildt.chapter2021.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("src\\main\\java\\com\\shildt\\chapter2021\\io\\file1.txt");
        files.addElement("src\\main\\java\\com\\shildt\\chapter2021\\io\\file2.txt");
        files.addElement("src\\main\\java\\com\\shildt\\chapter2021\\io\\file3.txt");
        InputStreamEnumeration ise = new InputStreamEnumeration(files);
        try (InputStream in = new SequenceInputStream(ise)) {
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
