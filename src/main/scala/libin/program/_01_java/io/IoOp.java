package libin.program._01_java.io;

import java.io.File;
import java.io.IOException;

/**
 * Copyright (c) 2018/09/22. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class IoOp {
    public static void main(String[] args) {
        IoOp ioOp = new IoOp();
        ioOp.RileUtils();
    }

    private void RileUtils() {
        // this.FileCreate("test");
        // this.FileDelete("test");
        System.out.println(File.pathSeparator);  // 冒号
        System.out.println(File.separator);  // 右斜线
        // this.DirCreate("test");
        this.listFile();
    }

    /**
     * 创建文件
     */
    private void FileCreate(String fileName) {
        File file = new File("e:\\tmp\\" + fileName + ".txt");
        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     */
    private void FileDelete(String fileName) {
        File file = new File("e:\\tmp\\" + fileName + ".txt");
        //noinspection ResultOfMethodCallIgnored
        file.delete();
    }

    /**
     * 创建文件夹
     */
    private void DirCreate(String fileName) {
        File file = new File("e:\\tmp\\" + fileName);
        file.mkdir();
    }

    /**
     * 列出指定目录下文件名或路径
     */
    private void listFile() {
        File file = new File("e:\\tmp");
        // 列出文件或目录名字
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        // 列出文件或目录路径
        File[] files = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(files[i]);
        }
    }

}
