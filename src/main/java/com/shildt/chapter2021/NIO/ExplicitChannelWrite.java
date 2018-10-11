package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\test.txt"),
                             StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();
            fChan.write(buffer);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
