package com.capillary.ZipperApplication;

import java.util.Map;

public interface IExtraction {
    public Map<Character,String> extractMap(String extractedFile);

    public String decodeData(Map<Character,String> extractedMap);
}
