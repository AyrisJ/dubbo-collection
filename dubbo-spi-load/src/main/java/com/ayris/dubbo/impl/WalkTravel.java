package com.ayris.dubbo.impl;

import com.ayris.dubbo.service.Travel;

public class WalkTravel implements Travel {

    @Override
    public void traffic() {
        System.out.println("travel by walk!");
    }
}
