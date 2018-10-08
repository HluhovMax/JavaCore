package com.shildt.chapter20.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class OnlyExt implements FilenameFilter {
    private String ext;

    OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
