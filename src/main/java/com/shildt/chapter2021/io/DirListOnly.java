package com.shildt.chapter2021.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "src\\main\\java\\com\\shildt\\chapter2021\\io";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("txt");
        String[] s = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
