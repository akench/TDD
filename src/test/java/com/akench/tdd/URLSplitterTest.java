package com.akench.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class URLSplitterTest {

    private URLSplitter urlSplitter;

    @Before
    public void setup() {
        urlSplitter = new URLSplitter();
    }

    @Test
    public void checkLength() {
        String[] arr = urlSplitter.split("http://www.google.com/");
        Assert.assertEquals(3, arr.length);
    }

    @Test
    public void checkHttp() {
        String[] arr = urlSplitter.split("http://www.google.com/");
        Assert.assertEquals("http", arr[0]);
    }

    @Test
    public void checkDomain() {
        String[] arr = urlSplitter.split("http://www.google.com/");
        Assert.assertEquals("www.google.com", arr[1]);
    }

    @Test
    public void checkPath() {
        String[] arr = urlSplitter.split("http://www.google.com/hi/bye");
        Assert.assertEquals("hi/bye", arr[1]);
    }
}