package com.capillary.ZipperApplication;

public interface IZipper {

    public void compressing(String inputFile,String destinationFile);

    public void extracting(String compressedFile,String extractedFile);


}
