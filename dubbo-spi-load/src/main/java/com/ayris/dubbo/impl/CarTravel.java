package com.ayris.dubbo.impl;

import com.ayris.dubbo.service.Travel;

public class CarTravel implements Travel {

    @Override
    public void traffic() {
        System.out.println("travel by car!");
    }
}
