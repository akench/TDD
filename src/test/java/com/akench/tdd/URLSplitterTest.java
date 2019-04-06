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
}