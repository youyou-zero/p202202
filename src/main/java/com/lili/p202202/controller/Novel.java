package com.lili.p202202.controller;

import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class Novel {
    public static void fun1(){
        System.out.println("hello "+new Date());
    }

    public static void main(String[] args) {
        fun1();
    }

}
