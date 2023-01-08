package com.capillary.ZipperApplication;

import java.util.Scanner;

public class ZipperApp {
    public static void main(String[] args) {
        String inputFile = new String();
        String encodedFile = new String();
        String extractedFile = new String();
        Scanner read = new Scanner(System.in);
        inputFile = read.next();
        IZipper iZipper = new Zipper();
        encodedFile = iZipper.compressing(inputFile);
        System.out.println("The encoded file is : " + encodedFile);
        extractedFile = iZipper.extracting(encodedFile);
        System.out.println("The decoded file is : " + extractedFile);
    }
}
