package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\test.txt"))) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        }catch (InvalidPathException e) {
            System.out.println("path Error " + e);
            return;
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
