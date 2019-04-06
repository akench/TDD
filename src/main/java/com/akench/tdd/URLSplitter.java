package com.akench.tdd;

public class URLSplitter {

    //      https://www.google.com/hi
    public String[] split(String url) {

        String[] arr = new String[3];
        String[] protocolAndRest = url.split("://");
        arr[0] = protocolAndRest[0];

        int slashIndex = protocolAndRest[1].indexOf('/');
        arr[1] = protocolAndRest[1].substring(0, slashIndex);
        arr[2] = protocolAndRest[1].substring(slashIndex + 1);

        return arr;
    }
}
