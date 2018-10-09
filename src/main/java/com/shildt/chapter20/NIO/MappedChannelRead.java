package com.shildt.chapter20.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Paths.get("src\\main\\java\\com\\shildt\\chapter20\\NIO\\test.txt"))) {
            long fSize = fChan.size();
            MappedByteBuffer buffer = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) buffer.get());
            }
            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
