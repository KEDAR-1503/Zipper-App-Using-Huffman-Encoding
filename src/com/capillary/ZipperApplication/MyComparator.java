package com.capillary.ZipperApplication;

import java.util.Comparator;

public class MyComparator implements Comparator<Huffman> {
    @Override
    public int compare(Huffman o1, Huffman o2) {
        return o1.frequency - o2.frequency;
    }
}
