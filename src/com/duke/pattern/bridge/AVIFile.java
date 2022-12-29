package com.duke.pattern.bridge;

public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi 视频文件： " + fileName);
    }
}
