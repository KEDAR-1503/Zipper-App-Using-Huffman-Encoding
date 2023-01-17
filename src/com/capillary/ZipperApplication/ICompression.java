package com.capillary.ZipperApplication;

import java.util.Map;
import java.util.PriorityQueue;

public interface ICompression {
    void compress(String src, String dst);

    byte[] createZip(byte[] bytes);

    PriorityQueue<Huffman> getByteNodes(byte[] bytes);

    Huffman createHuffmanTree(PriorityQueue<Huffman> nodes);

    Map<Byte, String> getHuffCodes(Huffman root);

    void getHuffCodes(Huffman node, String code, StringBuilder sb1);

    byte[] zipBytesWithCodes(byte[] bytes, Map<Byte, String> huffCodes);
}
