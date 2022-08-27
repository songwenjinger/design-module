package com.mode.no09_proxy_demo.test;

import com.mode.no09_proxy_demo.code.Image;
import com.mode.no09_proxy_demo.code.ProxyImage;

public class ProxyTest {

    public static void main(String[] args) {
        Image image=new ProxyImage("aaa.jpg");
        image.display();


    }
}
