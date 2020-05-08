package com.lev.getorganized;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSearchApp {
    String path;
    String regex;
    String zipFileName;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }


    public void walkDirectory(String path){
        System.out.println("walk dir:" + path);
        searchFile(null);
        addFileToZip(null);
    }

    public void searchFile(File file){
        System.out.println("SearchFile: " + file);
    }

    public void addFileToZip(File file){
        System.out.println("SearchFile: " + file);
    }

    public void walkDirectoryJava8(String path) throws IOException {
        Files.walk(Paths.get(path))
                .forEach(f -> processFile(f.toFile()));
    }

    public void processFile(File file) {
        System.out.println("processFile " + file);
    }

}
