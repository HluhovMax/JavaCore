package com.shildt.chapter2021.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class InputStreamEnumeration implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumeration(Vector<String> files) {
        this.files = files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        }catch (IOException e) {
            return null;
        }
    }
}
