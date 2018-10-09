package com.shildt.chapter20.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Paths.get("src\\main\\java\\com\\shildt\\chapter20\\NIO\\test.txt"),
                             StandardOpenOption.WRITE,
                             StandardOpenOption.READ)) {
            MappedByteBuffer buffer =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
