package com.ayris.dubbo.impl;

import com.ayris.dubbo.service.Travel;

public class SubwayTravel implements Travel {

    @Override
    public void traffic() {
        System.out.println("travel by subway!");
    }
}
