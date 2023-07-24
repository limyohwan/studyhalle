package com.yohwan.study.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelExample {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("hello.txt")) {
            FileChannel channel = stream.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int data;
            while ((data = channel.read(buffer)) != -1) {
                buffer.flip();
                System.out.print(new String(buffer.array(), 0, data));
                buffer.clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
