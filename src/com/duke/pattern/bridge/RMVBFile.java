package com.duke.pattern.bridge;

public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb 视频文件： " + fileName);
    }
}
