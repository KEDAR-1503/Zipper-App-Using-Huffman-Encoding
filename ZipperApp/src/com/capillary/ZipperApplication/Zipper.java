package com.capillary.ZipperApplication;

import java.util.Map;

public class Zipper implements  IZipper{

    @Override
    public String compressing(String inputFile) {
        ICompression iCompression = new Compression();
        Map<Character,Integer> charCount = iCompression.charCounter(inputFile);
        Huffman root = iCompression.makeHuffmanTree(charCount);
        Map<Character,String> codeMap = iCompression.makeMapOfCode(root);
        String encodedFile = iCompression.compressData(codeMap);
        return encodedFile;
    }

    @Override
    public String extracting(String encodedFile) {
        IExtraction iExtraction = new Extraction();
        Map<Character,String> decoderMap = iExtraction.extractMap(encodedFile);
        String decodedFile = iExtraction.decodeData(decoderMap);
        return decodedFile;
    }
}
