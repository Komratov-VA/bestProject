package com.example.bestProject.controller;

import com.example.bestProject.service.EmailService;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    EmailService emailService;

    @GetMapping
    public String mainPage(@RequestParam(defaultValue = "seva")
                                       String name){
//        emailService.sendSimpleMessage("seva1996@ya.ru","первое письмо"
//                ,"сева у тебя все впереди");
        String lowerCaseLetters = RandomStringUtils.
                random(6, 97, 122, true, true, null, new SecureRandom());
        return  lowerCaseLetters;
    }

    public static void main(String[] args) {
        String s = "ssd";
        String[] sm = s.split("");
        List<String> list = new ArrayList<String>();
        System.out.println(s.split(""));
    }
}
