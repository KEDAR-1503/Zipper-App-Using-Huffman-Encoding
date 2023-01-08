package com.capillary.ZipperApplication;

import java.util.Map;

public interface ICompression {
    public Map<Character,Integer> charCounter (String inputFile); // To make a frequency map.
    public Huffman makeHuffmanTree(Map<Character,Integer> charFrequency);//To build Huffman Tree

    public  Map<Character,String> makeMapOfCode(Huffman root); // To Store the code of each character.

    public String compressData(Map<Character,String> huffmanCodes);//To print the codes into a zip file.
}
