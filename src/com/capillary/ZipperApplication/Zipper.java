package com.capillary.ZipperApplication;

import java.util.Map;

public class Zipper implements  IZipper{
    @Override
    public void compressing(String inputFile, String destinationFile) {
        ICompression iCompression = new compression();
        iCompression.compress(inputFile,destinationFile);
    }

    @Override
    public void extracting(String compressedFile, String extractedFile) {
        IExtraction iExtraction = new Extraction();
        iExtraction.decompress(compressedFile,extractedFile);
    }
}
