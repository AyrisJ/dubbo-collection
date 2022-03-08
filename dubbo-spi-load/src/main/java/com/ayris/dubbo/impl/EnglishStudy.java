package com.ayris.dubbo.impl;

import com.ayris.dubbo.service.Study;

public class EnglishStudy implements Study {
    @Override
    public String subject() {
        System.out.println("Study English");
        return "English";
    }
}
