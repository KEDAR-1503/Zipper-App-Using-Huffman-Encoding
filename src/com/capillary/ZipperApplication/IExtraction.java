package com.capillary.ZipperApplication;

import java.util.Map;

public interface IExtraction {
    void decompress(String src, String dst);
    byte[] decomp(Map<Byte, String> huffmanCodes, byte[] huffmanBytes);
    String convertbyteInBit(boolean flag, byte b);
}
