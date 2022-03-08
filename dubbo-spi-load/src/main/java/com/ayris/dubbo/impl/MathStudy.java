package com.ayris.dubbo.impl;

import com.ayris.dubbo.service.Study;

public class MathStudy implements Study {

    @Override
    public String subject() {
        System.out.println("Study Math!");
        return "Math";
    }

}
