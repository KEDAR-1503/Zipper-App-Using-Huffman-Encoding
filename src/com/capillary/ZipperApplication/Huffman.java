package com.capillary.ZipperApplication;

public class Huffman implements Comparable<Huffman>{

        Byte data;
        int frequency;
        Huffman left;
        Huffman right;

        public Huffman(Byte data, int weight)
        {
            this.data=data;
            this.frequency=weight;
        }

    @Override
    public int compareTo(Huffman o) {
        return this.frequency - o.frequency;
    }
}
