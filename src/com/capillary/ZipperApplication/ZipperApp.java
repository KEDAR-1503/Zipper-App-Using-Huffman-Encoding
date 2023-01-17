package com.capillary.ZipperApplication;

import java.util.Scanner;

public class ZipperApp {
    public static void main(String[] args) {
        String inputFileLocation = new String("C:\\Users\\KEDAR C PAI\\Desktop\\textFile.txt");
        String compressedFileLocation = new String("C:\\Users\\KEDAR C PAI\\Desktop\\compressedFile.txt");
        String deCompressedFile = new String("C:\\Users\\KEDAR C PAI\\Desktop\\decompressedFile.txt");
        IZipper iZipper = new Zipper();
        iZipper.compressing(inputFileLocation,compressedFileLocation);
        iZipper.extracting(compressedFileLocation,deCompressedFile);
    }
}
