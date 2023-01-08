package com.capillary.ZipperApplication;

import java.util.Map;

public class Compression implements ICompression{
    @Override
    public Map<Character, Integer> charCounter(String inputFile) {
        return null;
    }

    @Override
    public Huffman makeHuffmanTree(Map<Character, Integer> charFrequency) {
        return null;
    }

    @Override
    public Map<Character, String> makeMapOfCode(Huffman root) {
        return null;
    }

    @Override
    public String compressData(Map<Character, String> huffmanCodes) {
        return null;
    }
}
