package com.ayris.dubbo;

import com.ayris.dubbo.service.Travel;

import java.util.ServiceLoader;


public class TravelTest {

    public static void main(String[] args) {
        ServiceLoader<Travel> serviceLoader = ServiceLoader.load(Travel.class);
        for (Travel travel : serviceLoader) {
            travel.traffic();
        }
    }
}
